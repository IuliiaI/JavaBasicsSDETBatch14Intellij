package repls;

public class Repl88 {
    /*
Create a Class Main(Repl88)
In this class, you should specify the following attributes: breed, name, color, and
following behaviors: bark(), run(), play().
Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes
and behaviors.
The output of the program should be as following:
Husky can bark
Husky can run
Husky can play
Bulldog can bark
Bulldog can run
Bulldog can play
Labrador can bark
Labrador can run
Labrador can play
 */
        String breed, name, color;
        public static void main(String[] args) {
            Repl88 b = new Repl88();
            b.breed = "Bulldog";
            Repl88 l = new Repl88();
            l.breed = "Labrador";
            Repl88 h = new Repl88();
            h.breed = "Husky";
            h.bark();
            h.run();
            h.play();
            b.bark();
            b.run();
            b.play();
            l.bark();
            l.run();
            l.play();
        }
        void bark() {
            System.out.println(breed + " can bark");
        }
        void run() {
            System.out.println(breed + " can run");
        }
        void play() {
            System.out.println(breed + " can play");
        }
    }

