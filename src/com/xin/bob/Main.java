package com.xin.bob;

import com.xin.bob.api.Coffee;
import com.xin.bob.decorator.MilkDeco;
import com.xin.bob.decorator.SugarDeco;

public class Main {

    public static void main(String[] args) {

//        Coffee coffee = new SimpleCoffeeImpl();
//        coffee = new MilkDeco(coffee);
//        coffee = new SugarDeco(coffee);

        // 类似Java中IO操作的流的套接
        Coffee coffee = new MilkDeco(new SugarDeco(new SimpleCoffeeImpl()));
        System.out.println(coffee.onDescription());
        System.out.println(coffee.onPrice());
    }
}
