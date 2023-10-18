package com.example.mvp_example.code.general_params_portfolio.model

import com.example.mvp_example.code.general_params_portfolio.model.objects.GeneralPortfolioItem
import com.example.mvp_example.code.general_params_portfolio.model.objects.GeneralPortfolioItemProfitUnderscorePercent

class GeneralPortfolioParamsStubModel: IGeneralPortfolioParamsModel {
    override fun takeCostElement(): GeneralPortfolioItem {
        val item:GeneralPortfolioItem = GeneralPortfolioItem("cost", 658925.19f, false);

        return item;
    }

    override fun takeTotalProfitElement(): GeneralPortfolioItemProfitUnderscorePercent {
        val item:GeneralPortfolioItemProfitUnderscorePercent = GeneralPortfolioItemProfitUnderscorePercent("total_profit", 140813.93f, false, 27.18f);

        return item;
    }

    override fun takeProfitabilityElement(): GeneralPortfolioItem {
        val item:GeneralPortfolioItem = GeneralPortfolioItem("profitability", -6.25f, true);

        return item;

    }

    override fun takeChangePerDayElement(): GeneralPortfolioItemProfitUnderscorePercent {
        val item:GeneralPortfolioItemProfitUnderscorePercent = GeneralPortfolioItemProfitUnderscorePercent("change_per_day", -2540.29f, false, -0.4f);

        return item;
    }

}