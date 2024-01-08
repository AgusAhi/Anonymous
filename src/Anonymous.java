import java.io.DataInput;

interface HelloWorld {
    public void greet();
    public void greetSomeone(String name);
}

class person implements HelloWorld {
    @Override
    public void greet() {
        System.out.println("Hello world");
    }

    @Override
    public void greetSomeone(String name) {
        System.out.println("Hello" + name);
    }

}

    class Dog implements HelloWorld {
        @Override
        public void greet() {
            System.out.println("Wof(bombardear Israel)");
        }
        @Override
        public void greetSomeone(String name) {
            System.out.println("Wof, Wof" + name);
        }
    }


public class Anonymous {
    public static void main(String[] args) {
        person p = new person();
        Dog d = new Dog();
        greet(" Agus", p, d, new HelloWorld() { // clase Anonima
            @Override
            public void greet() {
                System.out.println("Nya(bombardear Palestina)");
            }

            @Override
            public void greetSomeone(String name) {
                System.out.println("Nya, Nya" + name);
            }
        });
    }

    public static void greet(String name, HelloWorld... hws ) { // [] = ... Es como un Array pero es una lista separadas con comas
        for (HelloWorld h : hws) {
            h.greet();
            h.greetSomeone(name);
        }
    }
}
