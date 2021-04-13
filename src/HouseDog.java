public class HouseDog extends Dog {
    public HouseDog () {

    }
    public HouseDog(String name) {
        this.setName(name);
    }
    public HouseDog(int type) {
        if (type == 1) {
            this.setName("yorkshire");
            System.out.println("type 1");
        } else if (type == 2) {
            this.setName("bulldog");
            System.out.println("type 2");
        } else {
            this.setName("others");
            System.out.println("type others");
        }
    }

    public void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    public void sleep(int hour) {
        System.out.println(this.name + " zzz in " + hour);
    }

    public static void main(String[] args) {
//        HouseDog houseDog = new HouseDog();
//        houseDog.setName("happy extends");

        HouseDog houseDog = new HouseDog("happy extends");

        HouseDog houseDog2 = new HouseDog(2);

        houseDog.sleep();
        houseDog.sleep(3);
        houseDog2.sleep();
    }
}
