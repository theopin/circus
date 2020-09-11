package circus;

import circus.animal.Animal;
import circus.animal.Duck;
import circus.animal.Parrot;

import circus.stuff.Equipment;
import circus.stuff.Ladder;


public class Circus {
    private static Animal[] animals = {
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

        int total = 0;
            }


        }
        return total;
    }

    public static void main(String[] args) {
        makeAnimalsTalk();
        System.out.println("Total value of equipments " + calculateValue(equipments));
        System.out.println("Total value of animals " + calculateValue(animals));
    }
}
