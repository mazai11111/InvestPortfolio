package com.example.mvp_example.code.full_asset_info.presenter

import com.example.mvp_example.code.Utils.ViewConvertor.Companion.takeWinLoseColor
import com.example.mvp_example.code.full_asset_info.View.IFullAssetInfoView
import com.example.mvp_example.code.full_asset_info.model.IFullAssetInfoModel
import com.example.mvp_example.code.full_asset_info.model.objects.AssetFull
import com.example.mvp_example.code.full_asset_info.model.objects.AssetFullDrawable

class FullAssetInfoPresenter(private val _model:IFullAssetInfoModel): IFullAssetInfoPresenter {
    private var _view: IFullAssetInfoView? = null;

    override fun attachView(view: IFullAssetInfoView) {
        _view = view;
    }

    override fun onViewLoaded(id: String) {

        val item: AssetFull = _model.takeData(id);
        val view:AssetFullDrawable = convertToDrawable(item);

        _view?.renderInfo(view);
    }

    override fun detachView() {
        _view = null;
    }

    private fun convertToDrawable(item: AssetFull):AssetFullDrawable{
        val plForDayColor = takeWinLoseColor(item.PlForDay);
        val currentProfitColor = takeWinLoseColor(item.CurrentProfit);
        val profitOnTransactionsColor = takeWinLoseColor(item.ProfitOnTransactions);
        val summaryProfitColor = takeWinLoseColor(item.SummaryProfit);
        val incomeColor = takeWinLoseColor(item.Income);

        val view: AssetFullDrawable = AssetFullDrawable(
            item.ImageResource,
            item.Fullname,
            item.ShortName,
            item.Count.toString(),
            item.CurrentPrise.toString()+" $",
            item.SummaryProfit.toString() + " $",
            summaryProfitColor,
            item.Profitability.toString()+" %",
            item.DateFirstTransaction.toString(),
            item.LotSize.toString(),
            item.TotalShares.toString(),
            item.AveragePriceAtWholesalePosition.toString()+" $",
            item.PlForDay.toString()+" $",
            plForDayColor,
            item.CurrentValue.toString()+" $",
            item.CostOfPurchases.toString() +" $",
            item.SalesValue.toString()+" $",
            item.CategoryShare.toString()+" %",
            item.PortfolioShare.toString()+" %",
            item.CurrentProfit.toString()+ " $",
            currentProfitColor,
            item.ProfitOnTransactions.toString() +" $",
            item.AmountOfDividends.toString() + " $",
            item.Commissions.toString() + " $",
            item.Income.toString() + " %",
            incomeColor)

        return view;
    }
}
