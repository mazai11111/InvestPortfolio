package com.example.mvp_example.portfolio_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvp_example.R

class PortfolioMenuView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.portfolio_menu)

        supportFragmentManager.beginTransaction().replace(R.id.general_params_container, GeneralPortfolioParamsView.newInstance()).commit()
    }
}