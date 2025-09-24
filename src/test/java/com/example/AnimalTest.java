package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AnimalTest {

    @Test
    public void getFoodForHerbivoreReturnsPlantList() throws Exception {
        Animal animal = new Animal();
        List<String> expected = List.of("Трава", "Различные растения");
        Assert.assertEquals(expected, animal.getFood("Травоядное"));
    }

    @Test
    public void getFoodForPredatorReturnsMeatList() throws Exception {
        Animal animal = new Animal();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, animal.getFood("Хищник"));
    }

    @Test
    public void getFoodThrowsExceptionForUnknownAnimalKind() {
        Animal animal = new Animal();
        try {
            animal.getFood("Инопланетянин");
            Assert.fail("Ожидалось исключение для неизвестного вида животного");
        } catch (Exception e) {
            Assert.assertEquals(
                    "Неизвестный вид животного, используйте значение Травоядное или Хищник",
                    e.getMessage()
            );
        }
    }

    @Test
    public void getFamilyReturnsCorrectText() {
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertEquals(expected, animal.getFamily());
    }
}
