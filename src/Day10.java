import java.util.ArrayList;

public class Day10 {
    static void main() {
        String[] student = {"gopzz", "prasna", "aishu", "nafii"};
        ArrayList<String> list = new ArrayList<>();
        list.add("gopzz");
        list.add("prasna");
        list.add("aishu");
        list.add("nafii");
        for (String s : list) {
            System.out.print(s);
        }
        list.remove("nafii");
        System.out.println();
        for(String s : list) {
            System.out.print(s);
        }
    }

}