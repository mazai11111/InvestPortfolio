package com.example.mvp_example.code.asset_table.presenter

import com.example.mvp_example.code.base.IBasePresenter
import com.example.mvp_example.code.asset_table.view.IAssetTableView

interface IAssetTablePresenter:IBasePresenter {
    public fun onViewLoaded();
    public fun attachView(view: IAssetTableView)
    public fun onAllAssetsButtonClicked();
}