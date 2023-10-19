package com.example.mvp_example.code.asset_table.presenter

import com.example.mvp_example.code.asset_table.model.IAssetTableModel
import com.example.mvp_example.code.asset_table.view.IAssetTableView

class AssetTablePresenter(private val _model: IAssetTableModel):IAssetTablePresenter {
    private var _view: IAssetTableView? = null;
}

