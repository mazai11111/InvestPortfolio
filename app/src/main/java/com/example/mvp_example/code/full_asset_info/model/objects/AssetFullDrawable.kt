package com.example.mvp_example.code.full_asset_info.model.objects

class AssetFullDrawable class DrawableAssetFull(
    private val _imageResource: String,
    private val _fullName: String,
    private val _shortName: String,
    private val _count: String,
    private val _currentPrise: String,
    private val _summaryProfit: String,
    private val _summaryProfitColor: String,
    private val _profitability: String,
    private val _dateFirstTransaction: String,
    private val _lotSize: String,
    private val _totalShares: String,
    private val _averagePriceAtWholesalePosition: String,
    private val _plForDay: String,
    private val _plForDayColor: String,
    private val _currentValue: String,
    private val _costOfPurchases: String,
    private val _salesValue: String,
    private val _categoryShare: String,
    private val _portfolioShare: String,
    private val _currentProfit: String,
    private val _currentProfitColor: String,
    private val _profitOnTransactions: String,
    private val _amountOfDividends: String,
    private val _commissions: String,
    private val _income: String,
) {

    val imageResource: String
        get() = _imageResource

    val fullName: String
        get() = _fullName

    val shortName: String
        get() = _shortName

    val count: String
        get() = _count

    val currentPrise: String
        get() = _currentPrise

    val summaryProfit: String
        get() = _summaryProfit

    val profitability: String
        get() = _profitability

    val dateFirstTransaction: String
        get() = _dateFirstTransaction

    val lotSize: String
        get() = _lotSize

    val totalShares: String
        get() = _totalShares

    val averagePriceAtWholesalePosition: String
        get() = _averagePriceAtWholesalePosition

    val plForDay: String
        get() = _plForDay

    val plForDayColor: String
        get() = _plForDayColor

    val currentValue: String
        get() = _currentValue

    val costOfPurchases: String
        get() = _costOfPurchases

    val salesValue: String
        get() = _salesValue

    val categoryShare: String
        get() = _categoryShare

    val portfolioShare: String
        get() = _portfolioShare

    val currentProfit: String
        get() = _currentProfit

    val profitOnTransactions: String
        get() = _profitOnTransactions

    val amountOfDividends: String
        get() = _amountOfDividends

    val commissions: String
        get() = _commissions

    val income: String
        get() = _income

    val totalProfitColor: String
        get() = _currentProfitColor

    val summaryProfitColor: String
        get() = _summaryProfitColor
}