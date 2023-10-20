package com.example.mvp_example.code.asset_table.presenter

import com.example.mvp_example.code.Utils.ViewConvertor.Companion.takeWinLoseColor
import com.example.mvp_example.code.asset_table.model.AllAssetsTableStubModel
import com.example.mvp_example.code.asset_table.model.BoundsTableModel
import com.example.mvp_example.code.asset_table.model.CryptoTableModel
import com.example.mvp_example.code.asset_table.model.IAssetTableModel
import com.example.mvp_example.code.asset_table.model.StocksTableModel
import com.example.mvp_example.code.asset_table.model.objects.AssetTable
import com.example.mvp_example.code.asset_table.model.objects.AssetTableDrawable
import com.example.mvp_example.code.asset_table.view.IAssetTableView

class AssetTablePresenter(private var _model: IAssetTableModel):IAssetTablePresenter {
    private var _view: IAssetTableView? = null;

    public override fun onViewLoaded() {
        startViewProcess();
    }

    public override fun detachView() {
        _view = null;
    }

    public override fun attachView(view: IAssetTableView) {
        if (_view != null)
            return

        _view = view
    }

    public override fun onAllAssetsButtonClicked() {
        _model = AllAssetsTableStubModel();
        startViewProcess();
    }

    public override fun onStocksButtonClicked() {
        _model = StocksTableModel();
        startViewProcess();
    }

    public override fun onCryptoButtonClicked() {
        _model = CryptoTableModel();
        startViewProcess();
    }

    public override fun onBoundsButtonClicked() {
        _model = BoundsTableModel();
        startViewProcess();
    }

    private fun startViewProcess(){
        val items:ArrayList<AssetTable> = _model.takeData();

        val views:ArrayList<AssetTableDrawable> = convertToDrawable(items);

        _view?.renderNewTable(views);
    }

    private fun convertToDrawable(items:ArrayList<AssetTable>):ArrayList<AssetTableDrawable> {
        var views:ArrayList<AssetTableDrawable> = arrayListOf();

        var count:Int = 0;

        for (item in items){
            count += 1;

            var colorView = takeWinLoseColor(item.SummaryProfit);
            var bgColor = decideBackgroundColor(count);

            val view = AssetTableDrawable(item.ImageResource,
                item.Fullname,
                item.ShortName,
                item.Count.toString(),
                item.CurrentPrise.toString(),
                item.SummaryProfit.toString(),
                item.Profitability.toString(),
                colorView, bgColor)

            views.add(view);
        }

        return views;
    }

    private fun decideBackgroundColor(value:Int):String{
        val first = "#2D3040"
        val second = "#272B39"

        if (value % 2 == 0)
            return first;

        return second;
    }
}