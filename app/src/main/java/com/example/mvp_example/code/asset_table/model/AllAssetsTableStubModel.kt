package com.example.mvp_example.code.asset_table.model

import com.example.mvp_example.R
import com.example.mvp_example.code.asset_table.model.objects.AssetTable

class AllAssetsTableStubModel: IAssetTableModel {
    override fun takeData(): ArrayList<AssetTable> {
        val items: ArrayList<AssetTable> = arrayListOf(
            AssetTable(R.drawable.anet, "Arista\nNetwork Inc.",  18836.79f, 1215.60f, 14.1f),
            AssetTable(R.drawable.mnst, "Monster\nBeverage\nCorporation",4856.85f, 207.41f, 13.5f),
            AssetTable(R.drawable.lvs, "Las Vegas\nSands Corp.",   4516.87f, 3367.51f, 7.34f),
            AssetTable(R.drawable.hsy, "The Hershey\nCompany",  18717.38f, -2218.98f, -4.80f),
            AssetTable(R.drawable.btc, "Bitcoin",27410.04f, 36778.85f, 111.89f),
            AssetTable(R.drawable.etherium, "Etherium", 27681.78f, 12051.81f, 205.15f),
            AssetTable(R.drawable.matic, "Polygon",   49.58f, -0.01f, -47.67f),
            AssetTable(R.drawable.sol, "Solana",  2360.54f, 7967.88f, 50.95f),
            AssetTable(R.drawable.usdt, "Tether",  97.14f, 8676.22f, 41.02f),
            AssetTable(R.drawable.usdc, "USD Coin",   97.14f, 9567.81f, 47.75f),
            AssetTable(R.drawable.usdc, "USD Coin",   97.14f, 9567.81f, 47.75f),
            AssetTable(R.drawable.usdc, "USD Coin",   22.14f, 953367.81f, 47.75f),
            AssetTable(R.drawable.btc, "Bitcoin",2743310.04f, 36778.85f, 1111.89f),


        )

        return items;
    }
}