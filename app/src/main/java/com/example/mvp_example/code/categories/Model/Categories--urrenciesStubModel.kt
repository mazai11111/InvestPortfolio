package com.example.mvp_example.code.categories.Model

import com.example.mvp_example.code.categories.Model.Class.CategoryValue

class CategoriesСurrenciesStubModel: ICategoriesModel {
    override fun takeData(): ArrayList<CategoryValue> {
        val items: ArrayList<CategoryValue> = arrayListOf(
            CategoryValue("Рубль", 81.47f),
            CategoryValue("Евро", 6.45f),
            CategoryValue("Юань", 12.6f)
        )

        return items;
    }
}