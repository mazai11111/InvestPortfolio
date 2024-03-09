package com.example.mvp_example.code.categories.Model.Class

import com.example.mvp_example.code.base.DrawableNumber

class CategoryDrawable {
    private val _name: String;
    private val _value: DrawableNumber;

    public val Name: String
        get() = _name;
    public val Value: DrawableNumber
        get() = _value;

    public constructor(
        name: String,
        value: DrawableNumber,
    ) {
        this._name = name
        this._value = value
    }
}