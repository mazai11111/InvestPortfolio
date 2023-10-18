package com.example.mvp_example.code.general_params_portfolio.model.objects


class DrawableGeneralUnderscorePortfolioItem:DrawableGeneralPortfolioItem {
    private val _underscoreAmount:String;
    private val _color:String;

    public val UnderscoreAmount:String
        get() {
            return _underscoreAmount;
        }
    public val Color:String
        get() {
            return _color;
        }

    public constructor(amount:String, underscoreAmount:String, color: String) : super(amount) {
        _underscoreAmount = underscoreAmount;
        _color = color;
    }
}