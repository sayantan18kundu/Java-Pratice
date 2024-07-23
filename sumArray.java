package org.example.array;

import java.util.Scanner;

public class sumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the first array");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for (int i=0;i<n1;i++){
            System.out.println("Enter element for 1st array: ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter length of the second array");
        int n2 = sc.nextInt();
        int[] arr2= new int[n2];
        for(int i=0;i<n2 ; i++){
            System.out.println("Enter element for 2nd array:");
            arr2[i] = sc.nextInt();
        }

        int max=Math.max(n1,n2);

        int[] sum = new int[max];
        int c1 = n1-1;
        int c2 = n2-1;
        int carry = 0;

        while(max>0){
            int s = 0;
            if (c1>=0){
                s+=arr1[c1];
                c1--;
            }
            if (c2>=0){
                s+=arr2[c2];
                c2--;
            }
            s+=carry;
            if (s>=10){
                carry = 1;
                s = s%10;
            }
            else{
                carry = 0;
            }
            sum[max-1] = s;

            max--;
        }

        System.out.println("Sum of the two arrays is: ");
        System.out.print(carry);
        for (int j : sum) {
            System.out.print(j);
        }
    }
}