package com.example.mvp_example.code.portfolio_menu.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import com.example.mvp_example.R
import com.example.mvp_example.code.asset_table.presenter.IAssetTablePresenter
import com.example.mvp_example.code.asset_table.view.AssetTableView
import com.example.mvp_example.code.general_params_portfolio.view.GeneralPortfolioParamsView
import com.example.mvp_example.databinding.PortfolioMenuBinding

class PortfolioMenuView : AppCompatActivity(), IPortfolioMenuView {
    private lateinit var _layout: PortfolioMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _layout = PortfolioMenuBinding.inflate(layoutInflater)
        setContentView(_layout.root)


        supportFragmentManager.beginTransaction().replace(
            R.id.general_params_container,
            GeneralPortfolioParamsView.newInstance()
        ).commit()

        var assetTabView = AssetTableView.newInstance();

        supportFragmentManager.beginTransaction().replace(
            R.id.assets_table,
            assetTabView
        ).commit()

        connectNavigationToPresenter(assetTabView.Presenter)
    }

    override fun connectNavigationToPresenter(presenter: IAssetTablePresenter) {
        _layout.navigation.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.assets -> {presenter.onAllAssetsButtonClicked()}
                R.id.stocks -> {presenter.onStocksButtonClicked()}
                R.id.crypto -> {presenter.onCryptoButtonClicked()}
                R.id.bonds -> {presenter.onBoundsButtonClicked()}
            }
        }
    }
}