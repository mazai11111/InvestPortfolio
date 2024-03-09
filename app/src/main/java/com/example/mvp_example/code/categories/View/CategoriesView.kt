package com.example.mvp_example.code.categories.View

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TableLayout
import android.widget.TextView
import com.example.mvp_example.R
import com.example.mvp_example.code.Statistic.View.StatisticActivity
import com.example.mvp_example.code.categories.Model.Class.CategoryDrawable
import com.example.mvp_example.code.categories.Presenter.ICategoriesPresenter
import com.example.mvp_example.databinding.FragmentCategoriesViewBinding
import org.koin.android.ext.android.inject


class CategoriesView : Fragment(), ICategoriesView {
    private lateinit var _layout: FragmentCategoriesViewBinding;

    private var _tableViews: ArrayList<View> = arrayListOf();
    private val _presenter: ICategoriesPresenter by inject<ICategoriesPresenter>();

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _layout = FragmentCategoriesViewBinding.inflate(layoutInflater);

        return _layout.root
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            CategoriesView()
    }

    override fun onStart() {
        super.onStart();

        initPresenter();
        setNavigation();
    }

    override fun renderNewTable(views: List<CategoryDrawable>) {
        _layout.apply {
            val tableLayout: TableLayout = categoryTable

            tableLayout.removeAllViews()

            for (view in views) {
                val tableRow = layoutInflater.inflate(R.layout.category_row, null) as LinearLayout

                renderView(view, tableLayout, tableRow)
            }
        }
    }

    private fun renderView(view: CategoryDrawable, tableLayout: TableLayout, tableRow: LinearLayout){

        val name: TextView = tableRow.findViewById(R.id.category_name)
        name.text = view.Name;

        val price: TextView = tableRow.findViewById(R.id.category_value)
        price.text = view.Value.GetValue();

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

    private fun setNavigation(){
        _layout.apply {
            issuersButton.setOnClickListener{
                _presenter.onIssuersButtonClicked();
            }
            countryButton.setOnClickListener{
                _presenter.onCountryButtonClicked();
            }
            industryButton.setOnClickListener{
                _presenter.onIndustryButtonClicked()
            }
            currenciesButton.setOnClickListener{
                _presenter.onСurrenciesButtonClicked()
            }
            categoriesButton.setOnClickListener{
                _presenter.onСategoriesButtonClicked()
            }
            brokerButton.setOnClickListener{
                _presenter.onBrokersButtonClicked()
            }
            bankButton.setOnClickListener{
                _presenter.onBanksButtonClicked()
            }
        }
    }
}