


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        System.out.println("Enter the required size of the array :: ");
        Scanner t = new Scanner(System.in);
        int size = t.nextInt();
        int a[]=new int[size];
        int key=10;
        System.out.println("Enter the elements of the array one by one ");

        for(int i=0;i<size;i++){
            a[i]=t.nextInt();
        }
        for(int i=0;i<size;i++){
            if( a[i]==key){
                System.out.println("key is found");
                System.exit(0);


            }

        }
        System.out.println("NOt found");


        System.out.println("Elements of the array are: "+Arrays.toString(a));


    }

}

//


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int linearSearch(int[] arr, int key){
        

        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String a[]){
        int[] a1= {10,20,30,50,70,90};
        int key = 50;
        System.out.println(key+" is found at index: "+linearSearch(a1, key));


    }

}



