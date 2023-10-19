package com.example.mvp_example.code.asset_table.model

import com.example.mvp_example.R
import com.example.mvp_example.code.asset_table.model.objects.AssetTable

class BoundsTableModel: IAssetTableModel {
    override fun takeData(): ArrayList<AssetTable> {
        val items: ArrayList<AssetTable> = arrayListOf(
            AssetTable(R.drawable.etherium, "Etherium", "ETH", 0.4386f, 27623.78f, 1221.81f, 205.15f),
            AssetTable(R.drawable.usdc, "USD Coin", "USDT", 511.28f, 97.14f, 9567.81f, 47.75f),
            AssetTable(R.drawable.btc, "Bitcoin", "BTC", 0.0352f, 27640.04f, 3678.85f, 111.89f),
            AssetTable(R.drawable.sol, "Solana", "SOL", 10f, 2360.54f, 7967.88f, 50.95f),
            AssetTable(R.drawable.anet, "Arista\nNetwork Inc.", "ANET", 0f, 18836.79f, 12145.60f, 14.43f),
        )

        return items;
    }
}