public class Day15sync {
    static String[] items = {"burger", "dosa", "coffee"};
    private static int nextOrderIndex = 0;
    private static final Object LOCk = new Object();
    static void pickOrder() {
        String order;
        while (true) {
            synchronized (LOCk) {
                if (nextOrderIndex >= items.length) {
                    return;
                }
                order = items[nextOrderIndex];
                nextOrderIndex++;
            }
            System.out.println(Thread.currentThread().getName() + "is preparing:"+order);

        }
    }
    static void main() throws InterruptedException{
        Thread chefOne=new Thread(()->pickOrder(),"chef-one");
        Thread chefTwo=new Thread(()->pickOrder(),"chef-two");
        chefOne.start();
        chefTwo.start();
        chefOne.join();
        chefTwo.join();
    }


}