 import java.util.Scanner;
 class Search2{
    public static void main(String[] args) {
     
         int a[]= new int[10];
        Scanner sc=new Scanner(System.in);  
       System.out.println("Enter array elements:");
        for( int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter target array");
        Scanner target1=new Scanner(System.in);  
       int target= target1.nextInt();
    for( int i=0;i<5;i++)
{
if(target==a[i])
{
System.out.println("target is found"+" "+target+" At Position number"+" "+i);
}
else
{
    System.out.println("target is  not found");
} 
} 
}
 }


    
    