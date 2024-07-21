package ch08;

public class Person {
    String name;
    int age;

    // default constructor
    public Person() {
        this("no name", 1); // --> 해당 구조와 맞는 생성자를 호출한다. 여기서는 아래 Person을 호출
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.showPerson();

        Person person2 = person.getPerson();

        System.out.println(person); // ch08.Person@28a418fc
        System.out.println(person2); // ch08.Person@28a418fc
    }

    public Person getPerson() {
        return this;
    }

    public void showPerson() {
        System.out.println(name + " , " + age);
    }
}
