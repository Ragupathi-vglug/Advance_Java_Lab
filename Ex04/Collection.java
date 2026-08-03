import java.util.*;
class Collection{
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        
        System.err.println("Enter Five Numbers :");
        for(int i=1;i<=5;i++){
            System.out.print("Enter the Element "+i+" :");
            al.add(s.nextInt());
        }
        int sum=0;
        for (int a:al){
            sum+=a;
        }
        System.out.println("The Sum of the Elements is :"+sum);

        LinkedList<String> l=new LinkedList<>();
        HashSet<String> hs=new HashSet<>();
        TreeSet<String> ts=new TreeSet<>();
    

        System.out.println("\nEnter Five Letters :");
        s.nextLine();
        for(int i=1;i<=5;i++){
            System.out.print("Enter the Letter "+i+" :");
            String str=s.nextLine();
            l.add(str);
            hs.add(str);
            ts.add(str);

        }
        System.out.println("\nThe Linked List Elements are :"+l);
        System.out.print("Enter the Element to remove :");
        String s1=s.nextLine();
        System.out.print("Enter the Position to remove :");
        int s2=s.nextInt();
        System.out.println("Before Remove :"+l);
        l.remove(s1);
        l.remove(s2);
        System.out.println("After Remove :"+l);

        System.out.println("\nThe HashSet(Unordered) elements are :"+hs);
        System.out.println("\nThe Treeset(Ordered) Elements are :"+ts);
    }
}