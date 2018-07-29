package com.xin.bob.decorator;

import com.xin.bob.api.Coffee;

/**
 * 牛奶装饰器
 * 1. 继承装饰器基类
 * 2. 覆盖装饰器中的方法, 内含方法调用与父类保持一致
 */

public class MilkDeco extends CoffeeDeco {

    private static final String DESCRIPTION = "Milk";

    public MilkDeco(Coffee coffee) {
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
