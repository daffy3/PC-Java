package ch06;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아 다닙니다.");
    }

    public void fly() {
        System.out.println("독수리가 두 날개를 쭉 펴고 날아다닙니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAnimal);
//        test.moveAnimal(hAnimal);
//        test.moveAnimal(hAnimal);

        // 다형성
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for (Animal animal : animalList) {
            animal.move();
        }

        test.testDownCasting(animalList);
    }

    public void testDownCasting(ArrayList<Animal> list) {
        for (int i = 0; i < list.size(); i++) {
            Animal animal = list.get(i);

            if (animal instanceof Human human) {
                human.readBook();
            } else if (animal instanceof Tiger tiger) {
                tiger.hunting();
            } else if (animal instanceof Eagle eagle) {
                eagle.fly();
            }
        }

    }

    public void moveAnimal(Animal animal) {
        animal.move();
        // 단, 여기서 각각의 클래스 내부에 있는 override된 함수는 접근할 수 없어서 다운캐스팅을 진행해주어야 한다.

    }
}
