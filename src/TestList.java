import java.util.ArrayList;

public class TestList {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<String>();
        pitches.add("123");
        pitches.add("456");
        pitches.add("789");

        System.out.println(pitches.get(1));
        System.out.println(pitches.size());
        System.out.println(pitches.contains("789"));

        System.out.println(pitches.remove("456"));
        System.out.println(pitches.size());
        System.out.println(pitches.remove(0));
        System.out.println(pitches);
    }
}
