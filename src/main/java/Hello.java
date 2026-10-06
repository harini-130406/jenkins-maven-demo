public class Hello {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Hello h = new Hello();

        System.out.println("Hello Jenkins!");
        System.out.println("2 + 3 = " + h.add(2, 3));
    }
}
