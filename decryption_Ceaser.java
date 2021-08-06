import java.util.*;
class decode
{
    public static void Caeser()
    {
        Scanner x =new Scanner(System.in);
        
        System.out.println("ENTER THE ENCRYPTED MESSAGE : ");
        String em=x.nextLine();
        em=em.toUpperCase();
        
        System.out.println("ENTER THE KEY VALUE : ");
        int n=x.nextInt();
        
        char ch;
        
        System.out.println("\nTHE PLAIN TEXT IS :");
        
        for(int i =0;i<em.length();i++)
        {
            ch=em.charAt(i);
            if(ch==32)
            continue;
            else
            {
                int k=ch-n;
                if(ch<60)
                {
                    ch+=26;
                    System.out.print((char)k);
                }
                else
                System.out.print((char)k);
            }
        }
    }
}
        
            
