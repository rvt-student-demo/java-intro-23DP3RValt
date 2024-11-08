package lv.rvt;

public class Person {
    private String name;
    private int age;


    public Person(String initialName, int age) {
        this.name = initialName;
        this.age = 0;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
}
