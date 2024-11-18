public class Child extends Parent {

    // Статический блок, выводящий на экран «Child:static 1»
    static {
        System.out.println("Child:static 1");
    }

    // Нестатический блок, выводящий на экран «Child:instance 1»
    {
        System.out.println("Child:instance 1");
    }

    // Статический блок, выводящий на экран «Child:static 2»
    static {
        System.out.println("Child:static 2");
    }

    // Конструктор без параметров, выводящий на экран «Child:constructor»
    public Child() {
        super();
        System.out.println("Child:constructor");
    }

    // Нестатический блок, выводящий на экран «Child:instance 2»
    {
        System.out.println("Child:instance 2");
    }

    // Конструктор c параметром Name, выводящий на экран «Child:name-constructor»
    public Child(String name) {
        super(name);
        System.out.println("Child:name-constructor");
    }

}


