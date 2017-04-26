public class ShoppingItem {

  private String ItemName;
    private int ItemQty;

  public ShoppingItem() {
    ItemName = "Fruit";
    ItemQty = 1;
  }
  public ShoppingItem(String ItemName, int ItemQty) {
    this.ItemName = ItemName;
    this.ItemQty = ItemQty;
  }
  public String getItemName() {
    return ItemName;
  }
  public int getItemQty() {
    return ItemQty;
  }
  public void setItemName(String ItemName) {
    this.ItemName = ItemName;
  }
  public void setItemQty(int ItemQty) {
    this.ItemQty = ItemQty;
  }

  @Override
  public String toString() {
    String state = ItemName + " - " + ItemQty;
    return state;
  }
}
