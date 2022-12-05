package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){
        AnimalFactory dog = new AnimalFactory();
        Dog sora = dog.createDog("Sora", new Date(2019,8, 31));
        Assert.assertTrue((sora.getName()).equals("Sora"));
        Assert.assertTrue(sora.getBirthDate().equals(new Date(2019, 8, 31)));
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest(){
        AnimalFactory cat = new AnimalFactory();
        Cat figs = cat.createCat("Figs", new Date(2018, 2, 14));
        Assert.assertTrue((figs.getName()).equals("Figs"));
        Assert.assertTrue(figs.getBirthDate().equals(new Date(2018, 2, 14)));
    }
}
