package edu.cnm.deepdive;

import java.util.List;

public abstract class Player<T extends Hand> {

  private T hand;

  public abstract boolean canAccept();

  public void accept(Card card) {
    hand.add(card);
  }

  public T getHand() {
    return hand;
  }

  public void reset() {
    hand.reset();
  }
}
