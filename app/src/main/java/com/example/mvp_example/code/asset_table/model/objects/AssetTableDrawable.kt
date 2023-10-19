package com.example.mvp_example.code.asset_table.model.objects

class AssetTableDrawable {
    private val _imageResource: Int
    private val _fullName:String;
    private val _shortName:String;
    private val _count:String;
    private val _currentPrise:String;
    private val _summaryProfit:String;
    private val _profitability:String;
    private val _color:String;

    public val ImageResource:Int
        get() = _imageResource;
    public val Fullname:String
        get() = _fullName;
    public val ShortName:String
        get() = _shortName;
    public val Count:String
        get() = _count;
    public val CurrentPrise:String
        get() = _currentPrise;
    public val SummaryProfit:String
        get() = _summaryProfit;
    public val Profitability:String
        get() = _profitability;

    public constructor(
        imageResource: Int,
        fullName: String,
        shortName: String,
        count: String,
        currentPrise: String,
        summaryProfit: String,
        profitability: String,
        _color: String
    ) {
        this._imageResource = imageResource
        this._fullName = fullName
        this._shortName = shortName
        this._count = count
        this._currentPrise = currentPrise
        this._summaryProfit = summaryProfit
        this._profitability = profitability
        this._color = _color
    }
}