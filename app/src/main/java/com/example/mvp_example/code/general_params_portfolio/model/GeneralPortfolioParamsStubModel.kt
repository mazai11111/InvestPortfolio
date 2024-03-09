package com.example.mvp_example.code.general_params_portfolio.model

import com.example.mvp_example.code.general_params_portfolio.model.objects.GeneralPortfolioItem

class GeneralPortfolioParamsStubModel: IGeneralPortfolioParamsModel {
    override fun takeGeneralElement(): GeneralPortfolioItem {
        val item:GeneralPortfolioItem = GeneralPortfolioItem(999999.7f, 11000.70f, 14.4f);

        return item;
    }
}