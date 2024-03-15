package com.example.mvp_example.code.tests.model

import com.example.mvp_example.code.general_params_portfolio.model.IGeneralPortfolioParamsModel
import com.example.mvp_example.code.general_params_portfolio.model.objects.GeneralPortfolioItem
import com.google.gson.Gson
import java.io.File

class GeneralPortfolioParamsIncorrectTypeTest: IGeneralPortfolioParamsModel {
    override fun takeGeneralElement(): GeneralPortfolioItem {
        val jsonFile = File("D:\\Programs\\Kotlin\\mvp-example\\app\\src\\main\\java\\com\\example\\mvp_example\\code\\test\\backend\\model\\json\\incorrectType.json")
        val jsonString = jsonFile.readText()

        val item: GeneralPortfolioItem = Gson().fromJson(jsonString, GeneralPortfolioItem::class.java)

        return item;

    }
}

//