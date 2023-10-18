package com.example.mvp_example.code.general_params_portfolio.model.objects

class GeneralPortfolioItemProfitUnderscorePercent(private val _name: String, private val _amount: Float, private val _isPercent: Boolean, private val _profitPercent:Float) :
    GeneralPortfolioItem(_name, _amount, _isPercent) {
        public val ProfitPercent:Float
            get() {
                return _profitPercent;
            }
}