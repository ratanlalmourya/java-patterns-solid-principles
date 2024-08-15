

public class Main {
    public static void main(String[] args) {
        
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        Singleton singleton = Singleton.getInstance("POO");

        System.out.println(singleton.value + "  ");
        System.out.println(anotherSingleton.value + " ");
    }
}