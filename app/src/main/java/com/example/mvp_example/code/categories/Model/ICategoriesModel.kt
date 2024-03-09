package com.example.mvp_example.code.categories.Model

import com.example.mvp_example.code.categories.Model.Class.CategoryValue

interface ICategoriesModel {
    public fun takeData(): ArrayList<CategoryValue>
}