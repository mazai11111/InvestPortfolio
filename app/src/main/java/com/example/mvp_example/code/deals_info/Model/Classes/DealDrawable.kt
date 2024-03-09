package com.example.mvp_example.code.deals_info.Model.Classes

import com.example.mvp_example.code.base.DrawableNumber

class DealDrawable {
    private val _count: Int;
    private val _prise: DrawableNumber;

    public val Count: Int
        get() = _count;
    public val Prise: DrawableNumber
        get() = _prise;

    public constructor(
        count: Int,
        price: DrawableNumber

    ) {
        this._count = count
        this._prise = price
    }
}