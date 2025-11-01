public class Fibonacci {
   public static void Fib(int a ,int b,int n)
   {
if (n==0) {
    return  ;
}
    int c=a+b;
    System.out.println(c);
    Fib(b,c,n-1);

   } 
   public static void main(String[] args) {
    int a=0;int b=1;
       int n=5;
    System.out.println(a);
    System.out.println(b);
    Fib( a, b ,n);
 
   }
}
