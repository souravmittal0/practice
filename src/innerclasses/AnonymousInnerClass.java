package innerclasses;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Taste taste = new Taste() {
            public void tellTaste() {
                System.out.println("Sour");
            }
        };
        taste.tellTaste();
        taste.display();
        System.out.println(taste.getClass().getName()); //innerclasses.AnonymousInnerClass$1
    }
}

class Taste {
    public void tellTaste () {
        System.out.println("Sweet");
    }

    public void show () {
        System.out.println("Show");
    }

    public void display () {
        System.out.println("Display");
    }
}
