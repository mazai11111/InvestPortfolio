package com.example.mvp_example.code.deals_info.Model.Classes

import com.example.mvp_example.code.deals_info.Model.IDealModel

class DealStubModel: IDealModel {
    override fun takeOpened(): Deal {
        var item = Deal(5, -140021.84f);

        return item;
    }

    override fun takeInPlus(): Deal {
        var item = Deal(15, 16021.84f);

        return item;
    }

    override fun takeInMinus(): Deal {
        var item = Deal(9, -1000.84f);

        return item;
    }
}