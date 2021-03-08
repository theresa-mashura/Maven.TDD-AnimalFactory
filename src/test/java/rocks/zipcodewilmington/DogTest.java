package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void testNewDog() {
        // Given
        String givenName = "Buddy";
        Date givenBirthDate = new Date(1992, 8, 30);
        int givenId = 1;

        // When
        Dog buddy = new Dog(givenName, givenBirthDate, givenId);

        // Then
        Assert.assertEquals(givenBirthDate, buddy.getBirthDate());
        Assert.assertEquals(givenName, buddy.getName());
        Assert.assertEquals(givenId, (int) buddy.getId());

    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        // Given
        Dog dog = new Dog(null, null, null);

        // When
        String actualDogSpeak = dog.speak();

        // Then
        Assert.assertEquals("bark!", actualDogSpeak);

    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        // Given
        Dog doggo = new Dog("Bud", null, null);
        Date givenBirthDate = new Date(1992, 8, 30);

        // When
        doggo.setBirthDate(givenBirthDate);

        // Then
        Date actualBirthDate = doggo.getBirthDate();
        Assert.assertEquals(givenBirthDate, actualBirthDate);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest () {
        // Given
        String givenName = "Cocoa";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog doggo = new Dog(givenName, givenBirthDate, givenId);
        Food actualFood = new Food();

        // When
        doggo.eat(actualFood);

        // Then
        int actualNumberMealsEaten = doggo.getNumberOfMealsEaten();
        Assert.assertEquals(1, actualNumberMealsEaten);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {
        // Given
        String givenName = "Python";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When
        int actualId = dog.getId();

        // Then
        Assert.assertEquals(0, actualId);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest() {
        // Given
        String givenName = "Rocky";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // Then
        boolean dogIsAnimal = dog instanceof Animal;
        Assert.assertTrue(dogIsAnimal);

    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest() {
        // Given
        String givenName = "Bandit";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When
        Dog doggo = new Dog(givenName, givenBirthDate, givenId);

        // Then
        boolean dogIsMammal = doggo instanceof Mammal;
        Assert.assertTrue(dogIsMammal);

    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
