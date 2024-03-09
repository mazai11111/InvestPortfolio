package com.example.mvp_example.code.base

import androidx.viewbinding.ViewBinding

interface INavigationToPresenterConnector<Binding, Presenter> where Binding: ViewBinding, Presenter:IBasePresenter {
    public fun connect(layout:Binding, presenter: Presenter);
}