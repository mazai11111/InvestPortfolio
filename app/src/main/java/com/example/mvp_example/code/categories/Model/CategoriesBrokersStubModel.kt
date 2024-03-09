package com.example.mvp_example.code.categories.Model

import com.example.mvp_example.code.categories.Model.Class.CategoryValue

class CategoriesBrokersStubModel: ICategoriesModel {
    override fun takeData(): ArrayList<CategoryValue> {
        val items: ArrayList<CategoryValue> = arrayListOf(
            CategoryValue("broker1", 81.47f),
            CategoryValue("broker2", 6.45f)
        )

        return items;
    }
}