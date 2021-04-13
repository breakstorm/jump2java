public class HouseDog extends Dog {
    public void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    public void sleep(int hour) {
        System.out.println(this.name + " zzz in " + hour);
    }

    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy extends");
        houseDog.sleep();
        houseDog.sleep(3);
    }
}
