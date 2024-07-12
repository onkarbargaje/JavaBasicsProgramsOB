package sDET;

public class Palindrome_AB {

    public int pal(int p)
    {
        int h = p;
        int palindrome = 0;
        while(p>0)
        {
             int b = p%10;
             palindrome = palindrome*10+b;
             p = p/10;

        } 
        if(h==palindrome)
        {
            System.out.println("The number is palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
        return palindrome;

    }

    public static void main(String[] args)
    {
    	Palindrome_AB pn = new Palindrome_AB();
        int y = pn.pal(121);

    }
}
