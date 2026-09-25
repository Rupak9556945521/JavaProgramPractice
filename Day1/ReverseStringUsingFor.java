/*nput

Selenium

Expected Output

muineleS

Rules:

First solve using a for loop. */

public class ReverseStringUsingFor{
    public static void main(String[] args){
        String str="Selenium";
        String rev="";

        for(int i=str.length()-1; i>=0; i--){
            rev = rev+ str.charAt(i);
        }

        System.out.println("Reversed Order is "+ rev);
    }
}