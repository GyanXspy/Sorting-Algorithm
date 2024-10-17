package assignment_3.Iterative;

import java.util.Scanner;

public class IterativeMethod {
    static int c = 0;
    public static void bubbleSort(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j<arr.length-i-1; j++){
                c++;
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void SelectionSort(int [] arr){
        int min , temp = 0;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i+1; j<arr.length; j++){
                c++;
                if (arr[j]<arr[min]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void InsertionSort(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j>0; j--){
                if (arr[j] < arr[j-1]){
                c++;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
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
                System.out.println("Bubble sort :");
                bubbleSort(arr);
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println("No of comparision = "+c);
                break;
            case 2:
                System.out.println("Selection Sort :");
                SelectionSort(arr);
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println("No of comparision = "+c);
                break;
            case 3:
                System.out.println("Insertion Sort :");
                InsertionSort(arr);
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
                System.out.println("No of comparision = "+c);
                break;
            default:
                break;
        }
    }
}
