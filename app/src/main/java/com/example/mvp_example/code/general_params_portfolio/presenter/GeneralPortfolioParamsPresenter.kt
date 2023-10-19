package com.example.mvp_example.code.general_params_portfolio.presenter

import com.example.mvp_example.code.Utils.ViewConvertor.Companion.takeWinLoseColor
import com.example.mvp_example.code.general_params_portfolio.model.IGeneralPortfolioParamsModel
import com.example.mvp_example.code.general_params_portfolio.model.objects.DrawableGeneralPortfolioItem
import com.example.mvp_example.code.general_params_portfolio.model.objects.DrawableGeneralUnderscorePortfolioItem
import com.example.mvp_example.code.general_params_portfolio.model.objects.GeneralPortfolioItem
import com.example.mvp_example.code.general_params_portfolio.model.objects.GeneralPortfolioItemProfitUnderscorePercent
import com.example.mvp_example.code.general_params_portfolio.view.IGeneralPortfolioParamsView

class GeneralPortfolioParamsPresenter(private val _model: IGeneralPortfolioParamsModel):
    IGeneralPortfolioParamsPresenter {
    private var _view: IGeneralPortfolioParamsView? = null;

    override fun onViewLoaded() {
        val costItem = _model.takeCostElement();
        val totalProfitItem = _model.takeTotalProfitElement();
        val profitabilityItem = _model.takeProfitabilityElement();
        val changePerDayItem = _model.takeChangePerDayElement();

        val costView = makeDrawable(costItem);
        val totalProfitView = makeDrawable(totalProfitItem);
        val profitabilityView = makeDrawable(profitabilityItem);
        val changePerDayView = makeDrawable(changePerDayItem);

        _view?.renderCostElement(costView);
        _view?.renderProfitabilityElement(profitabilityView);
        _view?.renderTotalProfitElement(totalProfitView);
        _view?.renderChangePerDayElement(changePerDayView);
    }

    override fun attachView(view: IGeneralPortfolioParamsView) {
        _view = view;
    }

    override fun detachView() {
        _view = null;
    }

    private fun makeDrawable(item:GeneralPortfolioItemProfitUnderscorePercent):DrawableGeneralUnderscorePortfolioItem{



        var amount:String = item.Amount.toString();

        var percentUnderscoreColor:String;

        percentUnderscoreColor = takeWinLoseColor(item.ProfitPercent);

        amount = addSign(amount, item);



        val view = DrawableGeneralUnderscorePortfolioItem(amount, item.ProfitPercent.toString(), percentUnderscoreColor);

        return view;
    }

    private fun makeDrawable(item:GeneralPortfolioItem):DrawableGeneralPortfolioItem{
        var amount:String = item.Amount.toString();

        amount = addSign(amount, item);

        val view = DrawableGeneralPortfolioItem(amount);

        return view;
    }

    private fun addSign(stringToChange: String, item:GeneralPortfolioItem):String{
        var _stringToChange = stringToChange;

        if (item.IsPercent == true){
            _stringToChange += "%";
        }
        else{
            _stringToChange += "$";
        }

        return _stringToChange;
    }
}