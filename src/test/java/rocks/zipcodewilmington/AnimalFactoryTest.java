package rocks.zipcodewilmington;

import org.junit.Test;
import org.junit.Assert;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testCreateDog() {
        // Given
        String name = "Buddy";
        Date birthDate = new Date(1992, 8, 30);

        // When
        Dog buddy = AnimalFactory.createDog(name, birthDate);

        // Then
        Assert.assertEquals(birthDate, buddy.getBirthDate());
        Assert.assertEquals(name, buddy.getName());

    }


    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateCat() {
        // Given
        String name = "Buddy";
        Date birthDate = new Date(1992, 8, 30);

        // When
        Cat buddy = AnimalFactory.createCat(name, birthDate);

        // Then
        Assert.assertEquals(birthDate, buddy.getBirthDate());
        Assert.assertEquals(name, buddy.getName());

    }
}
