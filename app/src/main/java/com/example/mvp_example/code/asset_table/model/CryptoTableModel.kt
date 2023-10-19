package com.example.mvp_example.code.asset_table.model

import com.example.mvp_example.R
import com.example.mvp_example.code.asset_table.model.objects.AssetTable

class CryptoTableModel: IAssetTableModel {
    override fun takeData(): ArrayList<AssetTable> {
        val items: ArrayList<AssetTable> = arrayListOf(
            AssetTable(R.drawable.btc, "Bitcoin", "BTC", 0.0352f, 2764120.04f, 36778.85f, 111.89f),
            AssetTable(R.drawable.etherium, "Etherium", "ETH", 0.4386f, 2768123.78f, 120521.81f, 205.15f),
            AssetTable(R.drawable.matic, "Polygon", "MATIC", 0.062f, 49.58f, -0.01f, -47.67f),
            AssetTable(R.drawable.sol, "Solana", "SOL", 10f, 2360.54f, 7967.88f, 50.95f),
            AssetTable(R.drawable.usdt, "Tether", "USDT", 132.016f, 97.14f, 8676.22f, 41.02f),
            AssetTable(R.drawable.usdc, "USD Coin", "USDT", 511.28f, 97.14f, 9567.81f, 47.75f)
        )

        return items;
    }
}