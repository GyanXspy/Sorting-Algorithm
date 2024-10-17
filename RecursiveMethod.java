package assignment_3.Recursive;

import java.util.Scanner;

public class RecursiveMethod {
    public static void bubbleSort (int [] arr, int r, int c){
        if(r == 0){
            return;
        }
        if (c<r) {
            if (arr[c] > arr[c+1]) {
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort(arr, r, c+1);
        }
        else{
            bubbleSort(arr, r-1, 0);
        }
    }
    public static void SelectionSort(int [] arr, int r, int c, int max){
        if (r == 0) {
            return;
        }
        if (c<r) {
            if (arr[c] > arr[max]) {
                SelectionSort(arr, r, c+1, c);
            }
            else{
                SelectionSort(arr, r, c+1, max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            SelectionSort(arr, r-1, 0, 0);
        }
    }
    public static void InsertionSort(int [] arr, int n){
        if (n<=1) {
            return;
        }
        InsertionSort(arr, n-1);
        int last = arr[n-1];
        int j = n-2;
        while (j>=0 && arr[j]>last) {
            c++;
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Array :");
        int l = sc.nextInt();
        int [] arr = new int[l];
        System.out.println("Enter the element :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Elements are :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("1. Bubble sort \n2. Selection sort \n3.Insertion sort");
        System.out.println("Enter your Choice :");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                bubbleSort(arr, l, l);
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]+" ");
                }
                break;
            case 2:
                SelectionSort(arr, l, 0, 0);
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]+" ");
                }
                break;
            case 3:
                InsertionSort(arr, l);
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println("no of comparision =" +c);
                break;
            default:
                System.out.println("You enter the wrong choice ");
                break;
        }
    }
}
