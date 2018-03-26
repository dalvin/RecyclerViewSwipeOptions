package com.dalvinlabs.recyclerviewswipeoptions;

public class ViewModel {

  public final String name;
  public final String size;
  public final String color;
  public final String price;
  private Adapter.SwipeHandler swipeHandler;

  public ViewModel(Product product, Adapter.SwipeHandler swipeHandler) {
    this.name = product.name;
    this.size = product.size;
    this.color = product.color;
    this.price = product.price;
    this.swipeHandler = swipeHandler;
  }

  public void onClickDelete() {
    swipeHandler.remove();
  }

  public void onClickUndo() {
    swipeHandler.undo();
  }
}
