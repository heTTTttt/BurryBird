public class Constructors {
    public static void main(String[] args) {
        Human1 human1 = new Human1();//Humans human1 = new Humans("Bob", 18) для третьего конструктора
    }
}

class Human1 {
    public Human1() {
        System.out.println("привет из первого конструктора");
    }

    public Human1(String name) {
        System.out.println("привет из второго конструктора");
        this.name = name;
    }

    public Human1(String name, int age) {
        System.out.println("привет из третьего конструктора");
        this.age = age;
        this.name = name;
    }

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}