package com.xin.bob.decorator;

import com.xin.bob.api.Coffee;

/**
 * 糖装饰器
 */

public class SugarDeco extends CoffeeDeco {

    private static final String DESCRIPTION = "Sugar";

    public SugarDeco(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String onDescription() {
        return super.onDescription() + " + " + DESCRIPTION;
    }

    @Override
    public int onPrice() {
        return super.onPrice() + 8;
    }
}
