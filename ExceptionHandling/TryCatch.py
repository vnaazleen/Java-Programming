# Problem statement: https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            
            System.out.println(n1 / n2);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
