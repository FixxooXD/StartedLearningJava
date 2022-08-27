
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<> (2);
        list.add(65);
        list.add(78);
        list.add(56);
        list.add(85);
        list.add(25);

        System.out.println(list);
        //input
//        for (int i=0; i<5;i++){
//          list.add(in.nextInt());
//        }
//        System.out.println(list);
        //to get an  element
        System.out.println(list.get(3));
    }
}
