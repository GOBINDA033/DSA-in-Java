public class Array_max{
    public static void main(String ars[])
    {
        int number[]={10,5,30,40,15,20,31};
        // find the maximum elements
int max=number[0];
for(int i=0;i<number.length;i++)
{
if(max<number[i])
{
max=number[i];
}
}
System.out.println("max elements of array is "+" "+ max);
    }
}