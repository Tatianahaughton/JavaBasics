package com.syntax.class26;

public abstract class Insurance {
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }
    abstract void getQuote();
    abstract void cancelInsurance();

}
class Car extends Insurance {
    String carModel;

    Car(String insuranceName,String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }

    void getQuote() {
        System.out.println("Getting a quote for " +carModel);
    }

    void cancelInsurance() {
        System.out.println("Canceling insurance for "+carModel);
    }
}
class Pet extends Insurance{

    String petType;

    Pet(String insuranceName,String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    void getQuote() {
        System.out.println("Insurance quote for "+petType);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Cancelling insurance for "+petType);
    }
}

class Health extends Insurance {
    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("Insurance quote for "+insuranceName);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Canceling insurance for "+insuranceName);
    }
}




