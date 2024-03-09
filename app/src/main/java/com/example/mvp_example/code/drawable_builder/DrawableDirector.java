package com.example.mvp_example.code.drawable_builder;

import com.example.mvp_example.code.base.DrawableNumber;
import com.example.mvp_example.code.drawable_builder.signer.ISigner;
import com.example.mvp_example.code.drawable_builder.signer.PercentAdder;
import com.example.mvp_example.code.drawable_builder.signer.RubleAdder;

public class DrawableDirector implements IDrawableDirector {
    public DrawableDirector(){
    }

    public DrawableNumber ToStringColoured(float value){
        MakeBaseColouredSigh(value, new RubleAdder());

        DrawableNumber drawable = MakeBaseColouredSigh(value, new RubleAdder());

        return drawable;
    }

    public DrawableNumber ToStringColouredPercent(float value){
        DrawableNumber drawable = MakeBaseColouredSigh(value, new PercentAdder());

        return drawable;
    }

    public DrawableNumber ToNotColouredSimpleString(float value){
        DrawableNumber drawable = MakeBase(value, new RubleAdder()).Build();

        return drawable;
    }

    private DrawableNumber MakeBaseColouredSigh(float value, ISigner signStrategy){
        DrawableNumber item = MakeBase(value, signStrategy).WithColor().Build();

        return item;
    }

    private DrawableStringBuilder MakeBase(float value, ISigner signStrategy){
        DrawableStringBuilder item = new DrawableStringBuilder(value, signStrategy).WithSplitter().WithComma().WithSigh();

        return item;
    }
}
