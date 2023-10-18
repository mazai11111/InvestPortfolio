package com.example.mvp_example.code.general_params_portfolio.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mvp_example.R
import com.example.mvp_example.code.general_params_portfolio.presenter.IGeneralPortfolioParamsPresenter

import org.koin.android.ext.android.inject


class GeneralPortfolioParamsView : Fragment() {
    private val _presenter: IGeneralPortfolioParamsPresenter by inject<IGeneralPortfolioParamsPresenter>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_general_portfolio_params_view, container, false)
    }

    companion object {
        fun newInstance() =
            GeneralPortfolioParamsView()
    }
}