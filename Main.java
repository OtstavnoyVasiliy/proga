import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        List<Integer>li=new List();
        for(int i=0;i<6;i++){
            int x=sc.nextInt();
            li.add(x);
        }

        li.print();
        System.out.println(li.isSim());
    }
}
