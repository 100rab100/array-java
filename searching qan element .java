
     
public class first
{

    public static void main(String[] args)
    {
        int A[]={1,2,3,4,56,7,8};
        System.out.println("Eneter a Key " );
        Scanner t=new Scanner(System.in);
       int key=t.nextInt();


        for(int i=0;i<A.length;i++)
        {
            if(key==A[i])
            {
                System.out.println("Element Found at :"+i);
                System.exit(0);
            }
        }
        System.out.println("Not found");

    }
}
