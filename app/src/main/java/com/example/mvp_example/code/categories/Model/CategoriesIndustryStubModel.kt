package com.example.mvp_example.code.categories.Model

import com.example.mvp_example.code.categories.Model.Class.CategoryValue

class CategoriesIndustryStubModel: ICategoriesModel {
    override fun takeData(): ArrayList<CategoryValue> {
        val items: ArrayList<CategoryValue> = arrayListOf(
            CategoryValue("Акции1", 81.47f),
            CategoryValue("Прочее2", 6.45f),
            CategoryValue("Ценные бумаги РФ3", 5.65f),
            CategoryValue("Корпоративные облигации4", 4.44f),
            CategoryValue("Паи5", 1.99f),
        )

        return items;
    }
}