package com.joban.study.design.Visitor;

/**
 * Created by Joban on 2018/9/3.
 */
public interface Visitor {

    void visit(ElementA element);

    void visit(ElementB element);

}
