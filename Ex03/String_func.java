import java.util.*;
class String_func{
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        
        System.out.print("Enter the String :");
        String str=s.nextLine();

        System.out.print("Enter the string to check the given string is starts with it :");
        String a1=s.nextLine();
        
        System.out.print("Enter the string to check the given string is Ends with it :");
        String a2=s.nextLine();

        System.out.print("Enter the string to find position :");
        String p1=s.nextLine(); 
        
        System.out.print("Enter the position to find character :");
        int p2=s.nextInt();
        s.nextLine();
        
        System.out.println("\n");

        System.out.println("The length of the string is :"+str.length());
        System.out.println("The Upper case is :"+str.toUpperCase());
        System.out.println("The Lower case is :"+str.toLowerCase());
        
        System.out.println("The string is starts with the \""+a1+"\" is :"+str.startsWith(a1));
        System.out.println("The string is ends with the \""+a2+"\" is :"+str.endsWith(a2));
        
        System.out.println(p1+" position is :"+str.indexOf(p1));
        System.out.println("The character in "+p2+" is :"+str.charAt(p2));

        System.out.println("The substring is :"+str.substring(1,7));

        // String Buffer
        System.out.println("\n----- StringBuffer Functions -----");
        
        
        StringBuffer str2=new StringBuffer(str);
        System.out.print("Enter the String to append :");
        String ap=s.nextLine();
        str2.append(ap);
        System.out.println("After append :"+str2);

        System.out.println("\n");

        System.out.print("Enter the String to Insert :");
        String i1=s.nextLine();
        System.out.print("Enter the position to Insert :");
        int i2=s.nextInt();
        str2.insert(i2,i1);
        System.out.println("After Insert :"+str2);

        System.out.println("\n");

        System.out.print("Enter the position to delete a character :");
        int d1=s.nextInt();
        str2.deleteCharAt(d1);
        System.out.println("After delete : "+str2);

        System.out.println("\n");

        System.out.println("Reverse string :"+str2.reverse());
    }
}