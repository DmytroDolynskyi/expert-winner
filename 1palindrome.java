public class Palindrome {

    public static void main(String[] args) {
        String a = "123ACA321";
        StringBuffer rev = new StringBuffer(a).reverse();
        String strRev = rev.toString();
        if(a.equalsIgnoreCase(strRev)) {
            System.out.println("Your string: " + a + " is a palindrome");
        }
        else {
            System.out.println("Your string: " + a + " is not palindrome");
        }
    }
}