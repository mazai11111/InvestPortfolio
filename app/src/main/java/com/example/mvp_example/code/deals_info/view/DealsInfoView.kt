package com.example.mvp_example.code.deals_info.view

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvp_example.code.deals_info.viewModel.DealsInfoViewModel
import com.example.mvp_example.databinding.FragmentDealsInfoViewBinding

class DealsInfoView : Fragment() {
    private lateinit var _layout: FragmentDealsInfoViewBinding;

    lateinit var _viewModel: DealsInfoViewModel;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _layout = FragmentDealsInfoViewBinding.inflate(layoutInflater);
        _viewModel = ViewModelProvider(this).get(DealsInfoViewModel::class.java);

        return _layout.root
    }

    override fun onStart() {
        super.onStart()

        _viewModel._openedDeal.observe(this, Observer {
            _layout.countOpened.text = it.Count.toString();
            _layout.priceOpened.text = it.Prise.GetValue();
            _layout.priceOpened.setTextColor(Color.parseColor(it.Prise.GetColor()))

        })

        _viewModel._inPlusDeal.observe(this, Observer {
            _layout.countInPlus.text = it.Count.toString();
            _layout.priceInPlus.text = it.Prise.GetValue();
            _layout.priceInPlus.setTextColor(Color.parseColor(it.Prise.GetColor()))
        })

        _viewModel._inMinusDeal.observe(this, Observer {
            _layout.countInMinus.text = it.Count.toString();
            _layout.priceInMinus.text = it.Prise.GetValue();
            _layout.priceInMinus.setTextColor(Color.parseColor(it.Prise.GetColor()))
        })
    }

    companion object {

        @JvmStatic
        fun newInstance() = DealsInfoView();
    }
}