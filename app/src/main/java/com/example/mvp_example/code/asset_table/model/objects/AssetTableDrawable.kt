package com.example.mvp_example.code.asset_table.model.objects

import com.example.mvp_example.code.base.DrawableNumber

class AssetTableDrawable {
    private val _imageResource: Int
    private val _fullName:String;
    private val _currentPrise: DrawableNumber;
    private val _summaryProfit: DrawableNumber;
    private val _profitability: DrawableNumber;

    public val ImageResource:Int
        get() = _imageResource;
    public val Fullname:String
        get() = _fullName;
    public val CurrentPrise:DrawableNumber
        get() = _currentPrise;
    public val SummaryProfit:DrawableNumber
        get() = _summaryProfit;
    public val Profitability:DrawableNumber
        get() = _profitability;


    public constructor(
        imageResource: Int,
        fullName: String,
        currentPrise: DrawableNumber,
        summaryProfit: DrawableNumber,
        profitability: DrawableNumber
    ) {
        this._imageResource = imageResource
        this._fullName = fullName
        this._currentPrise = currentPrise
        this._summaryProfit = summaryProfit
        this._profitability = profitability
    }
}