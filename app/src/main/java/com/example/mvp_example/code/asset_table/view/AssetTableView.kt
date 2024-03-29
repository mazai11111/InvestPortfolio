package com.example.mvp_example.code.asset_table.view

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TableLayout
import android.widget.TextView
import com.example.mvp_example.R
import com.example.mvp_example.code.asset_table.model.objects.AssetTableDrawable
import com.example.mvp_example.code.asset_table.presenter.IAssetTablePresenter
import com.example.mvp_example.databinding.FragmentAssetTableBinding
import org.koin.android.ext.android.inject

class AssetTableView : Fragment(), IAssetTableView {
    private lateinit var _layout: FragmentAssetTableBinding;

    private var _tableViews: ArrayList<View> = arrayListOf();
    private val _presenter: IAssetTablePresenter by inject<IAssetTablePresenter>();

    public val Presenter:IAssetTablePresenter
        get() = _presenter;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _layout = FragmentAssetTableBinding.inflate(layoutInflater);

        return _layout.root
    }

    override fun onStart() {
        super.onStart();

        initPresenter();
    }

    companion object {
        fun newInstance() =
            AssetTableView()
    }

    override fun renderNewTable(views: List<AssetTableDrawable>) {
        _layout.apply {
            val tableLayout: TableLayout = assetTable

            tableLayout.removeAllViews()

            for (view in views) {
                val tableRow = layoutInflater.inflate(R.layout.asser_row, null) as LinearLayout

                renderView(view, tableLayout, tableRow)
            }
        }
    }

    private fun renderView(view:AssetTableDrawable, tableLayout: TableLayout, tableRow: LinearLayout){
        val picture: ImageView = tableRow.findViewById(R.id.image_asset)
        picture.setImageResource(view.ImageResource)

        val nameFullAsset: TextView = tableRow.findViewById(R.id.name_full_asset)
        nameFullAsset.text = view.Fullname

        val currentPriseAsset: TextView = tableRow.findViewById(R.id.current_prise_asset)
        currentPriseAsset.text = view.CurrentPrise.GetValue()

        val summaryProfitAsset: TextView = tableRow.findViewById(R.id.sum_profit_asset)
        summaryProfitAsset.text = view.SummaryProfit.GetValue()
        summaryProfitAsset.setTextColor(Color.parseColor(view.SummaryProfit.GetColor()));

        //val transition: TextView = tableRow.findViewById(R.id.transition)
        //transition.setTextColor(Color.parseColor(view.SummaryProfit.GetColor()));


        val profitabilityPercentAsset: TextView = tableRow.findViewById(R.id.profitability_percent_asset)
        profitabilityPercentAsset.text = view.Profitability.GetValue()
        profitabilityPercentAsset.setTextColor(Color.parseColor(view.Profitability.GetColor()));

        tableLayout.addView(tableRow)
        _tableViews.add(tableLayout);
    }

    private fun initPresenter(){
        _presenter.attachView(this);

        _presenter.onViewLoaded();
    }

    override fun onDestroy() {
        super.onDestroy()

        _presenter.detachView();
    }
}