import java.util.*;
class Date_Time{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Calendar cal=Calendar.getInstance();
        Date dt=new Date();

        System.out.println("\t Date and Time" );

        System.out.println("\nThe Current Date,Time and Timezone in a System is : "+dt);
        System.out.println("The Current Time in Milli Second is :"+dt.getTime());
        
        String months[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Oct","Sep","Nov","Dec"};
        System.out.print("\nDate : ");
        System.out.print(months[cal.get(Calendar.MONTH)]);
        System.out.print(" " + cal.get(Calendar.DATE));
        System.out.print(", " + cal.get(Calendar.YEAR));

        System.out.print("\nTime : ");
        System.out.print(cal.get(Calendar.HOUR));
        System.out.print(" : "+cal.get(Calendar.MINUTE));
        System.out.print(" : "+cal.get(Calendar.SECOND));

        System.out.println("\n");
        System.out.print("Enter the Hour :");
        int h=s.nextInt();
        System.out.print("Enter the Minutes :");
        int m=s.nextInt();
        System.out.print("Enter the Seconds :");
        int sc=s.nextInt();

        cal.set(Calendar.HOUR,h);
        cal.set(Calendar.MINUTE,m);
        cal.set(Calendar.SECOND,sc);

        System.out.print("\nUpdated Time :");
        System.out.print(cal.get(Calendar.HOUR));
        System.out.print(" : "+cal.get(Calendar.MINUTE));
        System.out.print(" : "+cal.get(Calendar.SECOND)+"\n");

    }
}