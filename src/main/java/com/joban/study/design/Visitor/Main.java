package com.joban.study.design.Visitor;

/**
 * Created by Joban on 2018/9/3.
 */
public class Main {

    public static void main(String[] args) {
        Element elementA = new ElementA();
        Element elementB = new ElementB();

        ObjectStruct objectStruct = new ObjectStruct();
        objectStruct.register(elementA);
        objectStruct.register(elementB);

        Visitor visitorA = new VisitorA();
        Visitor visitorB = new VisitorB();

        objectStruct.accept(visitorA);
        objectStruct.accept(visitorB);

    }

}
