package com.example.mvp_example.code.categories.Model.Class

class CategoryValue {
    private val _name: String;
    private val _value: Float;

    public val Name: String
        get() = _name;
    public val Value:Float
        get() = _value;

    public constructor(
        name: String,
        value: Float,
    ) {
        this._name = name
        this._value = value
    }
}