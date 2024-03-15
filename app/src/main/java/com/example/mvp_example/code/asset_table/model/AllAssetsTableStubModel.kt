package com.example.mvp_example.code.asset_table.model

import com.example.mvp_example.R
import com.example.mvp_example.code.asset_table.model.objects.AssetTable

class AllAssetsTableStubModel: IAssetTableModel {
    override fun takeData(): ArrayList<AssetTable> {
        val items: ArrayList<AssetTable> = arrayListOf(
            AssetTable(R.drawable.tatneft, "Татнефть",  18836.79f, 1215.60f, 14.1f),
            AssetTable(R.drawable.sber, "Сбер",4856.85f, 207.41f, 13.5f),
            AssetTable(R.drawable.globaltrans, "Globaltrans\nInvest.",   4516.87f, 3367.51f, 7.34f),
            AssetTable(R.drawable.yandex, "Яндекс",  18717.38f, -2218.98f, -4.80f),
            AssetTable(R.drawable.novabaev, "Novabaev\ngroup",27410.04f, 36778.85f, 111.89f),
            AssetTable(R.drawable.lukoil, "Лукоил", 27681.78f, 12051.81f, 205.15f),
            AssetTable(R.drawable.segeja, "Сегежа",   49.58f, -0.01f, -47.67f),
            AssetTable(R.drawable.sovkom, "Совкомбанк",  2360.54f, 7967.88f, 50.95f),
            AssetTable(R.drawable.md, "Мать и дитя",  97.14f, 8676.22f, 41.02f),
            AssetTable(R.drawable.oak, "Объединенная\nавиастроительная\nкомпания",   97.14f, 9567.81f, 47.75f),
            AssetTable(R.drawable.severstal, "Северсталь",   97.14f, 9567.81f, 47.75f),
            AssetTable(R.drawable.ozon, "Ozon\nHoldings\nPLC",   22.14f, 953367.81f, 47.75f),
            AssetTable(R.drawable.skuf, "Совкомфлот",2743310.04f, 36778.85f, 1111.89f),


        )

        return items;
    }
}