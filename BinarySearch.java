// public class BinarySearch 
// {
//     public static void linearSearch(int arr[],int key)
//     {
//         int firstindex=-1;
//         int lastindex=-1;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]==key)
//             {
//                 if(firstindex==-1)
//                 {
//                     firstindex=i;
//                 }
//                 lastindex=i;
                
                
//             }
//         }
//         System.out.println(firstindex);
//         System.out.println(lastindex);
//     }
//     public static int BinarySearchMethod(int arr[],int key)
//     {
//         int low=0,high=arr.length-1;
//         int res;
//         while(low<=high)
//         {
//             int mid=low+high/2;
//             if(arr[mid]==key)
//             {
//                 res=mid;
//                 high=mid-1;
    
//             }
//             else if(arr[mid]<key)
//             {
//                 low=mid+1;
//             }
//             else
//             {
//                 mid=high-1;
//             }
//         }
//          return res;

//     }
//     public static void main(String args[])
//     {
//         int arr[]={2,4,5,6,6,6,6,6,7,9};
//         int key=6;
       
//         linearSearch(arr,key);
//         System.out.println(BinarySearchMethod(arr,key));
//     }

// }


//lower bound
// public class BinarySearch 
// {
//     public static void fun(int arr[],int target)
//     {
//         int low=0,high=arr.length-1;
//         int res=arr.length;
//         while(low<=high)
//         {
//             int mid=low+high/2;
//             if(arr[mid]>=target)
//             {
//                 res=mid;
//                 high=mid-1;
    
//             }
//             else
//             {
//                 low=mid+1;
//             }
//         }
//         System.out.println(res);
//     }
//     public static void main(String args[])
//     {
//         int arr[]={2,3,5,6,7,8,10,12};
//         int target=5;
//         fun(arr,target);
//     }
// }



//upper bound
public class BinarySearch 
{
    public static void fun(int arr[],int target)
    {
        int low=0,high=arr.length-1;
        int res=arr.length;
        while(low<=high)
        {
            int mid=low+high/2;
            if(arr[mid]>=target)
            {
                res=mid;
                high=mid-1;
    
            }
            else
            {
                low=mid+1;
            }
        }
        System.out.println(res);
    }
    public static void main(String args[])
    {
        int arr[]={2,3,5,6,7,8,10,12};
        int target=5;
        fun(arr,target);
    }
}