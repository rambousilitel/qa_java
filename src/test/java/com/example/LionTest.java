package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class LionTest {

    @Test
    public void getKittensReturnsValueFromFeline() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getKittens()).thenReturn(3);

        Lion lion = new Lion(feline, "Самец");
        int actual = lion.getKittens();

        Assert.assertEquals(3, actual); // одна проверка
    }

    @Test
    public void getKittensCallsFeline() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getKittens()).thenReturn(1);

        Lion lion = new Lion(feline, "Самец");
        lion.getKittens();

        Mockito.verify(feline).getKittens(); // одна проверка
    }
    @Test
    public void getFoodReturnsPredatorFood() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expected);

        Lion lion = new Lion(feline, "Самка");
        List<String> actual = lion.getFood();

        Assert.assertEquals(expected, actual);
        Mockito.verify(feline).getFood("Хищник");
    }

    @Test
    public void constructorThrowsOnInvalidSex() {
        Feline feline = Mockito.mock(Feline.class);
        try {
            new Lion(feline, "Киберкот");
            Assert.fail("Ожидалось исключение из конструктора при недопустимом поле");
        } catch (Exception e) {
            Assert.assertEquals(
                    "Используйте допустимые значения пола животного - самец или самка",
                    e.getMessage()
            );
        }
    }
}
