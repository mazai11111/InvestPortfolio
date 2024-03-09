package com.example.mvp_example.code.general_params_portfolio.view

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvp_example.code.general_params_portfolio.ViewModel.GeneralPortfolioParamsViewModel
import com.example.mvp_example.databinding.FragmentGeneralPortfolioParamsViewBinding


class GeneralPortfolioParamsView : Fragment(){
    private lateinit var _layout: FragmentGeneralPortfolioParamsViewBinding;

    lateinit var _viewModel: GeneralPortfolioParamsViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _layout = FragmentGeneralPortfolioParamsViewBinding.inflate(layoutInflater);

        _viewModel = ViewModelProvider(this).get(GeneralPortfolioParamsViewModel::class.java);

        return _layout.root
    }

    override fun onStart() {
        super.onStart();
        _viewModel.AmountCost.observe(this, Observer {
            _layout.amountCost.text = it.GetValue();
            _layout.amountCost.setTextColor(Color.parseColor(it.GetColor()));
        })

        _viewModel.AmountCost.observe(this, Observer {
            _layout.transitionMainInfo.setTextColor(Color.parseColor(it.GetColor()));
        })

        _viewModel.AmountTotalProfit.observe(this, Observer {
            _layout.amountTotalProfit.text = it.GetValue();
            _layout.amountTotalProfit.setTextColor(Color.parseColor(it.GetColor()));
        })

        _viewModel.Percent.observe(this, Observer {
            _layout.amountChangePercent.text = it.GetValue();
            _layout.amountChangePercent.setTextColor(Color.parseColor(it.GetColor()));
            _layout.transitionMainInfo.setTextColor(Color.parseColor(_viewModel.Percent.value?.GetColor()))
        })
    }

    companion object {
        fun newInstance() =
            GeneralPortfolioParamsView()
    }
}