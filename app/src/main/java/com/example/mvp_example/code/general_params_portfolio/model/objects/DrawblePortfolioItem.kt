package com.example.mvp_example.code.general_params_portfolio.model.objects

open class DrawableGeneralPortfolioItem {
    private val _amount:String;

    public val Amount:String
        get() {
            return  _amount;
        }

    public constructor(amount:String){
        _amount = amount;
    }
}