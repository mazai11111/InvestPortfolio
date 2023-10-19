package com.example.mvp_example.code.asset_table.presenter

import com.example.mvp_example.code.Base.IBasePresenter
import com.example.mvp_example.code.asset_table.view.IAssetTableView

interface IAssetTablePresenter:IBasePresenter {
    public fun attachView(view: IAssetTableView)
}