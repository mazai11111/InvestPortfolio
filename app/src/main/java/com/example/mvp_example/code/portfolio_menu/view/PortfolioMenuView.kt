package com.example.mvp_example.code.portfolio_menu.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mvp_example.R
import com.example.mvp_example.code.Statistic.View.StatisticActivity
import com.example.mvp_example.code.asset_table.view.AssetTableView
import com.example.mvp_example.code.general_params_portfolio.view.GeneralPortfolioParamsView
import com.example.mvp_example.databinding.PortfolioMenuBinding

class PortfolioMenuView : AppCompatActivity(){
    private lateinit var _layout: PortfolioMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init();
    }

    private fun init(){

        startFragments();
        subNavigationButtons();
    }

    private fun subNavigationButtons(){
        val buttonOpenNewActivity = findViewById<Button>(R.id.statistic_button)

        buttonOpenNewActivity.setOnClickListener {
            val intent = Intent(this@PortfolioMenuView, StatisticActivity::class.java)

            startActivity(intent)
        }
    }

    private fun startFragments(){
        _layout = PortfolioMenuBinding.inflate(layoutInflater)

        setContentView(_layout.root)

        val transaction = supportFragmentManager.beginTransaction()

        transaction.replace(
            R.id.assets_table,
            AssetTableView()
        )
        transaction.replace(
            R.id.general_params_container,
            GeneralPortfolioParamsView()
        )

        transaction.commitNowAllowingStateLoss()
    }
}