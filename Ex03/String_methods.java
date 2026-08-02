import java.util.*;
class String_methods{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the string :");
        String str=s.nextLine();
        // Strings

        // 1)Length
        System.out.print("The length of the string is :"+str.length());
        // 2)charAt()
        System.out.print("\nEnter the Index value to find the value :");
         int ch_index=s.nextInt();
        System.out.println(ch_index+" position is :"+str.charAt(ch_index));
        // 5)toUpperCase(),toLowerCase()
        System.out.println("The upper case is :"+str.toUpperCase());
        System.out.println("The lower case is :"+str.toLowerCase());
        // 6)StratWith(),endsWith()
        
        // 7)indexOf(),lastIndexOf()
        // 8)getChars()
        // 3)equals(),equalsignoreCase()

        // String buffer
        // 1)Capacity(),setLength()
        // 2)append()
        // 3)insert()
        // 4)reverse()
        // 5)delete(),deleteChatAt()
        // 6)replace()
        // 7)substring()
    }
}