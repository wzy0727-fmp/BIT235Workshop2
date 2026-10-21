import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        
        boolean isEqual = s1.equals(s2);
        System.out.println("the two given strings are equal: "+ isEqual);
        
        char first1 = s1.charAt(0);
        char first2 = s2.charAt(0);
        System.out.println("First char of string1: "+first1);
        System.out.println("First char of string2: "+first2);
        System.out.println("First characters equal? "+ (first1 == first2));
        sc.close();
    }
}
