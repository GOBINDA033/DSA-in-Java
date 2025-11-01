//Factorial  of N natural number
public class Factorial {
    public static int Calfact(int n)
    {
      
      
if(n==1||n==0)
{
return 1;
}

  int fact=Calfact(n-1);

int fact_n=n*fact;
  return fact_n;

    }
    public static void main(String[] args) {
       int n=5; 
       int result=Calfact(n);
       System.out.println(result);
    }
}
