/*
 * Copyright (c) Nishant Sonar 2022.
 */

//Java code to separate odd and even numbers in an array and put it in separate array
package End_Module_Test;

import java.util.Scanner;

public class Array {
    static Scanner scnScanner = new Scanner(System.in);
//    Creating Array
    int[] arr;
//creating new Method to Insert The Value In The Array
    public void InsertValue(int size){
        arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element value : ");
            arr[i] = scnScanner.nextInt();
        }
    }

// Show All Array
    public void ShowFullArray(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ==> ");
        }
    }

//    Creating Method For even array
    public void EvenArray(){
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                size++;
            }
        }
        System.out.println(size);
        int[] evenarr = new int[size];
        System.out.println("Even Numbers Are: ");
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
              evenarr[ j++ ] = arr[ i ];
                }
        }
        for (int k : evenarr) {
            System.out.print(k + " ==>");
        }
    }
    public void OddArray(){
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[ i ] % 2 != 0){
                size++;
            }
        }
        int [] oddArr = new int[size];
        System.out.println("Odd Numbers Are: ");
        System.out.println("Even Numbers Are: ");
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr [ i ] % 2 == 0) {
                oddArr [ j++ ] = arr [ i ];
            }
        }
        for (int k : oddArr) {
            System.out.print(k + " ==>");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array : ");
        int size = scnScanner.nextInt();
        Array obj = new Array();
//        obj.GetValue(size);
//        obj.EvenArray(size);
        char choice;
        do {
            System.out.println("1.Add Data\n2.Show data\n3.Even Numbers\n4.Odd Numbers");
            int value = scnScanner.nextInt();
            switch (value) {
                case 1: {
//                    System.out.println("Enter The Data: ");
                    obj.InsertValue(size);
                    break;
                }
                case 2: {
                    obj.ShowFullArray();
                    break;
                }
                case 3: {
                    obj.EvenArray();
                    break;
                }
                case 4:{
                    obj.OddArray();
                    break;
                }
            }
            System.out.println("\nDo You Want To Continue: ");
            choice = scnScanner.next().charAt(0);
        }while (choice == 'y' || choice == 'Y');




    }
}
