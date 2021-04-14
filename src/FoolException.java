public class FoolException extends Exception {
    public FoolException() {
        System.err.println("FoolException constructor");
    }

    public static void main(String[] args) {
        System.err.println("FoolException main");
    }
}
