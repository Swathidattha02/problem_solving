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


import java.util.*;
class Dsa
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("the number is :"+ n);
        // int rev=0;
        // while(n!=0)
        // {
        //     rev=rev*10 + n%10;
        //     n=n/10;
            
        // }
        // StringBuffer st=new StringBuffer(String.valueOf(n));
        // StringBuffer rev=st.reverse();
        // System.out.println("the reversed number is :"+ rev);

        StringBuilder sb=new StringBuilder();
        sb.append(n);
        StringBuilder rev=sb.reverse();
        System.out.println("the reversed number is :"+ rev);

    }

}