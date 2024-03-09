package com.example.mvp_example.code.general_params_portfolio.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvp_example.code.base.DrawableNumber
import com.example.mvp_example.code.drawable_builder.DrawableDirector
import com.example.mvp_example.code.general_params_portfolio.model.GeneralPortfolioParamsStubModel
import com.example.mvp_example.code.general_params_portfolio.model.IGeneralPortfolioParamsModel
import com.example.mvp_example.code.general_params_portfolio.model.objects.GeneralPortfolioItem

class GeneralPortfolioParamsViewModel(): ViewModel()
     {
    val AmountCost = MutableLiveData<DrawableNumber>();
    val AmountTotalProfit = MutableLiveData<DrawableNumber>();
    val Percent = MutableLiveData<DrawableNumber>();

    lateinit var  _model: IGeneralPortfolioParamsModel;

    init {
        _model = GeneralPortfolioParamsStubModel();
        val generalElement = _model.takeGeneralElement();

        FillElments(generalElement);
    }

    private fun FillElments(item:GeneralPortfolioItem){
        AmountCost.value = DrawableDirector().ToNotColouredSimpleString(item.AmountCost);
        AmountTotalProfit.value = DrawableDirector().ToStringColoured(item.AmountTotalProfit);
        Percent.value = DrawableDirector().ToStringColouredPercent(item.Percent);
    }
}