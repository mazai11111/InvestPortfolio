package com.example.mvp_example.code.drawable_builder;

import com.example.mvp_example.code.base.DrawableNumber;

public interface IDrawableDirector {
    public abstract DrawableNumber ToStringColoured(float value);
    public abstract DrawableNumber ToStringColouredPercent(float value);
    public abstract DrawableNumber ToNotColouredSimpleString(float value);
}
