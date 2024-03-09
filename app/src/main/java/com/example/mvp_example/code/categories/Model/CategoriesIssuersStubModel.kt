package com.example.mvp_example.code.categories.Model

import com.example.mvp_example.code.categories.Model.Class.CategoryValue

class CategoriesIssuersStubModel: ICategoriesModel {
    override fun takeData(): ArrayList<CategoryValue> {
        val items: ArrayList<CategoryValue> = arrayListOf(
            CategoryValue("Акции", 81.47f),
            CategoryValue("Прочее", 6.45f),
            CategoryValue("Ценные бумаги РФ", 5.65f),
            CategoryValue("Корпоративные облигации", 4.44f),
            CategoryValue("Паи", 1.99f),
        )

        return items;
    }
}