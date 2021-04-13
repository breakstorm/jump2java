public class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("body"); //cat.name = "body";
        System.out.println(cat.name);
        System.out.println(cat);

        Animal dog =  new Animal();
        dog.setName("happy");

        System.out.println(cat.name);
        System.out.println(dog.name);
    }
}