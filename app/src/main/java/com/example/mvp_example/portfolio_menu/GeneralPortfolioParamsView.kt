package com.example.mvp_example.portfolio_menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mvp_example.R


class GeneralPortfolioParamsView : Fragment() {
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