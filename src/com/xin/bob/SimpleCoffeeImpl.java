package com.xin.bob;

import com.xin.bob.api.Coffee;

/**
 * Simple Coffee 最简单原始的咖啡
 * normal coffee raw src.
 *
 * impl onDescription and onPrice
 */

public class SimpleCoffeeImpl implements Coffee {

    private static final String DESCRIPTION = "Simple Coffee";

    @Override
    public String onDescription() {
        return DESCRIPTION;
    }

    @Override
    public int onPrice() {
        return 10;
    }
}
