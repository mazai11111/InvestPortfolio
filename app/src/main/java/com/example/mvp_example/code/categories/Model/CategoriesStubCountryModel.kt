package com.example.mvp_example.code.categories.Model

import com.example.mvp_example.code.asset_table.model.objects.AssetTable
import com.example.mvp_example.code.categories.Model.Class.CategoryValue

class CategoriesStubCountryModel: ICategoriesModel {
    override fun takeData(): ArrayList<CategoryValue> {
        val items: ArrayList<CategoryValue> = arrayListOf(
            CategoryValue("Россия", 14.22f),
            CategoryValue("США", 7.10f),
            CategoryValue("Германия", 3.49f),
            CategoryValue("Нидерланды", 1.68f),
            CategoryValue("Прочее", 0.14f),
            )

        return items;
    }
}