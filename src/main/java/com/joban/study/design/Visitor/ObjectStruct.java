package com.joban.study.design.Visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Joban on 2018/9/3.
 */
public class ObjectStruct {

    private List<Element> elements = new ArrayList<>();

    public void register(Element element) {
        elements.add(element);
    }

    public void accept(Visitor visitor) {
        elements.forEach(element -> {
            element.accept(visitor);
        });
    }

}
