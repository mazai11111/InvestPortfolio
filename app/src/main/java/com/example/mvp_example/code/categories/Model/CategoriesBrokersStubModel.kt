package com.example.mvp_example.code.categories.Model

import com.example.mvp_example.code.categories.Model.Class.CategoryValue

class CategoriesBrokersStubModel: ICategoriesModel {
    override fun takeData(): ArrayList<CategoryValue> {
        val items: ArrayList<CategoryValue> = arrayListOf(
            CategoryValue("БКС Мир Инвестиций", 81.47f),
            CategoryValue("Инвестиционная палата", 6.45f),
            CategoryValue("Алор брокер", 5.65f),
            CategoryValue("Тинькофф Инвестиции", 12.34f),
            CategoryValue("ФИНАМ", 18.90f)
        )

        return items;
    }
}