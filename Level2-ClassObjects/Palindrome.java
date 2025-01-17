import java.util.Scanner;

//Create class Palindrome for generating palindrome of string.
public class Palindrome {
    public static void main(String args[]){
        //Scanner class object to take input string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text :");
        String str = sc.nextLine();

        //Create class objects
        PalindromeChecker result = new PalindromeChecker(str);
        
        //Display result for palindrom.
        if(result.isPalindrome()){
            System.out.println("The text is a palindrome");
        }else{
            System.out.println("The text is not a palindrome");
        }
        sc.close();
    }
}
