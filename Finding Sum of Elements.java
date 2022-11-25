public static void main(String[] args) 
    {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        
        int sum=0;
        
        for(int x:A)
        {
            sum=sum+x;
        }
        
        System.out.println("Sum is "+sum);
        
        
        
    }  
}
//


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        System.out.println("Enter the required size of the array :: ");
        Scanner t = new Scanner(System.in);
        int size = t.nextInt();
        int a[]=new int[size];
        int sum=0;
        System.out.println("Enter the elements of the array one by one ");

        for(int i=0;i<size;i++){
            a[i]=t.nextInt();
            sum=sum+a[i];

        }
        System.out.println("Elements of the array are: "+Arrays.toString(a));

        System.out.println("Sum is "+sum);
    }

}


