package com.syntax.class22;

public class Car {
     void start() {
         System.out.println("Use key to start");
     }
    void stop() {
        System.out.println("Use breaks to stop");
    }

    void park() {
        System.out.println("Park the car");
    }
}
class BMW extends Car {
    void start() {
        System.out.println("Use push to start me");//overriding method
    }
    //overriding method
    void stop(){
        super.stop();//taking things from stop method and adding other things
        System.out.println("you can also use auto-breaking to stop");
    }
}

class Toyota extends Car {
void start() {
    System.out.println("Push me to start");
}
}

class Tesla extends Car {
    void start(){
        System.out.println("Ues the app to start me");
    }
    void stop() {
        System.out.println("Use Ai to stop me");
    }

    void park() {
        System.out.println("I can auto-park myself");
    }
}

