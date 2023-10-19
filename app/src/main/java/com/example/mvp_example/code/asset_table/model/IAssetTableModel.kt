package com.example.mvp_example.code.asset_table.model

import com.example.mvp_example.code.asset_table.model.objects.AssetTable
import com.example.mvp_example.code.asset_table.view.IAssetTableView

interface IAssetTableModel {
    public fun takeData(): ArrayList<AssetTable>;
}