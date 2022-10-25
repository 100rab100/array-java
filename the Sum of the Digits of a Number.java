public class first
{

   public  static  void main(String args[])
   {
       Scanner t=new Scanner(System.in);

       int num=t.nextInt();
       int sum =0;
       while(num>0)
       {
         int rem=num%10;
         sum=sum+rem;
         num=num/10;

       }
         System.out.println(sum);
   }


}
