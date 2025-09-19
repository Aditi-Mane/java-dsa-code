package Basic_Maths;

public class PalindromeCheck {
    public static void rev(int n){
        int temp = n;
        int revNum = 0;
        while(temp != 0){
            int lastDigit = temp % 10;
            revNum = revNum * 10 + lastDigit;
            temp = temp / 10;
        }
        if(revNum == n){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args) {
        PalindromeCheck.rev(151);
    }
}
