package com.joban.study.design.media;

public class Media {

  private Colleague colleagueA;

  private Colleague colleagueB;

  public void register(Colleague colleagueA, Colleague colleagueB) {
    this.colleagueA = colleagueA;
    this.colleagueB = colleagueB;
  }

  public void affectA(int number) {
    colleagueA.setNumber(number - 1);
  }

  public void affectB(int number) {
    colleagueB.setNumber(number + 10);
  }

}
