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
/*public class Day10 {
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
}*/

        class Student{
            String name;
            int regno;
            int marks;
            Student(String name ,int regno,int marks){
                this.name=name;
                this.regno=regno;
                this.marks=marks;
            }
            @Override
            public String toString(){
                return "Name:"+name+
                        ",regno:"+regno+
                        ",Marks:"+marks;
            }}
        public class Day10{
            static void main(){
                LinkedList<Student>students=new LinkedList<>();
                students.add(new Student("Aishu",101,85));
                students.add(new Student("ram",102,90));
                students.add(new Student("pooja",103,87));
                students.add(new Student("megha",104,78));
                students.add(new Student("ravi",105,89));
                System.out.println();
                for(Student s:students){
                    System.out.println(s);
                }
                students.removeFirst();
                System.out.println("\nAfter removing first student");
                for(Student s:students){
                    System.out.println(s);
                }
                String searchvalue="Ravi";
                for(Student s:students) {
                    if (s.name.equalsIgnoreCase(searchvalue)) {
                        s.marks = 95;
                        break;
                    }
                }
                System.out.println("\nAfter updating Ravi's marks:");
                for(Student s:students){
                    System.out.println(s);

                }
            }
        }




