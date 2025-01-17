//Create a class for checking the text as palindrome
public class PalindromeChecker{
    String text;

    PalindromeChecker(String text){
        this.text = text;
    }
    //Method to check the palindrome returning true or false.
    boolean isPalindrome(){
        int size = text.length();
        for(int i = 0; i<size/2; i++){
            if(text.charAt(i) != text.charAt(size-i-1)){
                return false;
            }
        }
        return true;
    }
}
