package com.example.mvp_example.code.asset_table.presenter

import com.example.mvp_example.code.Base.IBasePresenter
import com.example.mvp_example.code.asset_table.view.IAssetTableView

interface IAssetTablePresenter:IBasePresenter {
    public fun onViewLoaded();
    public fun attachView(view: IAssetTableView)
    public fun onAllAssetsButtonClicked();
    public fun onStocksButtonClicked();
    public fun onCryptoButtonClicked();
    public fun onBoundsButtonClicked();
}