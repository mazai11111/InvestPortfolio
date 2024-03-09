package com.example.mvp_example.code.categories.Model

import com.example.mvp_example.code.categories.Model.Class.CategoryValue

class CategoriesBanksModel: ICategoriesModel {
    override fun takeData(): ArrayList<CategoryValue> {
        val items: ArrayList<CategoryValue> = arrayListOf(
            CategoryValue("Сбер", 0.47f),
            CategoryValue("Тинькофф", 67.22f)
        )

        return items;
    }
}