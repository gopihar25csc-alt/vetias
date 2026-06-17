/*public class Day10exercise {
    static void main() {
        String name = null;
        try {
            System.out.print(name.charAt(0));
            System.out.println(22/0);
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of Bounds Exception");
        }catch (Exception e){
            System.out.println("Exception");
        }finally{
            System.out.println("this is will always excute");
            name="";
        }System.out.println("still running");
        System.out.println("name:"+name);
    }
}*/
public class Day10exercise{
    static void main(){
        String name="dyro";
        try {
            System.out.println(name.charAt(2));
            System.out.println(4/0);

        }
        catch(NullPointerException e){
            System.out.println("there is an nullpointer exception");
        }
        catch (Exception e){
            System.out.println("there is an exception");
        }
        finally {
            System.out.println("remaining code will be executed");
        }

    }
}