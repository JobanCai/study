package com.joban.study.design.media;

public class ColleagueA extends Colleague {

  @Override
  public void setNumber(int number, Media media) {
    this.setNumber(number);
    media.affectB(number);
  }
}
