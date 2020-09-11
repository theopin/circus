package circus;

import circus.animal.Animal;
import circus.animal.Bird;




import circus.animal.Duck;

public class Trainer {
    public static void main(String[] args) {

        getToSpeak(d);

        Bird b = (Bird)d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal)b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting




        train(new Duck("Daisy"));
        // train(new circus.animal.Parrot());

    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {





            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
