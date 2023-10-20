package com.example.mvp_example.code.portfolio_menu.view

import com.example.mvp_example.code.asset_table.presenter.IAssetTablePresenter

interface IPortfolioMenuView {
    fun connectNavigation(presenter:IAssetTablePresenter)
}