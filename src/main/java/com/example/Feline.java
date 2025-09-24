package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return super.getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public List<String> getFood(String animalKind) throws Exception {
        return super.getFood(animalKind);
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int count) {
        return count;
    }
}
