package rocks.zipcodewilmington;

import org.junit.Test;
import org.junit.Assert;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    // TODO - Create tests for `void add(Dog dog)`
    public void testAdd() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        int actualNumberOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(1, actualNumberOfDogs);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveId() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        DogHouse.add(animal);

        // When
        DogHouse.remove(animal.getId());

        // Then
        int actualNumberOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(0, actualNumberOfDogs);
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveDog() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        DogHouse.add(animal);

        // When
        DogHouse.remove(animal);

        // Then
        int actualNumberOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(0, actualNumberOfDogs);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogById () {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        Dog dog = DogHouse.getDogById(animal.getId());

        Assert.assertEquals(animal, dog);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        int actualNumberOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(1, actualNumberOfDogs);
    }
}
