package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {
        // Given
        Cat cat = new Cat(null, null, null);
        String givenName = "Kitty";

        // When
        cat.setName(givenName);

        // Then
        String catName = cat.getName();
        Assert.assertEquals("Kitty", catName);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        // Given
        Cat cat = new Cat(null, null, null);

        // When
        String actualCatSpeak = cat.speak();

        // Then
        Assert.assertEquals("meow!", actualCatSpeak);

    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        // Given
        Cat cat = new Cat("Bud", null, null);
        Date givenBirthDate = new Date(1992, 8, 30);

        // When
        cat.setBirthDate(givenBirthDate);

        // Then
        Date actualBirthDate = cat.getBirthDate();
        Assert.assertEquals(givenBirthDate, actualBirthDate);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest () {
        // Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Food actualFood = new Food();

        // When
        cat.eat(actualFood);

        // Then
        int actualNumberMealsEaten = cat.getNumberOfMealsEaten();
        Assert.assertEquals(1, actualNumberMealsEaten);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {
        // Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When
        int actualId = cat.getId();

        // Then
        Assert.assertEquals(0, actualId);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest() {
        // Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // Then
        boolean catIsAnimal = cat instanceof Animal;
        Assert.assertTrue(catIsAnimal);

    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest() {
        // Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // Then
        boolean catIsMammal = cat instanceof Mammal;
        Assert.assertTrue(catIsMammal);

    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
