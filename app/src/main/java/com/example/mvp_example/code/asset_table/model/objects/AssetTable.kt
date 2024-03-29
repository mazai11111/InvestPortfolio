package com.example.mvp_example.code.asset_table.model.objects

open class AssetTable {
    private val _imageResource: Int
    private val _fullName:String;
    private val _currentPrise:Float;
    private val _summaryProfit:Float;
    private val _profitability:Float;

    public val ImageResource:Int
        get() = _imageResource;
    public val Fullname:String
        get() = _fullName;
    public val CurrentPrise:Float
        get() = _currentPrise;
    public val SummaryProfit:Float
        get() = _summaryProfit;
    public val Profitability:Float
        get() = _profitability;

    public constructor(
        imageResource: Int,
        fullName: String,
        currentPrise: Float,
        summaryProfit: Float,
        profitability: Float
    ) {
        this._imageResource = imageResource
        this._fullName = fullName
        this._currentPrise = currentPrise
        this._summaryProfit = summaryProfit
        this._profitability = profitability
    }
}