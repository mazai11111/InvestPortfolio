package com.example.mvp_example.code.categories.Model

import com.example.mvp_example.code.categories.Model.Class.CategoryValue

class CategoriesСurrenciesStubModel: ICategoriesModel {
    override fun takeData(): ArrayList<CategoryValue> {
        val items: ArrayList<CategoryValue> = arrayListOf(
            CategoryValue("Рубл3ь", 81.47f),
            CategoryValue("Евро4", 6.45f),
            CategoryValue("Лари5", 5.65f)
        )

        return items;
    }
}