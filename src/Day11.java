import java.util.HashSet;
import java.util.Set;

public class Day11 {
    static void main(){
        Set<String> set=new HashSet<>();
        set.add("student 1");
        set.add("student 2");
        set.add("student 1");
        set.add("student 3");
        System.out.println(set);
          for(String S:set){
              System.out.println(S);
          }
    }
}
