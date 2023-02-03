import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    int n1,n2,result;
    Scanner sc = new Scanner(System.in);

    void calculate() {
        try {
            System.out.println("Enter First Number");
            n1=sc.nextInt();

            System.out.println("Enter Second Number");
            n2=sc.nextInt();

            if (n2==0) {
                throw new ArithmeticException();
            }

            result=n1/n2;
        }
        catch(InputMismatchException e) {
            System.out.println("IME Deteced");
        }
        catch (ArithmeticException e) {
            System.out.println("AE Deteced");
        }
        catch (Exception e) {
            System.out.println("Ouch! Exception Detected! " + e.getMessage());
            e.getStackTrace();
        }
        finally {
            System.out.println("The Division is "+result);
        }
    }

    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.calculate();
    }
}
