public class Main
{
    public String PairedCharacters(String a)
    {
        int len = a.length();
        String fin_str = "";
        for (int i = 0; i < len; i = i + 2)
        {
            fin_str += a.charAt(i);
        }
        return fin_str;
    }
    public static void main (String[] args)
    {
        Main m= new Main();
        String b = "teststring";
        System.out.println("The given string is: "+b);
        System.out.println("The new string is: "+m.PairedCharacters(b));
    }
}