package com.joban.study.design.media;

public abstract class Colleague {

  private int number;

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public abstract void setNumber(int number, Media media);

}
