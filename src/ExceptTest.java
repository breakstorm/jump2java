import java.io.BufferedReader;
import java.io.FileReader;

public class ExceptTest {
    public void shouldRun() {
        System.out.println("ok run");
    }

    public void sayNick(String nick) throws FoolException{
//        try {
//            throw new RuntimeException();
//        } catch (RuntimeException e) {
//            System.out.println(e);
//        }

        if("fool".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("당신의 별명은 " + nick);
    }

    public static void main(String[] args) {
//    BufferedReader br = new BufferedReader(new FileReader("test.txt"));
//    br.readline();
//    br.close();

//        ExceptTest et = new ExceptTest();
//        int c;
//        try {
//            c = 4 / 0;
//            et.shouldRun();
//        } catch(ArithmeticException err) {
//            c = -1;
//        } finally {
//            et.shouldRun();
//        }

        ExceptTest et = new ExceptTest();
        try {
            et.sayNick("fool");
            et.sayNick("b");
        } catch (FoolException e) {
            System.out.println("call " + e);
        }
    }
}
