package com.joban.study.design.Visitor;

/**
 * Created by Joban on 2018/9/3.
 */
public class VisitorB implements Visitor {

    @Override
    public void visit(ElementA element) {
        //访问者B对于元素A的操作
        System.out.println(element + "访问者B对于元素A的操作");
    }

    @Override
    public void visit(ElementB element) {
        //访问者B对于元素B的操作
        System.out.println(element + "访问者B对于元素B的操作");
    }
}
