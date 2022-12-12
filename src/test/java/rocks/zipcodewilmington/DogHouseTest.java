package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Tramp";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    @Test
    public void addTest(){
        //Given
        String expected = "Molly";
        Dog dog = new Dog("Molly", new Date(), 56);
        //When
        DogHouse.add(dog);
        Dog actual = DogHouse.getDogById(56);
        //Then
        Assert.assertEquals(expected, actual.getName());
    }

    @Test
    public void removeIdTest(){
        //Given
        Dog dog = new Dog("Marly", null, 70);
        DogHouse.add(dog);
        //When
        DogHouse.remove(70);
        Dog actual = DogHouse.getDogById(70);
        //Then
        Assert.assertNull(actual);
    }

    @Test
    public void removeDogTest(){
        //Given
        Dog dog = new Dog("Howard", null, 54);
        Integer expected = null;
        DogHouse.add(dog);
        //When
        DogHouse.remove(dog);
        Dog actual = DogHouse.getDogById(54);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogByIdTest(){
        //Given
        Dog dog = new Dog("Lilly", null, 41);
        String expected = "Lilly";
        DogHouse.add(dog);
        //When
        Dog actual = DogHouse.getDogById(41);
        //Then
        Assert.assertEquals(expected, actual.getName());
    }

}
