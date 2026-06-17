import java.util.*;

/*public class Day11 {
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
}*/
public class Day11 {
            public static void main(String[] args) {
                HashMap<String, Object> person = new HashMap<>();
                person.put("hari", "89");
                person.put("sharve", "78");
                person.put("vijay","77");
                System.out.println(person.get("percent"));
                person.entrySet().forEach(entry -> {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                });
            }
        }