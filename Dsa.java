import java.util.*;
class Dsa {
    public static void main(String[] args) {
        HashSet <String> st=new HashSet<>();
        st.add("apple");
        st.add("banana");
        st.add("apple");
        st.add("custard apple");
        System.out.println(st);
        Iterator<String> it=st.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        }
}

