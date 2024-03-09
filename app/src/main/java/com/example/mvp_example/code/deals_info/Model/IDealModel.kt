package com.example.mvp_example.code.deals_info.Model

import com.example.mvp_example.code.deals_info.Model.Classes.Deal

interface IDealModel {
    public fun takeOpened(): Deal;
    public fun takeInPlus(): Deal;
    public fun takeInMinus(): Deal;
}