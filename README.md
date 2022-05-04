# gfgsrm-mandatory-task-
#Mandatory task of gfg srm
Problem:
Charles defines the goodness score of a string as the number of indices i such that Si≠SN−i+1 where 1≤i≤N/2 (1-indexed). For example, the string CABABC has a goodness score of 2 since S2≠S5 and S3≠S4.Charles gave Ada a string S of length N, consisting of letters and asked her to convert it into a string with a goodness score of K. In one operation, Ada can change any character in the string to any letter. Could you help Ada find the minimum number of operations required to transform the given string into a string with goodness score equal to K?
Solution(java):
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

Explanation:
As per the given definition of operation, Ada can only change the goodness score by one in a single move. Therefore to get a string with the required goodness score in the minimum number of operations Ada can either increase or decrease the goodness score by one in each step. Let us assume there are X indices(≤N/2 (1-indexed)) i in the given string S such that Si≠SN−i+1. We have 3 cases now.

Case 1: X=K,
In this case, Ada already has the string which has a goodness score of K. Therefore number of operations required is 0.
Case 2: X>K,
In this case, Ada can change (X−K) letters at indices i (1≤i≤N/2 (1-indexed)) that satisfy Si≠SN−i+1 to the letter at SN−i+1. Then she will have a string with a goodness score of K. Therefore the minimum number of operations is (X−K).
Case 3: X<K,
In this case, Ada can change (K−X) letters at indices i (1≤i≤N/2 (1-indexed)) that satisfy Si=SN−i+1 to any other uppercase letter other than the one at SN−i+1. As a result, she will have a string with a goodness score of K. Therefore the minimum number of operations is (K−X).

Time complexity of code: O(N)
Space complexity of code: O(N)




