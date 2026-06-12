
void main() {
    System.out.println("Enter your name:");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("Enter your department:");
    String department = sc.nextLine();
    System.out.println("Enter your age:");
    String age = sc.nextLine();
    System.out.println("Enter your college:");
    String college = sc.nextLine();
    sc.nextLine();
    System.out.println("name:" + name);
    System.out.println("age:" + age);
    System.out.println("department:" + department);
    System.out.println("college:" + college);
    sc.close();
}