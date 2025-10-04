public class Array_min{
    public static void main(String ars[])
    {
        int number[]={10,5,30,40,15,20,31};
        // find the maximum elements
int min=number[0];
for(int i=0;i<number.length;i++)
{
if(min>number[i])
{
min=number[i];
}
}
System.out.println("min elements of array is "+" "+ min);
    }
}