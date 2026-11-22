public class Test {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 identityHashCode: " + System.identityHashCode(s1));
        System.out.println("s2 identityHashCode: " + System.identityHashCode(s2));

        System.out.println("변경 전 s2 count: " + s2.getCount());
        s1.increment();
        System.out.println("s1.increment() 호출 후 s2 count: " + s2.getCount());
    }
}