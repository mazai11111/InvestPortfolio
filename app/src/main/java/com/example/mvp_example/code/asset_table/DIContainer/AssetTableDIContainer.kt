package com.example.mvp_example.code.asset_table.DIContainer

import com.example.mvp_example.code.asset_table.model.AllAssetsTableStubModel
import com.example.mvp_example.code.asset_table.model.IAssetTableModel
import com.example.mvp_example.code.asset_table.presenter.AssetTablePresenter
import com.example.mvp_example.code.asset_table.presenter.IAssetTablePresenter
import org.koin.dsl.module

val assetTableModule = module {
    single<IAssetTableModel> {
        AllAssetsTableStubModel()
    }

    single<IAssetTablePresenter> {
        AssetTablePresenter(get())
    }
}