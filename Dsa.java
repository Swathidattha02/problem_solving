// import java.util.*;
// class Dsa {
//     public static void main(String[] args) {
//         HashSet <String> st=new HashSet<>();
//         st.add("apple");
//         st.add("banana");
//         st.add("apple");
//         st.add("custard apple");
//         System.out.println(st);
//         Iterator<String> it=st.iterator();
//         while(it.hasNext())
//         {
//             System.out.println(it.next());
//         }
        
//         }
// }



// import java.util.*;
// class Main {
//     public static boolean duplicates(int arr[])
//     {
//          HashSet <Integer> set=new HashSet<>();
//          for(int x:arr)
//          {
//              if(set.contains(x))
//              {
//                  return true;
//              }
//              set.add(x);
//          }
//          return false;
//     }
//     public static void main(String[] args) 
//     {
//         int  arr[]={1,2,3,1,3};
//         System.out.println(duplicates(arr));
//     }
// }


// import java.util.*;
// class Dsa
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println("the number is :"+ n);
//         int rev=0;
//         while(n!=0)
//         {
//             rev=rev*10 + n%10;
//             n=n/10;
            
//         }
//         StringBuffer st=new StringBuffer(String.valueOf(n));
//         StringBuffer rev=st.reverse();
//         System.out.println("the reversed number is :"+ rev);

//         StringBuilder sb=new StringBuilder();
//         sb.append(n);
//         StringBuilder rev=sb.reverse();
//         System.out.println("the reversed number is :"+ rev);

//     }

// }


// import java.util.*;

// public class Dsa {
//     public static int longestConsecutive(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         for (int num : nums) {
//             set.add(num);
//         }

//         int longestStreak = 0;

//         for (int num : nums) {
//             if (!set.contains(num - 1)) {
//                 int currentNum = num;
//                 int currentStreak = 1;

//                 while (set.contains(currentNum + 1)) {
//                     currentNum++;
//                     currentStreak++;
//                 }

//                 longestStreak = Math.max(longestStreak, currentStreak);
//             }
//         }

//         return longestStreak;
//     }

//     public static void main(String[] args) {
//         int[] input = {100, 4, 200, 1,2,3,5};
//         System.out.println("Longest Consecutive Sequence: " + longestConsecutive(input));
//     }
// }





// import java.util.*;
// class Dsa {
//     public static void methodone(int arr1[],int arr2[])
//     {
//          HashSet<Integer> h1=new HashSet<>();
//          HashSet<Integer> h2=new HashSet<>();
//          for(int num:arr1)
//          {
//              h1.add(num);
//          }
//          for(int num:arr2)
//          {
//              h2.add(num);
//          }
//          h1.retainAll(h2);
//          System.out.println(h1);
//         h1.removeAll(h2);
//         h2.removeAll(h1);
//         h1.addAll(h2);
//         System.out.println(h1);
//     }
   
//     public static void main(String[] args) {
//         int arr1[]={1,2,1,3,4,6};
//         int arr2[]={3,7,8,5,9,6};
//         methodone(arr1,arr2);
        
//     }
// }


import java.util.HashSet;

class Dsa {
    public static boolean isAnagramUsingHashSet(String str1, String str2) 
    {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for (char c : str1.toCharArray()) {
            set1.add(c);
        }
        for (char c : str2.toCharArray()) {
             set2.add(c);
        }
        return set1.equals(set2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println(isAnagramUsingHashSet(str1, str2));  
    }
}
