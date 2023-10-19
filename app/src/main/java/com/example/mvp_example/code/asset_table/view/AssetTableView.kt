package com.example.mvp_example.code.asset_table.view

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import com.example.mvp_example.R
import com.example.mvp_example.code.general_params_portfolio.presenter.IGeneralPortfolioParamsPresenter
import com.example.mvp_example.code.general_params_portfolio.view.GeneralPortfolioParamsView
import com.example.mvp_example.databinding.FragmentAssetTableBinding
import org.koin.android.ext.android.inject

class AssetTableView : Fragment(), IAssetTableView {
    lateinit var _layout: FragmentAssetTableBinding;
    private val _presenter: IAssetTableView by inject<IAssetTableView>()

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
            GeneralPortfolioParamsView()
    }

    override fun RenderTable(views: Array<AssetTableView>) {
        _layout.apply {
            val tableLayout: TableLayout = assetTable

            // Пример данных, которые вы можете изменить
            val newData = listOf("Item 1", "Item 2", "Item 3")

            for (data in newData) {
                // Динамическое создание TableRow из XML-макета
                val tableRow = layoutInflater.inflate(R.layout.asser_row, null) as TableRow

                // Изменение данных в TableRow
                val textView: TextView = tableRow.findViewById(R.id.textView)
                textView.text = data

                // Добавление TableRow в TableLayout
                tableLayout.addView(tableRow)
            }
        }
    }
}