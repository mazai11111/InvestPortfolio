package com.example.mvp_example.code.portfolio_menu.navigationConnector

import com.example.mvp_example.R
import com.example.mvp_example.code.Base.INavigationToPresenterConnector
import com.example.mvp_example.code.asset_table.presenter.IAssetTablePresenter
import com.example.mvp_example.databinding.PortfolioMenuBinding

class PortfolioMenuNavigationToPresenterConnector: INavigationToPresenterConnector<PortfolioMenuBinding, IAssetTablePresenter> {
    override fun connect(layout:PortfolioMenuBinding, presenter:IAssetTablePresenter) {
        layout.navigation.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.assets -> {presenter.onAllAssetsButtonClicked()}
                R.id.stocks -> {presenter.onStocksButtonClicked()}
                R.id.crypto -> {presenter.onCryptoButtonClicked()}
                R.id.bonds -> {presenter.onBoundsButtonClicked()}
            }
        }
    }
}