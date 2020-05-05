package Lesson;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Solution {
//This program finds whether a number is odd or even and also in a particular range

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Enter a number:");
            int N = scanner.nextInt();

            String ans = " ";
            if( N >=1 && N<=100){
                if (N%2 == 1){
                    ans = "Odd";
                }
                else if (N % 2 == 0){
                    if(N >=2 && N<5 || N>20)
                        ans = "answer is even between 2 and less than 5 or greater than 20";
                    else if  (N >= 6 || N<=20)
                        ans = "Even between 6 and 20";
                }

            }

            System.out.println(ans);

            scanner.close();
        }
    }

