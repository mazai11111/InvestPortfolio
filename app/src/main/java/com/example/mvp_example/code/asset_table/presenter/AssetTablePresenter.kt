package com.example.mvp_example.code.asset_table.presenter

import com.example.mvp_example.code.drawable_builder.DrawableDirector
import com.example.mvp_example.code.asset_table.model.AllAssetsTableStubModel
import com.example.mvp_example.code.asset_table.model.IAssetTableModel
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

    private fun startViewProcess(){
        val items:ArrayList<AssetTable> = _model.takeData();

        val views:ArrayList<AssetTableDrawable> = convertToDrawable(items);

        _view?.renderNewTable(views);
    }

    private fun convertToDrawable(items:ArrayList<AssetTable>):ArrayList<AssetTableDrawable> {
        var views:ArrayList<AssetTableDrawable> = arrayListOf();

        for (item in items){

            val view = AssetTableDrawable(item.ImageResource,
                item.Fullname,
                DrawableDirector().ToNotColouredSimpleString(item.CurrentPrise),
                DrawableDirector().ToStringColoured(item.SummaryProfit),
                DrawableDirector().ToStringColouredPercent(item.Profitability))

            views.add(view);
        }

        return views;
    }
}