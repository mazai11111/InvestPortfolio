package com.example.mvp_example.code.Utils


public final class ViewConvertor {
    companion object {

        fun takeWinLoseColor(value:Float):String {
            val winColor = "#8ED957";
            val loseColor = "#EE3870";

            if (value >= 0)
                return loseColor;

            return winColor;
        }
    }
}