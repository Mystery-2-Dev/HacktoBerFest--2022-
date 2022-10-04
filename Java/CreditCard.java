import java.io.*;
import java.util.*;
class CreditCard
{   
    public boolean validateCreditCard(String str)
    {
        int len= str.length();
        if(!((len==13 || len==16) && str.charAt(0)=='4'))
            return false;
            
        if(len==13)
        {
            for(int i=1;i<len;i++)
            {
                int val=Character.getNumericValue(str.charAt(i));
                if(!(val>=1 && val<=9))
                    return false;
            }
        }
        
        if(len==16)
        {
            for(int i=1;i<=12;i++)
            {
                int val=Character.getNumericValue(str.charAt(i));
                if(!(val>=1 && val<=9))
                    return false;
            }
            for(int i=13;i<=15;i++)
            {
                int val=Character.getNumericValue(str.charAt(i));
                if(!(val>=2 && val<=6))
                    return false;
            }
        }
        return true;
    }
    
    public static void main(String args[])
    {
        String input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        CreditCard obj = new CreditCard();
        
        System.out.println(obj.validateCreditCard(input));
    }
}
