package com.example.mvp_example.code.test.backend.model

import com.example.mvp_example.code.general_params_portfolio.model.IGeneralPortfolioParamsModel
import com.example.mvp_example.code.general_params_portfolio.model.objects.GeneralPortfolioItem
import com.google.gson.Gson
import java.io.File

class TakeCorrectTypeModule: IGeneralPortfolioParamsModel {
    override fun takeGeneralElement(): GeneralPortfolioItem {
        val jsonFile = File("D:\\Programs\\Kotlin\\mvp-example\\app\\src\\main\\java\\com\\example\\mvp_example\\code\\tests\\model\\json\\correctType.json")
        val jsonString = jsonFile.readText()

        val item: GeneralPortfolioItem = Gson().fromJson(jsonString, GeneralPortfolioItem::class.java)

        return item;

    }
}

//