import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(5);// use "add" to add items in the array
        myArray.add(8);
        System.out.println(myArray); // printing the array

        System.out.println(myArray.get(1)); // using "get" method to get the value at a specific index value

        myArray.set(0, 9); // using "set" method to set a value at a specific index
        System.out.println(myArray);

        myArray.remove(1); // using "remove" method to remove an item from a specific index
        System.out.println(myArray);

        myArray.clear(); // using "clear" method to completely clear the whole array
        System.out.println(myArray);

        myArray.size(); // using "size" method to print the size of the array

        // filling up the array
        myArray.add(9);
        myArray.add(1);
        myArray.add(4);
        myArray.add(5);
        myArray.add(8);
        myArray.add(6);
        System.out.println(myArray);

        Collections.sort(myArray); // sorting the array using Collections package
        System.out.println(myArray);
    }
}
