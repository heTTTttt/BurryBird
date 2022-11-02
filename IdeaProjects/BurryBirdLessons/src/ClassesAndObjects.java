public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        person1.speak();
        Person person2 = new Person();
        person2.name = "Сергей";
        person2.age = 45;
        person2.speak();
        System.out.println("-----------------------");
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("первому человеку до пенсии " + year1 + " лет");
        System.out.println("втрорму человеку до пенсии " + year2 + " лет");

    }
}

class Person {
    String name;
    int age;

    int calculateYearsToRetirement() {
        return 65 - age;
    }

    void speak() {
        System.out.println("меня зовут " + name + ", мне " + age + " лет");
    }
}