package com.example.mvp_example.code.asset_table.view

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
import com.example.mvp_example.databinding.FragmentAssetTableBinding
import org.koin.android.ext.android.inject

class AssetTableView : Fragment(), IAssetTableView {
    lateinit var _layout: FragmentAssetTableBinding;
    private val _presenter: IAssetTablePresenter by inject<IAssetTablePresenter>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _layout = FragmentAssetTableBinding.inflate(layoutInflater);

        return _layout.root
    }

    override fun onStart() {
        super.onStart()
    }

    companion object {
        fun newInstance() =
            AssetTableView()
    }

    override fun renderTable(views: Array<AssetTableDrawable>) {
        _layout.apply {
            val tableLayout: TableLayout = assetTable
            for (view in views) {
                val tableRow = layoutInflater.inflate(R.layout.asser_row, null) as TableRow
                tableRow.setBackgroundColor(Color.parseColor(view.ColorBg))

                val picture: ImageView = tableRow.findViewById(R.id.image_asset)
                picture.setImageResource(view.ImageResource)

                val nameFullSsset: TextView = tableRow.findViewById(R.id.name_full_asset)
                nameFullSsset.text = view.Fullname

                val nameShortAsset: TextView = tableRow.findViewById(R.id.name_short_asset)
                nameShortAsset.text = view.ShortName

                val countAsset: TextView = tableRow.findViewById(R.id.count_asset)
                countAsset.text = view.Count

                val currentPriseAsset: TextView = tableRow.findViewById(R.id.current_prise_asset)
                currentPriseAsset.text = view.CurrentPrise

                val summaryProfitAsset: TextView = tableRow.findViewById(R.id.sum_profit_asset)
                summaryProfitAsset.text = view.SummaryProfit

                val profitabilityPercentAsset: TextView = tableRow.findViewById(R.id.profitability_percent_asset)
                profitabilityPercentAsset.text = view.Profitability

                tableLayout.addView(tableRow)
            }
        }
    }
}