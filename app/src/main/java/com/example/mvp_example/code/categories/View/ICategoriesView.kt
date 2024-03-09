package com.example.mvp_example.code.categories.View

import com.example.mvp_example.code.categories.Model.Class.CategoryDrawable

abstract interface ICategoriesView {
    public  fun renderNewTable(views:List<CategoryDrawable>);
}