package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list2d = new ArrayList<>();

        // create 3 inner lists
        for (int i = 0; i < 3; i++) {
            list2d.add(new ArrayList<>());
        }

        // fill them with inputs
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2d.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list2d);
    }
}
