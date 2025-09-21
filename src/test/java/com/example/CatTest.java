package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CatTest {

    @Test
    public void getSoundReturnsMeow() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String sound = cat.getSound();
        Assert.assertEquals("Мяу", sound);
    }

    @Test
    public void getFoodReturnsPredatorFood() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> food = cat.getFood();
        Assert.assertTrue(food.contains("Животные")
                || food.contains("Птицы")
                || food.contains("Рыба"));
    }
}
