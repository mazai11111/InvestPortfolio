package com.example.mvp_example.code.full_asset_info.model.objects

import com.example.mvp_example.code.asset_table.model.objects.AssetTable
import java.util.Date

class AssetFull(
    imageResource: Int,
    fullName: String,
    shortName: String,
    count: Float,
    summaryProfit: Float,
    profitability: Float,
    private val _dateFirstTransaction: String,
    private val _lotSize: Int,
    private val _totalShares: Int,
    private val _averagePriceAtWholesalePosition: Float,
    currentPrise: Float,
    private val _plForDay: Float,
    private val _currentValue: Float,
    private val _costOfPurchases: Float,
    private val _salesValue: Float,
    private val _categoryShare: Float,
    private val _portfolioShare: Float,
    private val _currentProfit: Float,
    private val _profitOnTransactions: Float,
    private val _amountOfDividends: Float,
    private val _commissions: Float,
    private val _totalProfit:Float,
    private val _income: Float
) : AssetTable(
    imageResource,
    fullName,
    shortName,
    count,
    currentPrise,
    summaryProfit,
    profitability
) {

    val DateFirstTransaction: String
        get() = _dateFirstTransaction
    val LotSize: Int
        get() = _lotSize
    val TotalShares: Int
        get() = _totalShares
    val AveragePriceAtWholesalePosition: Float
        get() = _averagePriceAtWholesalePosition
    val PlForDay: Float
        get() = _plForDay
    val CurrentValue: Float
        get() = _currentValue
    val CostOfPurchases: Float
        get() = _costOfPurchases
    val SalesValue: Float
        get() = _salesValue
    val CategoryShare: Float
        get() = _categoryShare
    val PortfolioShare: Float
        get() = _portfolioShare
    val CurrentProfit: Float
        get() = _currentProfit
    val ProfitOnTransactions: Float
        get() = _profitOnTransactions
    val AmountOfDividends: Float
        get() = _amountOfDividends
    val Commissions: Float
        get() = _commissions
    val TotalProfit:Float
        get() = _totalProfit
    val Income: Float
        get() = _income
}