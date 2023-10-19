package com.example.mvp_example.code.full_asset_info.presenter

import com.example.mvp_example.code.Base.IBasePresenter
import com.example.mvp_example.code.full_asset_info.View.IFullAssetInfoView

interface IFullAssetInfoPresenter: IBasePresenter {
    public fun attachView(view: IFullAssetInfoView)
    public fun onViewLoaded(id:String);
}