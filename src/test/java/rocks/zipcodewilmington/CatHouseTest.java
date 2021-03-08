package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAdd() {
        // Given
        String name = "Kitty";
        Date birthday = new Date();
        Cat animal = AnimalFactory.createCat(name, birthday);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        int actualNumberOfCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(1, actualNumberOfCats);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveId() {
        // Given
        String name = "Kitty";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);
        CatHouse.remove(animal.getId());

        // Then
        int actualNumberOfCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(0, actualNumberOfCats);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveCat() {
        // Given
        String name = "Kitty";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);
        CatHouse.remove(animal);

        // Then
        int actualNumberCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(0, actualNumberCats);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatById() {
        // Given
        String name = "Kitty";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        Cat actualCat = CatHouse.getCatById(animal.getId());
        Assert.assertEquals(animal, actualCat);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats() {
        // Given
        String name = "Kitty";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        int actualNumberOfCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(1, actualNumberOfCats);
    }

}
