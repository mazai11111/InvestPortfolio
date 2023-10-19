package com.example.mvp_example.code.entryPoint.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvp_example.R
import com.example.mvp_example.code.asset_table.DIContainer.assetTableModule
import com.example.mvp_example.code.general_params_portfolio.DIContainer.portfolioParamsModule
import com.example.mvp_example.code.portfolio_menu.view.PortfolioMenuView
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level

class EntryPointView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entry_point)

        initKoin();
        startFirstScreen();
    }

    private fun initKoin(){
        GlobalContext.startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@EntryPointView)
            modules(listOf(portfolioParamsModule,
                assetTableModule))
        }
    }

    private fun startFirstScreen(){
        val intent = Intent(this, PortfolioMenuView::class.java)
        startActivity(intent)
    }
}