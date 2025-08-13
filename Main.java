// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class Main {
    public static int[] fun(int arr[],int tar)
    {
        int arr1[]=new int[2];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[i]+arr[j])==tar)
                {
                  arr1[0]=arr[i];
                  arr1[1]=arr[j];
                  return arr1;
                }
            }
        }
        return arr1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,7,8,9};
        int tar=9;
        int res[]=fun(arr,tar);
        System.out.println("the two indices are"+Arrays.toString(res));
    }
}