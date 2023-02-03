public class Test1 {
    int arg=5;
//    void myTest(int arg) {
//        this.arg=arg;
//    }
    Test1() {
        System.out.println("Hi! I am default constructor");
    }
    Test1(int arg) {
        this();
        this.arg=arg;
    }
    public static void main(String[] args) {
        int arg=10;
//        Test1 obj=new Test1();
        Test1 obj=new Test1(10);

//        obj.myTest(arg);
        System.out.println(obj.arg);
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
class App {
    App() {
        System.out.println("Constructor of App");
    }
    App(int num) {
        System.out.println(num);
    }
}
public class Test2 extends App {
    Test2() {
        super(20); //used to call constructor of base class
        System.out.println("Constructor of Test2");
    }

    public static void main(String[] args) {
        new Test2();
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
final class father {
    public final String lastName="oberoi";
    public final void foodHabit() {
        System.out.println("I like Salty!!!");
    }
}
//class son extends father {
//    public void foodHabit() {
//        lastName="Malhotra";
//        System.out.println("I like sweet"); //did u observe function overriding here?
//    }
//}
public class Test3 {
    public static void main(String[] args) {

    }
}
