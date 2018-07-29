package com.xin.bob.decorator;

import com.xin.bob.api.Coffee;

/**
 * 装饰器基类
 * 1. 实现咖啡接口
 * 2. 构造函数传入咖啡接口实例, 或者说是持有咖啡接口实例
 * 3. 实现方法中, 直接调接口实例的方法
 */

public class CoffeeDeco implements Coffee {

    private Coffee coffee;

    CoffeeDeco(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String onDescription() {
        return coffee.onDescription();
    }

    @Override
    public int onPrice() {
        return coffee.onPrice();
    }
}
