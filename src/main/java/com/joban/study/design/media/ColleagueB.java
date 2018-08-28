package com.joban.study.design.media;

public class ColleagueB extends Colleague {

  @Override
  public void setNumber(int number, Media media) {
    this.setNumber(number);
    media.affectA(number);
  }
}
