package com.joban.study.design.Visitor;

/**
 * Created by Joban on 2018/9/3.
 */
public interface Element {

    void accept(Visitor visitor);

}
