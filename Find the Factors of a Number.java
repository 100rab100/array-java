
public class first
{

   public  static  void main(String args[])
   {
       Scanner t=new Scanner(System.in);

       int num=t.nextInt();
       for(int i=1;i<num+1;i++)
       {
          if(num%i==0)
          {
              System.out.println(i);
          }

       }

   }
