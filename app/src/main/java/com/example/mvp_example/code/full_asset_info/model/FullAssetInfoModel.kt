package com.example.mvp_example.code.full_asset_info.model

import com.example.mvp_example.R
import com.example.mvp_example.code.full_asset_info.model.objects.AssetFull
import com.example.mvp_example.code.full_asset_info.model.objects.AssetFullDrawable
import java.util.Date


class FullAssetInfoModel: IFullAssetInfoModel {
    override fun takeData(id: String): AssetFull {
        val item:AssetFull = AssetFull(R.drawable.anet, "Yandex",
            "PLLC",
            1f,
            9964f,
            9.58f,
            "13.01.2020",
            1,
            10,
            2703f,
            2660.60f,
            1326f,
            26606f,
            40551f,
            23909f,
            2.31f,
            1.92f,
            -428f,
            10392f,
            0f,
            0f,
            9964f,
            9.58f
            )

        return item;
    }
}