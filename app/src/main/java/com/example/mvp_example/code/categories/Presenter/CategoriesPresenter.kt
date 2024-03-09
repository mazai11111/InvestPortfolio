package com.example.mvp_example.code.categories.Presenter

import com.example.mvp_example.code.categories.Model.CategoriesBanksModel
import com.example.mvp_example.code.categories.Model.CategoriesBrokersStubModel
import com.example.mvp_example.code.categories.Model.CategoriesIndustryStubModel
import com.example.mvp_example.code.categories.Model.CategoriesIssuersStubModel
import com.example.mvp_example.code.categories.Model.CategoriesStubCountryModel
import com.example.mvp_example.code.categories.Model.CategoriesСategoriesStubModel
import com.example.mvp_example.code.categories.Model.CategoriesСurrenciesStubModel
import com.example.mvp_example.code.categories.Model.Class.CategoryDrawable
import com.example.mvp_example.code.categories.Model.Class.CategoryValue
import com.example.mvp_example.code.categories.Model.ICategoriesModel
import com.example.mvp_example.code.categories.View.ICategoriesView
import com.example.mvp_example.code.drawable_builder.DrawableDirector

class CategoriesPresenter(private var _model: ICategoriesModel): ICategoriesPresenter {
    private var _view: ICategoriesView? = null;

    override fun onViewLoaded() {
        startViewProcess();

    }

    private fun startViewProcess(){
        val items:ArrayList<CategoryValue> = _model.takeData();

        val views:ArrayList<CategoryDrawable> = convertToDrawable(items);

        _view?.renderNewTable(views);
    }

    override fun attachView(view: ICategoriesView) {
        if (_view != null)
            return

        _view = view
    }

    override fun onCountryButtonClicked() {
        _model = CategoriesStubCountryModel();
        startViewProcess();
    }

    override fun onIssuersButtonClicked() {
        _model = CategoriesIssuersStubModel();
        startViewProcess();
    }

    override fun onIndustryButtonClicked() {
        _model = CategoriesIndustryStubModel();
        startViewProcess();
    }

    override fun onСurrenciesButtonClicked() {
        _model = CategoriesСurrenciesStubModel();
        startViewProcess();
    }

    override fun onСategoriesButtonClicked() {
        _model = CategoriesСategoriesStubModel();
        startViewProcess();
    }

    override fun onBrokersButtonClicked() {
        _model = CategoriesBrokersStubModel();
        startViewProcess();
    }

    override fun onBanksButtonClicked() {
        _model = CategoriesBanksModel();
        startViewProcess();
    }

    override fun detachView() {
        _view = null;
    }

    private fun convertToDrawable(items:ArrayList<CategoryValue>):ArrayList<CategoryDrawable> {
        var views:ArrayList<CategoryDrawable> = arrayListOf();

        for (item in items){

            val view = CategoryDrawable(item.Name,
                DrawableDirector().ToStringColouredPercent(item.Value))

            views.add(view);
        }

        return views;
    }
}