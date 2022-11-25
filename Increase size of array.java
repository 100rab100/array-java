

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String args[]){

                int A[]={8,6,10,9,2};

                System.out.println("Length of A="+A.length);

                int B[]=new int[10];

                for(int i=0;i<A.length;i++)
                {
                    B[i]=A[i];
                }
                A=B;// NOW B ref to null and A ref to B old wala array  that is of 10 size here .

                System.out.println("Length of B="+A.length);

            }





}





