package com.example.mvp_example.code.full_asset_info.View

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvp_example.code.full_asset_info.model.objects.AssetFullDrawable
import com.example.mvp_example.code.full_asset_info.presenter.IFullAssetInfoPresenter
import com.example.mvp_example.databinding.ActivityFullAssetInfoBinding
import org.koin.android.ext.android.inject


class FullAssetInfoView : AppCompatActivity(), IFullAssetInfoView {
    private lateinit var _layout:ActivityFullAssetInfoBinding;
    private val _presenter:IFullAssetInfoPresenter  by inject<IFullAssetInfoPresenter>();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _layout = ActivityFullAssetInfoBinding.inflate(layoutInflater);

        setContentView(_layout.root);
    }

    override fun onStart() {
        super.onStart()

        initPresenter();
    }

    override fun renderInfo(view:AssetFullDrawable) {
        _layout.apply {
            dateOfFirstTransaction.text = view.DateFirstTransaction;
            lotSize.text = view.LotSize;
            totalShares.text = view.TotalShares;
            averagePriceAtWholesalePos.text = view.AveragePriceAtWholesalePosition;
            currentPrice.text = view.CurrentPrise;

            plForDay.text = view.PlForDay;
            plForDay.setTextColor(Color.parseColor(view.PlForDayColor))

            currentValue.text = view.CurrentValue;
            costOfPurchases.text = view.CostOfPurchases;
            salesValue.text = view.SalesValue;
            portfolioShare.text = view.PortfolioShare;

            currentProfit.text = view.CurrentProfit;
            currentProfit.setTextColor(Color.parseColor(view.CurrentProfitColor))

            profitOnTransactions.text = view.ProfitOnTransactions;
            amountOfDividends.text = view.AmountOfDividends;

            totalProfit.text = view.SummaryProfit
            totalProfit.setTextColor(Color.parseColor(view.SummaryProfitColor))

            income.text = view.Income;
            income.setTextColor(Color.parseColor(view.IncomeColor))
        }
    }

    private fun initPresenter(){
        _presenter.attachView(this);
        val id: String = intent.getStringExtra("itemId").toString();

        _presenter.onViewLoaded(id);
    }
}