package recursion;

public class Palindrome {
    public boolean checkPalindrome(String str, int left, int right){
        if (left >= right) {
            return true;
        }
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        return checkPalindrome(str, left + 1, right-1);
    }

    public static void main(String[] args) {
        String name = "MAM";
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.checkPalindrome(name,0,name.length() -1 ));
    }
}
