package com.example.mvp_example.code.drawable_builder;

import com.example.mvp_example.code.base.DrawableNumber;
import com.example.mvp_example.code.drawable_builder.signer.ISigner;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class DrawableStringBuilder implements IDrawableStringBuilder {
    private float _changeableObject;
    private String _processObject;
    private String _color = "#000000";

    private ISigner _signStrategy;

    public DrawableStringBuilder(float changeableObject, ISigner signStrategy){
        _changeableObject = changeableObject;
        _processObject = Float.toString(changeableObject);
        _signStrategy = signStrategy;
    }

    public DrawableNumber Build(){
        DrawableNumber drawable = new DrawableNumber(_processObject, _color);

        return drawable;
    }

    public DrawableStringBuilder WithSigh(){
        _processObject = _signStrategy.WithSign(_processObject);

        return this;
    }

    public DrawableStringBuilder WithColor(){
        final String winColor = "#8ED957";
        final String loseColor = "#EE3870";

        if (_changeableObject >= 0)
            _color = winColor;
        else
            _color = loseColor;

        return this;
    }

    public DrawableStringBuilder WithComma(){
        final char dot = '.';
        final char comma = ',';

        _processObject = _processObject.replace(dot, comma);

        return this;
    }

    public DrawableStringBuilder WithSplitter(){
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();

        final char toChange = ' ';

        symbols.setGroupingSeparator(toChange);

        DecimalFormat decimalFormat = new DecimalFormat("#,###.##", symbols);
        String formattedNumber = decimalFormat.format(_changeableObject);

        _processObject = formattedNumber;

        return this;
    }

    public DrawableStringBuilder WithRoundToDecimal() {
        final int decimalPlaces = 2;

        if (decimalPlaces < 0) {
            throw new IllegalArgumentException("Decimal places cannot be negative");
        }

        float factor = (float) Math.pow(10, decimalPlaces);
        _changeableObject = Math.round(_changeableObject * factor) / factor;

        return this;
    }
}


