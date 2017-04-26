import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
  ArrayList<ShoppingItem> list = new ArrayList<ShoppingItem>();

    public void addItem()
    {
      System.out.println();
      System.out.println("Enter a new item");
      Scanner keyboard = new Scanner(System.in);
      String ItemName = keyboard.nextLine();

      System.out.println("Enter quantity");
      int ItemQty = keyboard.nextInt();

      ShoppingItem Item = new ShoppingItem(ItemName, ItemQty);

      list.add(Item);
      System.out.println("Item added");
    }
    public void DisplayItem(){
      System.out.println("");
      System.out.println("***** Your Shopping List *****");
      for (ShoppingItem x : list) {
        System.out.println(x.toString());
      }
    }
}
