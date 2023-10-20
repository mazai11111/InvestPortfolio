package com.example.mvp_example.code.Base

import androidx.viewbinding.ViewBinding
import com.example.mvp_example.code.asset_table.presenter.IAssetTablePresenter

interface INavigationToPresenterConnector<Binding, Presenter> where Binding: ViewBinding, Presenter:IBasePresenter {
    public fun connect(layout:Binding, presenter: Presenter);
}