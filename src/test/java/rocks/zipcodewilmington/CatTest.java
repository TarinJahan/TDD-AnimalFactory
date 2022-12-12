package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    Cat cat = new Cat(null, null, null);
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
    @Test
    public void setNameTest(){
        //Given:
        String expected = "Sora";
        //When:
        cat.setName(expected);
        String actual = cat.getName();
        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        //Given:
        String expected = "meow!";
        //When:
        String actual = cat.speak();
        //Them:
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setBirthDateTest(){
        //Given:
        Date expected = new Date(2019, 3, 24);
        //When:
        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();
        //Them:
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void eatTest(){
        //Given:
        Integer eat = 1;
        Food food = new Food();
        //When:
        cat.eat(food);
        Integer meals = cat.getNumberOfMealsEaten();
        //Them:
        Assert.assertEquals(eat, meals);
    }
    @Test
    public void getIdTest(){
        //Given:
        Cat cat = new Cat(null, null, 15);
        Integer id = 15;
        //When:
        Integer actual = cat.getId();
        //Then:
        Assert.assertEquals(id, actual);
    }
    @Test
    public void animalInheritance() {
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void mammalInheritance() {
        Assert.assertTrue(cat instanceof Mammal);
    }
}
