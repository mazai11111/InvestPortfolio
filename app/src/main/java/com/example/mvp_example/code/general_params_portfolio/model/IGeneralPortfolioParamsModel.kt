package com.example.mvp_example.code.general_params_portfolio.model

import com.example.mvp_example.code.general_params_portfolio.model.objects.GeneralPortfolioItem
import com.example.mvp_example.code.general_params_portfolio.model.objects.GeneralPortfolioItemProfitUnderscorePercent

interface IGeneralPortfolioParamsModel {
    public fun takeCostElement(): GeneralPortfolioItem;
    public fun takeTotalProfitElement(): GeneralPortfolioItemProfitUnderscorePercent;
    public fun takeProfitabilityElement(): GeneralPortfolioItem;
    public fun takeChangePerDayElement(): GeneralPortfolioItemProfitUnderscorePercent;
}