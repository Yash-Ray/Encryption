import java.util.*;
class code
{
    public static void Caeser()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("ENTER THE PLAIN TEXT : ");
        System.out.println();
        String s=x.nextLine();
        s=s.toUpperCase();
                
        System.out.print("ENTER KEY VALUE FOR THE CIPHER TEXT : ");
        int n=x.nextInt();
        if(n>=0 && n<=26)
        {
            System.out.println();
            char ch;
        
            System.out.println("\nTHE ENCRYPTED MESSAGE IS : ");
        
            for(int i=0;i<s.length();i++)
            {
                ch=s.charAt(i);
                if(ch==32)
                {
                    System.out.print(" ");
                    continue;                
                }
                else
                {
                    ch+=n;
                    if(ch>90)
                    {
                        int n1=(ch)-26;
                        System.out.print((char)(n1));
                    }
                    else
                    System.out.print(ch);
                }
            }        
        }
        else
        System.out.println("INVALID KEY VALUES");
    }  
    public static void rail_fence()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the plain text :");
        String s=x.nextLine();
        s=s.toUpperCase();
        String ns="";
        
        int l=s.length();
        
        char ch;
        
        System.out.println("\nTHE ENCRYPTED MESSAGE IS :");
        
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            ns=ns+ch;
            else
            continue;
        }
        
        int l1=ns.length();
        
        for(int i=0;i<l1;i=i+2)
        System.out.print(ns.charAt(i));
        for(int j=1;j<l1;j+=2)
        System.out.print(ns.charAt(j));
    }
    public static void Custom1()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("ENTER PASSWORD WHICH CONTAINS ONLY ALPHABETS :");
        String p=x.nextLine();
        
        String wd="";
        char ch, ch1;
        
        int i, j, k, q, n;
        
        System.out.println("ENTER THE KEY VALUE :");
        n=x.nextInt();
        System.out.println("ENTER THE SET-CALL VALUE :");
        q=x.nextInt();
        
        for(i=0;i<p.length();i++)
        {
            ch=p.charAt(i);
            if(ch!=32)
            wd+=ch;
            else
            continue;
        }
        
        int l=wd.length();
        
        System.out.println("\nTHE ENCRYPTED MESSAGE IS :");        
        for(j=0;j<l;j++)
        {
            ch1=wd.charAt(j);
            for(k=0;k<n;k++)
            {
                System.out.print((char)ch1+q);
                q+=n;
            }
        }
    }

    public static void Custom2()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("ENTER A PASSWORD CONTAINING ONLY ALPHABETS :");
        String s=x.nextLine();
        
        String wd="";
        
        int i, j, c=0, k;
        char ch=0, ch1;
        
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch!=32)
            wd+=ch;
            else
            continue;
        }
        
        System.out.println("ENTER THE KEY VALUE :");
        int key=x.nextInt();
        
        for(j=0;j<wd.length();j++)
        {
            ch1=wd.charAt(j);
            if(c%2==0)
            k=ch1+key;
            else
            k=ch1-key;
        
            System.out.print((char)k);
        }
    }
}
