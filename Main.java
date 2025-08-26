import java.util.*;
class Main{
    public static int[] fun1(int arr[],int tar)
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
                  return new int[]{i,j};
                }
            }
        }
        return arr1;
    }
    public static int[] fun2(int arr[],int tar)
    {
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            int com=tar-arr[i];
            if(st.contains(com))
            {
                return new int[]{arr[i],com};
            }
            st.add(arr[i]);

        }

        return new int[]{-1,-1};
    }
   public static int[] fun3(int arr[], int tar) { // Changed return type to int[]
        int right = arr.length - 1;
        int left = 0;
        while (left < right) {
            int sum = arr[right] + arr[left];
            if (sum == tar) {
                return new int[]{arr[left], arr[right]};
            } else if (sum < tar) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int arr[]={2,4,7,8,9};
        int tar=9;
        int res1[]=fun1(arr,tar);
        int res2[]=fun2(arr,tar);
        int res3[]=fun3(arr,tar);
        System.out.println("the two indices are"+Arrays.toString(res1));
        System.out.println("the two indices are"+Arrays.toString(res2));
        System.out.println("the two indices are"+Arrays.toString(res3));
    }
}



