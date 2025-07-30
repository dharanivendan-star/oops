class Animal {
    String behaviour;
    int legs;

    void display() {
        System.out.println("Behaviour= " + behaviour);
        System.out.println("Legs = " + legs);
    }
}

    class Dog extends Animal{
      int tail;

      void display1() {
          display();
          System.out.println("Tail = "+tail);
      }


    }

    public class Main3 {
    public static void main (String[] args){
        Dog dva = new Dog();
        dva.behaviour="Barks" ;
        dva.legs=4 ;
        dva.tail= 1 ;

        dva.display1();
    }
}


