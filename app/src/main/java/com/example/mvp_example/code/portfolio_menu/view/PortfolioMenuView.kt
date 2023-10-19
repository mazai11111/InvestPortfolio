package com.example.mvp_example.code.portfolio_menu.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import com.example.mvp_example.R
import com.example.mvp_example.code.asset_table.view.AssetTableView
import com.example.mvp_example.code.general_params_portfolio.view.GeneralPortfolioParamsView

class PortfolioMenuView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.portfolio_menu)


        supportFragmentManager.beginTransaction().replace(
            R.id.general_params_container,
            GeneralPortfolioParamsView.newInstance()
        ).commit()

        supportFragmentManager.beginTransaction().replace(
            R.id.asset_table,
            AssetTableView.newInstance()
        ).commit()
    }
}