package com.example.mvp_example.code.deals_info.Model.Classes

public class Deal {
    private val _count: Int;
    private val _prise: Float;

    public val Count:Int
        get() = _count;
    public val Prise:Float
        get() = _prise;

    public constructor(
        count: Int,
        price: Float

    ) {
        this._count = count
        this._prise = price
    }
}