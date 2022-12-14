package github.daniedev.greet;

public class Greeter {
    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting lambdaGreeting = () -> System.out.println("Hello World!");
        greeter.greet(lambdaGreeting);

        Greeting anonymousGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("HelloWorld greeting by interface implementation(anonymous class)");
            }
        };
        greeter.greet(anonymousGreeting);

        Thread thread = new Thread(() -> System.out.println("Hello World by implementing a Runnable"));
        thread.run();
    }
}
