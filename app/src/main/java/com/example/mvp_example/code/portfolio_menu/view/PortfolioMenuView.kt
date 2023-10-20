package com.example.mvp_example.code.portfolio_menu.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvp_example.R
import com.example.mvp_example.code.Base.INavigationToPresenterConnector
import com.example.mvp_example.code.asset_table.presenter.IAssetTablePresenter
import com.example.mvp_example.code.asset_table.view.AssetTableView
import com.example.mvp_example.code.general_params_portfolio.view.GeneralPortfolioParamsView
import com.example.mvp_example.code.portfolio_menu.navigationConnector.PortfolioMenuNavigationToPresenterConnector
import com.example.mvp_example.databinding.PortfolioMenuBinding

class PortfolioMenuView : AppCompatActivity(), IPortfolioMenuView {
    private lateinit var _layout: PortfolioMenuBinding

    private lateinit var _navigationConnector: INavigationToPresenterConnector<PortfolioMenuBinding, IAssetTablePresenter>;
    private lateinit var  assetTabView: AssetTableView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init();
    }

    private fun init(){
        _navigationConnector = PortfolioMenuNavigationToPresenterConnector();

        startFragments();
        connectNavigation(assetTabView.Presenter);
    }

    override fun connectNavigation(presenter: IAssetTablePresenter) {
        _navigationConnector.connect(_layout, presenter)
    }

    private fun startFragments(){
        _layout = PortfolioMenuBinding.inflate(layoutInflater)

        setContentView(_layout.root)

        supportFragmentManager.beginTransaction().replace(
            R.id.general_params_container,
            GeneralPortfolioParamsView.newInstance()
        ).commit()

        assetTabView = AssetTableView.newInstance();

        supportFragmentManager.beginTransaction().replace(
            R.id.assets_table,
            assetTabView
        ).commit()
    }
}