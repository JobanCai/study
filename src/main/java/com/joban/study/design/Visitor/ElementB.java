package com.joban.study.design.Visitor;

/**
 * Created by Joban on 2018/9/3.
 */
public class ElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
