package com.example.mvp_example.code.categories.Presenter

import com.example.mvp_example.code.categories.View.ICategoriesView

interface ICategoriesPresenter {
    public fun onViewLoaded();
    public fun attachView(view: ICategoriesView)
    public fun detachView();
    public fun onCountryButtonClicked();
    public fun onIssuersButtonClicked();
    public fun onIndustryButtonClicked();
    public fun onСurrenciesButtonClicked();
    public fun onСategoriesButtonClicked();
    public fun onBrokersButtonClicked();
    public fun onBanksButtonClicked();

}
