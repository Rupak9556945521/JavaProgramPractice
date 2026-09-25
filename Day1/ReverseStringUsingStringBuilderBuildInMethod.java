public class ReverseStringUsingStringBuilderBuildInMethod {
    public static void main(String[] args){
        String str= "Selenium";

        StringBuilder sb= new StringBuilder(str);

        System.out.println("Reverse string is :"+sb.reverse());
    }
}
