class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isLethalToAdultHumans() {
        return false;
    }

    // your code
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getInfo() {
        return this.getName() + " is a " + this.getClass().getName() + ", aged " + this.getAge();
    }

}

// your code
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }
}

class Albatross extends Bird {
    Albatross(String name, int age) {
        super(name, age);
    }
}

class Mammal extends Animal {
    Mammal(String name, int age) {
        super(name, age);
    }

    public void printBloodType() {
        System.out.print(", Worm Blooded!");
    }
}

class Dog extends Mammal {
    Dog(String name, int age) {
        super(name, age);
    }
}

class FruitBat extends Mammal {
    FruitBat(String name, int age) {
        super(name, age);
    }
}

class Platypus extends Mammal {
    Platypus(String name, int age) {
        super(name, age);
    }
}

class Human extends Mammal {
    Human(String name, int age) {
        super(name, age);
    }
}

class Reptile extends Animal {
    Reptile(String name, int age) {
        super(name, age);
    }
}

class EasternBrownSnake extends Reptile {
    EasternBrownSnake(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean isLethalToAdultHumans() {
        return true;
    }
}

class Fish extends Animal {
    Fish(String name, int age) {
        super(name, age);
    }
}

class GreatWhiteShark extends Fish {
    GreatWhiteShark(String name, int age) {
        super(name, age);
    }
}

class Arachnid extends Animal {
    Arachnid(String name, int age) {
        super(name, age);
    }
}

class RedBackSpider extends Arachnid {
    RedBackSpider(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean isLethalToAdultHumans() {
        return true;
    }
}

class TestAnimal {
    public static void main(String[] args) {
        Bird alex = new Albatross("Alex", 39);
        Mammal spot = new Dog("Spot", 7);
        Mammal fred = new FruitBat("Fred", 10);
        Reptile steph = new EasternBrownSnake("Steph", 12);
        Fish bruce = new GreatWhiteShark("Bruce", 40);
        Arachnid charlotte = new RedBackSpider("Charlotte", 1);
        Mammal perry = new Platypus("Perry", 5);
        Mammal bob = new Human("Bob", 20);

        Animal[] animals = {alex, spot, fred, steph, bruce, charlotte, perry, bob};
        for (Animal a : animals) {
            System.out.print(a.getInfo());
            if (a instanceof Mammal) {
                ((Mammal) a).printBloodType();
            }
            System.out.println(a.isLethalToAdultHumans() ? ", it's lethal!" : ", fortunately non-lethal");
        }
    }
}

/* main output
Alex is a Albatross, aged 39, fortunately non-lethal
Spot is a Dog, aged 7, Warm-Blooded!, fortunately non-lethal
Fred is a FruitBat, aged 10, Warm-Blooded!, fortunately non-lethal
Steph is a EasternBrownSnake, aged 12, it's lethal!
Bruce is a GreatWhiteShark, aged 40, fortunately non-lethal
Charlotte is a RedBackSpider, aged 1, it's lethal!
Perry is a Platypus, aged 5, Warm-Blooded!, fortunately non-lethal
Bob is a Human, aged 20, Warm-Blooded!, fortunately non-lethal
*/