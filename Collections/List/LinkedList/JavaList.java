# Problem statement: https://www.hackerrank.com/challenges/java-list/problem

import java.util.Scanner;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String op = sc.next();
        
            if(op.equals("Insert")) {
                // code to insert an element into list
                int pos = sc.nextInt();
                int val = sc.nextInt();
            
                list.add(pos, val);
            } else {
                // code to delete an element into list
                int ind = sc.nextInt();
                list.remove(ind);
            }
        }
        
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
