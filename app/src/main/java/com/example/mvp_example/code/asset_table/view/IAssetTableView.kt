package com.example.mvp_example.code.asset_table.view

import com.example.mvp_example.code.asset_table.model.objects.AssetTableDrawable

interface IAssetTableView {
    public fun renderNewTable(views:List<AssetTableDrawable>);

}