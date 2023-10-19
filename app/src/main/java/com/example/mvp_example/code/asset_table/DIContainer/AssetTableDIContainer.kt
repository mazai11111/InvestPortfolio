package com.example.mvp_example.code.asset_table.DIContainer

import com.example.mvp_example.code.asset_table.model.AssetTableStubModel
import com.example.mvp_example.code.asset_table.model.IAssetTableModel
import com.example.mvp_example.code.asset_table.presenter.AssetTablePresenter
import com.example.mvp_example.code.asset_table.presenter.IAssetTablePresenter
import org.koin.dsl.module

val assetTableModule = module {
    single<IAssetTableModel> {
        AssetTableStubModel()
    }

    single<IAssetTablePresenter> {
        AssetTablePresenter(get())
    }
}