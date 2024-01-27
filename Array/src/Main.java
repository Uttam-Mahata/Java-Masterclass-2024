import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

record GroceryItems(String name, String type, int count) {
     public GroceryItems(String name) {
        this("DAIRY", "FOOD", 1);
    }

    @Override
    public String toString() {
        return "GroceryItems{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", count=" + count +
                '}';
    }
}
public class Main {

    public static void main(String[] args) {
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItems("milk", "food", 1);
        groceryArray[1] = new GroceryItems("apple", "produce", 6);
        groceryArray[2] = "5 banana";
        System.out.println(Arrays.toString(groceryArray));

//        ArrayList objectList = new ArrayList();



        ArrayList<GroceryItems> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItems("Chicken"));

        System.out.println(groceryList);

    }
}