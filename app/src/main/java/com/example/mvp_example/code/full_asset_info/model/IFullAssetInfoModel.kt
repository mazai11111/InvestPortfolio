package com.example.mvp_example.code.full_asset_info.model

import com.example.mvp_example.code.full_asset_info.model.objects.AssetFull


interface IFullAssetInfoModel {
    public fun takeData(id: String): AssetFull;
}