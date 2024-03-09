package com.example.mvp_example.code.drawable_builder;

import com.example.mvp_example.code.base.DrawableNumber;

public interface IDrawableStringBuilder {
    public abstract DrawableNumber Build();
    public abstract DrawableStringBuilder WithSigh();
    public abstract DrawableStringBuilder WithColor();
    public abstract DrawableStringBuilder WithComma();
    public abstract DrawableStringBuilder WithSplitter();
    public abstract DrawableStringBuilder WithRoundToDecimal();
}
