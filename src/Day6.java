public class Day6 {
    /*static class car {
        String color;
        String brand;
        int speed;
        int fuel;

        car() {
            System.out.println("Constructor called");
        }

        car(String Color, String brand, int speed, int fuel) {
            this.color = Color;
            this.brand = brand;
            this.speed = speed;
            this.fuel = fuel;
        }

        void printDetails() {
            System.out.println("color:" + color);
            System.out.println("Brand:" + brand);
            System.out.println("Sped:" + speed);
            System.out.println("Fuel:" + fuel);
        }
    }

    public static void main(String[] args) {
        car car1 = new car("black", "bmw", 200, 200);
        car1.printDetails();
    }
}*/
    static class student {
        String name;
        int regno;
        String department;
        int mathsmark;
        int phymark;
        int csmark;

        student(String name, int regno, String department, int mathsmark, int phymark, int csmark) {
            this.name = name;
            this.department = department;
            this.mathsmark = mathsmark;
            this.phymark = phymark;
            this.csmark = csmark;
        }

        void printDetails() {
            System.out.println("name:" + name);
            System.out.println("regno:" + regno);
                        System.out.println("department:" + department);
            System.out.println("mathsmark:" + mathsmark);
            System.out.println("phymark:" + phymark);
            System.out.println("csmark:" + csmark);
        }

        public static void main(String[] args) {
            student student1 = new student("gopzz", 1818, "cs", 98, 90, 100);
            student1.printDetails();
        }
    }

}