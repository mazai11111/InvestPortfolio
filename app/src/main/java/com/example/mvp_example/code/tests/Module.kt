package com.example.mvp_example.code.tests

import com.example.mvp_example.code.drawable_builder.DrawableStringBuilder
import com.example.mvp_example.code.drawable_builder.signer.PercentAdder
import org.junit.Test

import org.koin.test.AutoCloseKoinTest


class Module: AutoCloseKoinTest() {

    @Test
    fun testSignAdder() {

        var value = DrawableStringBuilder(1111f, PercentAdder()).WithSigh().Build();


        assert(value.GetValue() == "1111.0 %")
    }

    @Test
    fun testPositiveColor() {
        var value = DrawableStringBuilder(1111f, PercentAdder()).WithColor().Build();

        var positiveColor = "#8ED957"

        assert(value.GetColor() == positiveColor)
    }

    @Test
    fun testRoundToDecimalWithPositiveNumber(){
        var value = DrawableStringBuilder(-1111f, PercentAdder()).WithColor().Build();

        val loseColor = "#EE3870"

        assert(value.GetColor() == loseColor)

    }
}