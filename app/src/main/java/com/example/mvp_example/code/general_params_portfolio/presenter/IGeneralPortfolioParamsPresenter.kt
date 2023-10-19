package com.example.mvp_example.code.general_params_portfolio.presenter

import com.example.mvp_example.code.Base.IBasePresenter
import com.example.mvp_example.code.general_params_portfolio.model.objects.DrawableGeneralPortfolioItem
import com.example.mvp_example.code.general_params_portfolio.model.objects.DrawableGeneralUnderscorePortfolioItem
import com.example.mvp_example.code.general_params_portfolio.model.objects.GeneralPortfolioItem
import com.example.mvp_example.code.general_params_portfolio.model.objects.GeneralPortfolioItemProfitUnderscorePercent
import com.example.mvp_example.code.general_params_portfolio.view.IGeneralPortfolioParamsView

interface IGeneralPortfolioParamsPresenter: IBasePresenter {
    public fun attachView(view: IGeneralPortfolioParamsView);
}