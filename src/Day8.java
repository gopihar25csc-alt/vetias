public class Day8 {
    /*record CourseRecord(String coursename,String department){
    }
    static void main(){
        CourseRecord courseRecord=new CourseRecord("java ","cs");
        System.out.println(courseRecord.coursename());
        System.out.print(courseRecord.department());
    }
}*/
   enum LANGUGAES {
        TA("Tamil"),
        EN("English"),
        GR("German"),
        JP("Japanese");
        String description;
        LANGUGAES(String description){
            this.description=description;
        }
    }
    static void  main(){
        System.out.println(LANGUGAES.TA.description);
        System.out.println(LANGUGAES.EN.description);
    }
}
