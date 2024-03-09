package com.example.mvp_example.code.deals_info.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvp_example.code.drawable_builder.DrawableDirector
import com.example.mvp_example.code.deals_info.Model.Classes.Deal
import com.example.mvp_example.code.deals_info.Model.Classes.DealDrawable
import com.example.mvp_example.code.deals_info.Model.Classes.DealStubModel
import com.example.mvp_example.code.deals_info.Model.IDealModel

class DealsInfoViewModel:ViewModel() {
    val _openedDeal = MutableLiveData<DealDrawable>();
    val _inPlusDeal = MutableLiveData<DealDrawable>();
    val _inMinusDeal = MutableLiveData<DealDrawable>();

    lateinit var  _model: IDealModel;

    init {
        _model = DealStubModel();
        val opened = _model.takeOpened();
        val inMinus = _model.takeInMinus();
        val inPlus = _model.takeInPlus();

        _openedDeal.value = FillElment(opened);
        _inPlusDeal.value = FillElment(inMinus);
        _inMinusDeal.value = FillElment(inPlus);
    }

    private fun FillElment(item: Deal): DealDrawable{
        val priseReworked = DrawableDirector().ToStringColoured(item.Prise);
        val drawable = DealDrawable(item.Count, priseReworked);

        return drawable;
    }
}