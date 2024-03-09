package com.example.mvp_example.code.drawable_builder.signer;

public class PercentAdder extends ISigner{
    @Override
    public String WithSign(String value) {
        return value + " %";
    }
}
