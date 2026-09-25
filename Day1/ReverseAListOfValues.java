import java.util.*;

public class ReverseAListOfValues {
public static void reverseString(List<String> menuItem){

    for(String item: menuItem){
        System.out.println(new StringBuilder(item).reverse().toString());
    }
}
    public static void main(String[] args){
        List<String> itemList= Arrays.asList("Rupak","Kumar","Bag");
        reverseString(itemList);
    }
    
}
