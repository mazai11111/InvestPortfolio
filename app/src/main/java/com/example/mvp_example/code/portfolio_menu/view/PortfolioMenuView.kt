package com.example.mvp_example.code.portfolio_menu.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvp_example.R
import com.example.mvp_example.code.general_params_portfolio.view.GeneralPortfolioParamsView

class PortfolioMenuView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.portfolio_menu)


        supportFragmentManager.beginTransaction().replace(R.id.general_params_container,
            GeneralPortfolioParamsView.newInstance()
        ).commit()
    }
}