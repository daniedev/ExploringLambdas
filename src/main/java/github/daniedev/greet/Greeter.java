package github.daniedev.greet;

public class Greeter {
    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting greeting = () -> System.out.println("Hello World!");
        greeter.greet(greeting);
    }
}
