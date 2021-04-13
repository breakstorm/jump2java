public class TestMethod {
    int a;

    public void vartest() { //TestMethod obj
        this.a++;           // obj.a++;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public String say() {
        return "Hi";
    }

    public void say_nick(String nick) {
        if ("fool".equals(nick)) {
            return;
        }
        System.out.println("my nick is " + nick);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        TestMethod my = new TestMethod();
        int c =  my.sum(a, b);
        System.out.println(c);

        String hi = my.say();
        System.out.println(hi);

        my.say_nick("hi");

        my.a = 1;
        my.vartest();            //my.vartest(my);
        System.out.println(my.a);
    }
}
