// class ZuvyProblems {
//     public static boolean isPalindrome(int arr[])
//     {
//         for(int i=0;i<arr.length/2;i++)
//         {
//             if(arr[i]!=arr[arr.length-i-1])
//             {
//                 return  false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,2,1};
//         System.out.println("is the array palindrome : "+isPalindrome(arr));
//     }
// }
// class ZuvyProblems {
//     public static void main(String[] args) {
//         int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=arr[i].length-1;j>=0;j--)
//             {
//                 System.out.print(arr[i][j]);
//             }
//             System.out.println();
//         }
        
//     }
// }

// class ZuvyProblems {
//     public static void main(String[] args) {
//         int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=arr[i].length-1;j>=0;j--)
//             {
//                 System.out.print(arr[j][i]);
//             }
//             System.out.println();
//         }
//     }
// }


class ZuvyProblems {
     public static void main(String[] args)
     {
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(i==j)
                {
                    System.out.print(arr[i][j]);
                }
                
            }
            System.out.println();
        }

     }
}