package com.example.mvp_example.code.general_params_portfolio.view

import com.example.mvp_example.code.general_params_portfolio.model.objects.DrawableGeneralPortfolioItem
import com.example.mvp_example.code.general_params_portfolio.model.objects.DrawableGeneralUnderscorePortfolioItem

interface IGeneralPortfolioParamsView {
    public fun renderCostElement(view: DrawableGeneralPortfolioItem);
    public fun renderTotalProfitElement(view: DrawableGeneralUnderscorePortfolioItem);
    public fun renderProfitabilityElement(view: DrawableGeneralPortfolioItem);
    public fun renderChangePerDayElement(view: DrawableGeneralUnderscorePortfolioItem);
}