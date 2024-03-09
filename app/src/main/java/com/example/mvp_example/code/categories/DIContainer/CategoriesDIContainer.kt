package com.example.mvp_example.code.categories.DIContainer

import com.example.mvp_example.code.categories.Model.CategoriesStubCountryModel
import com.example.mvp_example.code.categories.Model.ICategoriesModel
import com.example.mvp_example.code.categories.Presenter.CategoriesPresenter
import com.example.mvp_example.code.categories.Presenter.ICategoriesPresenter
import org.koin.dsl.module

val categoriesModule = module {
    single<ICategoriesModel> {
        CategoriesStubCountryModel()
    }

    factory<ICategoriesPresenter> {
        CategoriesPresenter(get())
    }
}