package com.example.mvp_example.code.asset_table.view

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import com.example.mvp_example.R
import com.example.mvp_example.code.asset_table.model.objects.AssetTableDrawable
import com.example.mvp_example.code.asset_table.presenter.IAssetTablePresenter
import com.example.mvp_example.code.full_asset_info.View.FullAssetInfoView
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

            val firstRow:TableRow = _layout.firstRow
            tableLayout.addView(firstRow)


            for (view in views) {
                val tableRow = layoutInflater.inflate(R.layout.asser_row, null) as TableRow

                renderView(view, tableLayout, tableRow)

                subImageToOpenAdditionalInfo(tableRow)

            }
        }
    }

    private fun subImageToOpenAdditionalInfo(tableRow: TableRow){
        val picture: ImageView = tableRow.findViewById(R.id.image_asset)
        val nameFullAsset: TextView = tableRow.findViewById(R.id.name_full_asset)

        //TO DO: unsub
        picture.setOnClickListener {openAdditionalInfo(nameFullAsset.text.toString())}
    }

    private fun openAdditionalInfo(id:String){
        var intent =  Intent(getActivity(), FullAssetInfoView::class.java);
        intent.putExtra("itemId", id);
        startActivity(intent)
    }

    private fun renderView(view:AssetTableDrawable, tableLayout: TableLayout, tableRow: TableRow){
        tableRow.setBackgroundColor(Color.parseColor(view.ColorBg))

        val picture: ImageView = tableRow.findViewById(R.id.image_asset)
        picture.setImageResource(view.ImageResource)

        val nameFullAsset: TextView = tableRow.findViewById(R.id.name_full_asset)
        nameFullAsset.text = view.Fullname

        val nameShortAsset: TextView = tableRow.findViewById(R.id.name_short_asset)
        nameShortAsset.text = view.ShortName

        val countAsset: TextView = tableRow.findViewById(R.id.count_asset)
        countAsset.text = view.Count

        val currentPriseAsset: TextView = tableRow.findViewById(R.id.current_prise_asset)
        currentPriseAsset.text = view.CurrentPrise

        val summaryProfitAsset: TextView = tableRow.findViewById(R.id.sum_profit_asset)
        summaryProfitAsset.text = view.SummaryProfit
        summaryProfitAsset.setTextColor(Color.parseColor(view.Color));

        val profitabilityPercentAsset: TextView = tableRow.findViewById(R.id.profitability_percent_asset)
        profitabilityPercentAsset.text = view.Profitability
        profitabilityPercentAsset.setTextColor(Color.parseColor(view.Color));

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