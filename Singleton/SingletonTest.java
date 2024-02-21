package Singleton;

public class SingletonTest {
    public static void main(String[] argv) {
        String s1 = "s1";
        String s2 = "s2";
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(System.identityHashCode(singleton1));
        System.out.println(System.identityHashCode(singleton2));
    }
}
