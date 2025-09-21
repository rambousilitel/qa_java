package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void eatMeatReturnsListOfFood() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        Assert.assertTrue(food.contains("Животные")
                || food.contains("Птицы")
                || food.contains("Рыба"));
    }

    @Test
    public void getFamilyReturnsFeline() {
        Feline feline = new Feline();
        String family = feline.getFamily();
        Assert.assertEquals("Кошачьи", family);
    }

    @Test
    public void getKittensWithoutArgumentsReturnsOne() {
        Feline feline = new Feline();
        int kittens = feline.getKittens();
        Assert.assertEquals(1, kittens);
    }

    @Test
    public void getKittensWithArgumentsReturnsCorrectNumber() {
        Feline feline = new Feline();
        int kittens = feline.getKittens(5);
        Assert.assertEquals(5, kittens);
    }
}
