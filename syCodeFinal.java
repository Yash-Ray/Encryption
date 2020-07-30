import java.util.*;
class syCodeFinal
{
    static String s, key;
    public static void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Welcome to Custom Encryption/Decryption Portal. To begin with, Please enter your keyword and key : ");
        String fx="";
        int dd=0;
        System.out.println("Enter a Keyword : ");
        s=x.nextLine();
        System.out.println("Enter a key value : ");
        key=x.next();            
        do{
            System.out.println("\nNow Please enter your choice number as per the given menu :");
            System.out.println("1. Custom Encryption");
            System.out.println("2. Decryption");
            System.out.println("0. Abort the process");
            System.out.println("Enter a choice : ");
            int num=x.nextInt();
            if(num==1)
            {
                encrypt();
                System.out.println("\n\nWant to continue?? Press Y for yes and N for no...");
                fx=x.next();
                if(fx.equalsIgnoreCase("Y"))
                dd=1;
                else
                {
                    dd=0;
                    System.out.println("\nThank you for using the Cyphed Portal.\nHope to see you again.\nHave a nice day!!\n\n**********The Code was brought to you by Shruti Shreya and Yash Ray.**********");
                }            
            }
            else if(num==2)
            {
                decrypt();
                System.out.println("\n\nWant to continue?? Press Y for yes and N for no...");
                fx=x.next();
                if(fx.equalsIgnoreCase("Y"))
                dd=1;
                else
                {
                    dd=0;
                    System.out.println("\nThank you for using the Cyphed Portal.\nHope to see you again.\nHave a nice day!!\n\n**********The Code was brought to you by Shruti Shreya and Yash Ray.**********");
                }            
            }
            else if(num==0)
            {
                System.out.println("\nThank you for using the Cyphed Portal.\nHope to see you again.\nHave a nice day!!\n\n**********The Code was brought to you by Shruti Shreya and Yash Ray.**********");
                break;
            }
            else
            {
                System.out.println("Invalid Choice entered.\nProcess Aborted.");
                break;
            }
        }while(dd>=1);
    }
    public static void encrypt()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter a message : ");
        String msg=x.nextLine();
        s=s.toUpperCase();
        int i, j, flag=0, pos=0, k=0;
        char ch1,ch2;
        String A[]=new String[s.length()], wd="", new_wd="";
        String T[]=new String[msg.length()];
        
        //to add indivisual alphabets of the keyword into a String array
        for(i=0;i<s.length();i++)
        A[i]=Character.toString(s.charAt(i));
        
        //to add the alphabets of the message to be encrypted into an array of String datatype
        for(i=0;i<msg.length();i++)
        T[i]=Character.toString(msg.charAt(i));
        
        //to remove repititions
        for(i=0;i<s.length();i++)
        {
            for(j=i+1;j<s.length();j++)
            {
                if(A[i].equalsIgnoreCase(A[j]))
                A[j]="";
            }
        }
        for(i=0;i<s.length();i++)
        if(A[i]!="")
        wd+=A[i];
                        
        //to add the leftover alphabets after the new word
        for(i=65;i<=90;i++)
        {
            for(j=0;j<wd.length();j++)
            {
                if((Character.toString((char)i)).equals(Character.toString(wd.charAt(j))))
                flag=1;
                else
                continue;
            }
            if(flag==0)
            {
                wd+=Character.toString((char)i);
            }
            else
            {
                flag=0;
                continue;
            }
        }        
        
        //to insert the formed word into an array
        String EC[]= new String[wd.length()];
        String NEC[]= new String[wd.length()];
        for(i=0;i<wd.length();i++)
        EC[i]=Character.toString(wd.charAt(i));
        
        //to find and rearrange the word array EC
        for(i=0;i<wd.length();i++)
        if(key.equalsIgnoreCase(EC[i]))
        {
            pos=i;
            break;
        }
        //System.out.println(pos);
        for(i=pos;i<wd.length();i++)
        NEC[k++]=EC[i];
        for(i=0;i<pos;i++)
        NEC[k++]=EC[i];
        
        //to finally encrypt the message 
        for(i=65;i<=90;i++)
        {
            for(j=0;j<msg.length();j++)
            {
                if((Character.toString((char)i)).equalsIgnoreCase(Character.toString(msg.charAt(j))))
                T[j]=NEC[i-65];
            }
        }
        
        //to display the encrypted message
        System.out.println("\nThe Encrypted Message is : ");
        for(i=0;i<msg.length();i++)
        System.out.print(T[i]);
    }
    public static void decrypt()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter message to be decrypted : ");
        String ec_msg=x.nextLine();
        s=s.toUpperCase();
        int i, j, flag=0, pos=0, k=0;
        char ch1,ch2;
        String A[]=new String[s.length()], wd="", new_wd="";
        String T[]=new String[ec_msg.length()];
        
        //to add indivisual alphabets of the keyword into a String array
        for(i=0;i<s.length();i++)
        A[i]=Character.toString(s.charAt(i));
        
        //to add the alphabets of the message to be encrypted into an array of String datatype
        for(i=0;i<ec_msg.length();i++)
        T[i]=Character.toString(ec_msg.charAt(i));
        
        //to remove repititions
        for(i=0;i<s.length();i++)
        {
            for(j=i+1;j<s.length();j++)
            {
                if(A[i].equalsIgnoreCase(A[j]))
                A[j]="";
            }
        }
        for(i=0;i<s.length();i++)
        if(A[i]!="")
        wd+=A[i];
                        
        //to add the leftover alphabets after the new word
        for(i=65;i<=90;i++)
        {
            for(j=0;j<wd.length();j++)
            {
                if((Character.toString((char)i)).equals(Character.toString(wd.charAt(j))))
                flag=1;
                else
                continue;
            }
            if(flag==0)
            {
                wd+=Character.toString((char)i);
            }
            else
            {
                flag=0;
                continue;
            }
        }        
        
        //to insert the formed word into an array
        String EC[]= new String[wd.length()];
        String NEC[]= new String[wd.length()];
        for(i=0;i<wd.length();i++)
        EC[i]=Character.toString(wd.charAt(i));
        
        //to find and rearrange the word array EC
        for(i=0;i<wd.length();i++)
        if(key.equalsIgnoreCase(EC[i]))
        {
            pos=i;
            break;
        }
        for(i=pos;i<wd.length();i++)
        NEC[k++]=EC[i];
        for(i=0;i<pos;i++)
        NEC[k++]=EC[i];
        
        String F[]=new String[ec_msg.length()];
        int alph=65;
        for(i=0;i<wd.length();i++)
        {
            for(j=0;j<ec_msg.length();j++)
            {
                if(NEC[i].equalsIgnoreCase(Character.toString(ec_msg.charAt(j))))
                F[j]=Character.toString((char)alph);
            }
            alph++;
        }
        
        //to display the decrypted message
        System.out.println("\nThe Decrypted Message is :");
        for(i=0;i<ec_msg.length();i++)
        if(F[i]!=null)
        System.out.print(F[i]);
        else
        System.out.print(" ");
        System.out.println("");
    }
}
    