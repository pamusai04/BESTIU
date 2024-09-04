package Practice;
import java.util.*;
public class fibnochiSerice {
	public static void main(String[] args) {
        //subSeq("","abc");
        //System.out.println(a);
        ArrayList<String> arr= subSeq("","abc");
        System.out.println(arr);
        
    }
    
    public static ArrayList<String> subSeq(String a,String b){
        ArrayList<String> list = new ArrayList<>();
        if(b.isEmpty()){
            list.add(a);
            return list;
        }
        
        char ch = b.charAt(0);
        
        ArrayList<String> left = subSeq(a + ch ,b.substring(1));
        //System.out.println(left);
        ArrayList<String> right =subSeq(a ,b.substring(1));
        //System.out.println(right);
        left.addAll(right);
        return left;
    }
}
