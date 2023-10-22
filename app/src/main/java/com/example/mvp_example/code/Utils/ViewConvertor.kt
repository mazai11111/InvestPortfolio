package com.example.mvp_example.code.Utils

import kotlin.math.pow


public final class ViewConvertor {
    companion object {

        fun takeWinLoseColor(value:Float):String {
            val winColor = "#8ED957";
            val loseColor = "#EE3870";

            if (value >= 0)
                return winColor;

            return loseColor;
        }

        fun roundToDecimal(value: Float, decimalPlaces: Int): Float {
            if (decimalPlaces < 0) {
                throw IllegalArgumentException("Decimal places cannot be negative")
            }

            val factor = 10.0.pow(decimalPlaces.toDouble()).toFloat()
            return (value * factor).toInt() / factor
        }
    }
}