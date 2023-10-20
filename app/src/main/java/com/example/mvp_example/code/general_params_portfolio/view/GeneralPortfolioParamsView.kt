package com.example.mvp_example.code.general_params_portfolio.view

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mvp_example.code.general_params_portfolio.model.objects.DrawableGeneralPortfolioItem
import com.example.mvp_example.code.general_params_portfolio.model.objects.DrawableGeneralUnderscorePortfolioItem
import com.example.mvp_example.code.general_params_portfolio.presenter.IGeneralPortfolioParamsPresenter
import com.example.mvp_example.databinding.FragmentGeneralPortfolioParamsViewBinding

import org.koin.android.ext.android.inject


class GeneralPortfolioParamsView : Fragment(), IGeneralPortfolioParamsView {
    private lateinit var _layout: FragmentGeneralPortfolioParamsViewBinding;

    private val _presenter: IGeneralPortfolioParamsPresenter by inject<IGeneralPortfolioParamsPresenter>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _layout = FragmentGeneralPortfolioParamsViewBinding.inflate(layoutInflater);

        return _layout.root
    }

    override fun onStart() {
        super.onStart()

        initPresenter();
    }

    companion object {
        fun newInstance() =
            GeneralPortfolioParamsView()
    }

    private fun  initPresenter(){
        if (_presenter == null)
            return

        _presenter.attachView(this);
        _presenter.onViewLoaded();
    }

    override fun renderCostElement(view: DrawableGeneralPortfolioItem) {
        _layout.amountCost.text = view.Amount;
    }

    override fun renderTotalProfitElement(view: DrawableGeneralUnderscorePortfolioItem) {
        _layout.apply {
            amountTotalProfit.text = view.Amount;
            persentTotalProfit.text = view.UnderscoreAmount
            persentTotalProfit.setTextColor(Color.parseColor(view.Color))
        }
    }

    override fun renderProfitabilityElement(view: DrawableGeneralPortfolioItem) {
        _layout.amountProfability.text = view.Amount;
    }

    override fun renderChangePerDayElement(view: DrawableGeneralUnderscorePortfolioItem) {
        _layout.apply {
            amountChangePerDay.text = view.Amount;
            percentChangedPerDay.text = view.UnderscoreAmount
            percentChangedPerDay.setTextColor(Color.parseColor(view.Color))
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        _presenter.detachView();
    }
}