package com.example.mvp_example.code.full_asset_info.Dicontainer

import com.example.mvp_example.code.full_asset_info.model.FullAssetInfoModel
import com.example.mvp_example.code.full_asset_info.model.IFullAssetInfoModel
import com.example.mvp_example.code.full_asset_info.presenter.FullAssetInfoPresenter
import com.example.mvp_example.code.full_asset_info.presenter.IFullAssetInfoPresenter
import org.koin.dsl.module

val fullAssetInfoModel = module {
    single<IFullAssetInfoModel> {
        FullAssetInfoModel()
    }

    single<IFullAssetInfoPresenter> {
        FullAssetInfoPresenter(get())
    }
}
