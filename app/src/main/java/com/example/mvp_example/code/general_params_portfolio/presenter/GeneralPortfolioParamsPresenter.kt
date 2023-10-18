package com.example.mvp_example.code.general_params_portfolio.presenter

import android.util.Log
import com.example.mvp_example.code.general_params_portfolio.model.IGeneralPortfolioParamsModel
import com.example.mvp_example.code.general_params_portfolio.view.IGeneralPortfolioParamsView

class GeneralPortfolioParamsPresenter(private val model: IGeneralPortfolioParamsModel):
    IGeneralPortfolioParamsPresenter {
    private lateinit var _view: IGeneralPortfolioParamsView;

    public override fun PrintSomething() {
        Log.v("TEST", "WORK!")
        model.PrintSg()
    }
}