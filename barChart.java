package org.example.array;

import java.util.Scanner;

public class barChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt(),max=0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter element");
            arr[i]= sc.nextInt();
        }
        for (int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Bar chart \n");
        for(int f=max;f>=0;f--){
            for(int i=0;i<n;i++){
                if(arr[i]>f){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }

            }
            System.out.println();

        }
        }
    }
