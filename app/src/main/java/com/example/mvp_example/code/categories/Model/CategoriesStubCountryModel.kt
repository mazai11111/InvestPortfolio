package com.example.mvp_example.code.categories.Model

import com.example.mvp_example.code.asset_table.model.objects.AssetTable
import com.example.mvp_example.code.categories.Model.Class.CategoryValue

class CategoriesStubCountryModel: ICategoriesModel {
    override fun takeData(): ArrayList<CategoryValue> {
        val items: ArrayList<CategoryValue> = arrayListOf(
            CategoryValue("Россия", 14.22f),
            CategoryValue("США", 7.10f),
            CategoryValue("Китай", 5.92f),
            CategoryValue("Великобритания", 2.88f),
            CategoryValue("Испания", 1.24f)
            )

        return items;
    }
}