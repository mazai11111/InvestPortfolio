package com.example.mvp_example.code.Base

import com.example.mvp_example.code.general_params_portfolio.view.IGeneralPortfolioParamsView

interface IBasePresenter {
    public fun onViewLoaded();
    public fun detachView();
}