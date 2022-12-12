package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addTest(){
        //Given:
        Cat cat = new Cat("Figs", new Date(), 18 );
        String expected = "Figs";
        //When:
        CatHouse.add(cat);
        String actual = cat.getName();
        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeIdTest(){
        //Given:
        Cat cat = new Cat("Blake", null, 34);
        CatHouse.add(cat);
        //When:
        CatHouse.remove(34);
        Cat actual = CatHouse.getCatById(34);
        //Then:
        Assert.assertNull(actual);
    }

    @Test
    public void removeCatTest(){
        //Given
        Cat cat = new Cat("Holly",null,55);
        CatHouse.add(cat);
        //When
        CatHouse.remove(cat);
        Cat actual = CatHouse.getCatById(55);
        //Then
        Assert.assertNull(actual);
    }

    @Test
    public void getCatByIdTest(){
        //Given:
        Cat cat = new Cat("Mouse", null, 32 );
        CatHouse.add(cat);
        //When:
        CatHouse.remove(32);
        Cat actual = CatHouse.getCatById(32);
        //Then:
        Assert.assertNull(actual);
    }

    @Test
    public void getNumberOfCatsTest(){
        //Given:
        CatHouse.clear();
        Cat cat1 = new Cat("Mars", null, 23);
        Cat cat2 = new Cat("Sally", null, 12);
        Integer expected = 2;
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        //When:
        Integer actual = CatHouse.getNumberOfCats();
        //Then:
        Assert.assertEquals(expected, actual);
    }
}

