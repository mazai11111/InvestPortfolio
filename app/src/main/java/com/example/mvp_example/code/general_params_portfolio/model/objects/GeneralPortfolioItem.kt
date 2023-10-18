package com.example.mvp_example.code.general_params_portfolio.model.objects

open class GeneralPortfolioItem {
    private val _name:String;
    private val _amount:Float;
    private val _isPercent:Boolean;

    public val Name:String
        get() {
            return _name;
        }
    public val Amount:Float
        get() {
            return _amount;
        }
    public val IsPercent:Boolean
        get() {
            return _isPercent;
        }

    public constructor(name:String, amount:Float, isPercent:Boolean){
        _name = name;
        _amount = amount;
        _isPercent = isPercent;
    }
}