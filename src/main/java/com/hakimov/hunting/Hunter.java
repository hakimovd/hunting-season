package com.hakimov.hunting;

public class Hunter {
    private Animal currentAnimal;

    public void setCurrentAnimal (Animal currentAnimal) {
        this.currentAnimal = currentAnimal;
    }

    public  void killAnimal() {
        System.out.println("Стреляю в " + currentAnimal.getName() + "\nПопал!\n"+ currentAnimal.sayBeforeDeath());
    }

}
