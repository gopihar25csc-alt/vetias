import java.util.LinkedList;

/*import java.util.ArrayList;

public class Day10 {
    static void main() {
        String[] student = {"gopzz", "prasna", "aishu", "nafii"};
        ArrayList<String> list = new ArrayList  ();
        list.add("gopzz");
        list.add("prasna");
        list.add("aishu");
        list.add("nafii");
        for (String s : list) {
            System.out.println(s);
        }
        list.remove("nafii");
        System.out.println();
        for(String s : list) {
            System.out.println(s);
        }
    }

}*/
public class Day10 {
    static void main() {
        LinkedList<String> queue = new LinkedList<String>();
        queue.add("hari");
        queue.add("gopzz");
        queue.add("madhan");
        queue.add("dharika");
        queue.add("shalini");
        while(!queue.isEmpty()) {
            process(queue);
        }
    }
    static void process(LinkedList<String> queue){
        String removed=queue.removeFirst();
        System.out.println("Removed:"+removed);

    }
}


