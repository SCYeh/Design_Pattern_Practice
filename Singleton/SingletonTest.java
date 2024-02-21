package Singleton;

public class SingletonTest {
    public static void main(String[] argv) {
        String s1 = "s1";
        String s2 = "s2";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
