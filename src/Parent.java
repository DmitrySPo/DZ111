public abstract class Parent {

    // Приватное поле Name
    private String name;

    // Статический блок, выводящий на экран «Parent:static 1»
    static {
        System.out.println("Parent:static 1");
    }

    // Нестатический блок, выводящий на экран «Parent:instance 1»
    {
        System.out.println("Parent:instance 1");
    }

    // Статический блок, выводящий на экран «Parent:static 2»
    static {
        System.out.println("Parent:static 2");
    }

    // Конструктор без параметров, выводящий на экран «Parent:constructor»
    public Parent() {
        System.out.println("Parent:constructor");
    }

    // Нестатический блок, выводящий на экран «Parent:instance 2»
    {
        System.out.println("Parent:instance 2");
    }

    // Конструктор c параметром Name, выводящий на экран «Parent:name-constructor»
    public Parent(String name) {
        this.name = name;
        System.out.println("Parent:name-constructor");
    }
}




