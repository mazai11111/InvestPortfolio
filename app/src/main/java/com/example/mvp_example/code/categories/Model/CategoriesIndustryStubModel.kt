package com.example.mvp_example.code.categories.Model

import com.example.mvp_example.code.categories.Model.Class.CategoryValue

class CategoriesIndustryStubModel: ICategoriesModel {
    override fun takeData(): ArrayList<CategoryValue> {
        val items: ArrayList<CategoryValue> = arrayListOf(
            CategoryValue("Технологии", 81.47f),
            CategoryValue("Здравоохранение", 6.45f),
            CategoryValue("Финансовые услуги", 5.65f),
            CategoryValue("Производство", 4.44f),
            CategoryValue("Торговля", 1.99f)

        )

        return items;
    }
}