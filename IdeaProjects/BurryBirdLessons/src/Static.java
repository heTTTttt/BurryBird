public class Static {
    public static void main(String[] args) {
        Human2 human1 = new Human2("Bob", 40);
        Human2 human2 = new Human2("Tom", 30);
        Human2 human3 = new Human2("Travis", 32);
        human1.printNumberOfPeople();
        human2.printNumberOfPeople();
        human3.printNumberOfPeople();
        System.out.println("-------------");
    }
}

class Human2 {
    private String name;
    private int age;
    private static int countPeople;

    public Human2(String name, int age) {
        this.age = age;
        this.name = name;
        countPeople++;
    }

    public void printNumberOfPeople() {
        System.out.println("Number of people is " + countPeople);
    }
}
