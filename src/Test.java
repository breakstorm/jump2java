public class Test {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        System.out.println(sb);

        sb.insert(0, "insert");
        System.out.println(sb);

        System.out.println(sb.substring(0, 4));
        System.out.println(sb);
    }
}
