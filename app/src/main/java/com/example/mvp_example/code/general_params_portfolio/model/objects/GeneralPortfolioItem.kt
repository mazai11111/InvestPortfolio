package com.example.mvp_example.code.general_params_portfolio.model.objects

open class GeneralPortfolioItem {
    private val _amountCost:Float;
    private val _amountTotalProfit:Float;
    private val _percent:Float;

    public val AmountCost:Float
        get() {
            return _amountCost;
        }
    public val AmountTotalProfit:Float
        get() {
            return _amountTotalProfit;
        }
    public val Percent:Float
        get() {
            return _percent;
        }

    public constructor(amountCost:Float, amount:Float, percent:Float){
        _amountCost = amountCost;
        _amountTotalProfit = amount;
        _percent = percent;
    }
}