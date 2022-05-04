package com.company;
import java.util.Scanner;
class call1 {
    void k1(String s,int k){
        char [] s1 = s.toCharArray();

        int c = 0;
        for (int i = 0; i < s.length()/2;i++){
            if(s1[s1.length - i - 1] != s1[i]){
                c++;
            }
        }if (c == k){
            System.out.println("zero");
        }else if (c > k){
            System.out.println(c-k);
        }else {
            System.out.println(k-c);
        }
    }
}
public class kickstart1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        call1 obj = new call1();
        int testcases= sc.nextInt();
        while (testcases-->0){
            String str= sc.next();
            int k =sc.nextInt();
            obj.k1(str,k);
        }
    }
}


