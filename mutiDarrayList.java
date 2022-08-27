import java.util.ArrayList;
import java .util.Scanner;
public class mutiDarrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(3);

        Scanner in = new Scanner(System.in);

        //Initialization, 3 list had been added
        for (int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }


        //Add Elements int the Added list
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
            list.get(i).add(in.nextInt());
        }}
        System.out.println(list);
    }
}
