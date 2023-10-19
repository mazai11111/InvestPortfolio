package com.example.mvp_example.code.asset_table.model

import com.example.mvp_example.code.asset_table.model.objects.AssetTable

interface IAssetTableModel {
    public fun takeData(): List<AssetTable>;
}