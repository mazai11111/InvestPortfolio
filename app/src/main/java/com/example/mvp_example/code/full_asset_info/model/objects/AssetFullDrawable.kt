package com.example.mvp_example.code.full_asset_info.model.objects

class AssetFullDrawable(
    private val _imageResource: Int,
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
    private val _incomeColor:String
) {
    val IncomeColor: String
        get() = _incomeColor;

    val ImageResource: Int
        get() = _imageResource

    val FullName: String
        get() = _fullName

    val ShortName: String
        get() = _shortName

    val Count: String
        get() = _count

    val CurrentPrise: String
        get() = _currentPrise

    val SummaryProfit: String
        get() = _summaryProfit

    val Profitability: String
        get() = _profitability

    val DateFirstTransaction: String
        get() = _dateFirstTransaction

    val LotSize: String
        get() = _lotSize

    val TotalShares: String
        get() = _totalShares

    val AveragePriceAtWholesalePosition: String
        get() = _averagePriceAtWholesalePosition

    val PlForDay: String
        get() = _plForDay

    val PlForDayColor: String
        get() = _plForDayColor

    val CurrentValue: String
        get() = _currentValue

    val CostOfPurchases: String
        get() = _costOfPurchases

    val SalesValue: String
        get() = _salesValue

    val CategoryShare: String
        get() = _categoryShare

    val PortfolioShare: String
        get() = _portfolioShare

    val CurrentProfit: String
        get() = _currentProfit

    val ProfitOnTransactions: String
        get() = _profitOnTransactions

    val AmountOfDividends: String
        get() = _amountOfDividends

    val Commissions: String
        get() = _commissions

    val Income: String
        get() = _income

    val CurrentProfitColor: String
        get() = _currentProfitColor

    val SummaryProfitColor: String
        get() = _summaryProfitColor
}