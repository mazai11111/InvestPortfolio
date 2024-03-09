package com.example.mvp_example.code.Statistic.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvp_example.R
import com.example.mvp_example.code.asset_table.view.AssetTableView
import com.example.mvp_example.code.categories.Model.Class.CategoryValue
import com.example.mvp_example.code.categories.View.CategoriesView
import com.example.mvp_example.code.deals_info.view.DealsInfoView
import com.example.mvp_example.code.general_params_portfolio.view.GeneralPortfolioParamsView
import com.example.mvp_example.databinding.ActivityStatisticBinding

class StatisticActivity : AppCompatActivity() {
    private lateinit var _layout: ActivityStatisticBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _layout = ActivityStatisticBinding.inflate(layoutInflater)

        init();
    }

    private fun init(){

        startFragments();
    }

    private fun startFragments(){
        setContentView(_layout.root)

        val transaction = supportFragmentManager.beginTransaction()

        transaction.replace(
            R.id.assets_table,
            AssetTableView()
        )
        transaction.replace(
                R.id.general_statistic,
               GeneralPortfolioParamsView()
            )

        transaction.replace(
            R.id.deals_container,
            DealsInfoView()
        )

        transaction.replace(
            R.id.categories_container,
            CategoriesView()
        )

        transaction.commitNowAllowingStateLoss()
    }
}