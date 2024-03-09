package com.example.mvp_example.code.base;

public class DrawableNumber {
    private String _value;
    private String _color;

    public String GetValue(){
        return _value;
    }
    public String GetColor(){
        return _color;
    }

    public DrawableNumber(String value, String color){
        _value = value;
        _color = color;
    }
}
