package com.joban.study.design.media;

public class Main {

  public static void main(String[] args) {
    Colleague colleagueA = new ColleagueA();
    Colleague colleagueB = new ColleagueB();

    Media media = new Media();
    media.register(colleagueA, colleagueB);

    colleagueA.setNumber(100, media);
    System.out.println("colleagueA:" + colleagueA.getNumber() + " colleagueB:" + colleagueB.getNumber());

    colleagueB.setNumber(100, media);
    System.out.println("colleagueA:" + colleagueA.getNumber() + " colleagueB:" + colleagueB.getNumber());

  }

}
