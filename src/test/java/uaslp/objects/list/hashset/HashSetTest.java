package uaslp.objects.list.hashset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objects.list.Exception.NotNullValuesAllowedException;
import uaslp.objects.list.Exception.NotValidIndexException;
import uaslp.objects.list.Exception.NotSuchElementException;
import uaslp.objects.list.Iterator;

public class HashSetTest {

    @Test
    public void givenANewList_whenGetSize_thenResultIZero(){

        //Given:
        HashSet<String> list = new HashSet<>();

        //When:
        int sizeOfList = list.size();

        //Then:
        Assertions.assertEquals(0, sizeOfList, "Size of list after creation must be zero");
    }

    @Test
    public void givenANewList_whenAddOne_thenSizeIsOne() throws NotNullValuesAllowedException, NotValidIndexException{
        //Given:
        HashSet<String> list = new HashSet<>();
        list.add("Hello");

        //When:
        int sizeOfList = list.size();

        //Then:
        Assertions.assertEquals(1, sizeOfList);
    }

    @Test
    public void givenAListWithOneElement_whenAddRepeated_thenSizeIsOne() throws NotNullValuesAllowedException, NotValidIndexException{
        //Given:
        HashSet<String> list = new HashSet<>();
        list.add("Hello");

        //When:
        list.add("Hello");

        //Then:
        int sizeOfList = list.size();
        Assertions.assertEquals(1, sizeOfList);
    }

    @Test
    public void givenAListWithThreeElements_whenAddOne_thenReorganize() throws NotNullValuesAllowedException, NotValidIndexException{
        //Given:
        HashSet<String> list = new HashSet<>();
        list.add("Hello");
        list.add("World");
        list.add(":D");

        //When:
        list.add("!!!");

        //Then:
        int sizeOfList = list.size();
        Assertions.assertEquals(4, sizeOfList);
    }

    @Test
    public void givenAListWithTwoElements_whenRemoveOne_thenSizeIsOne() throws NotNullValuesAllowedException, NotValidIndexException{
        //Given:
        HashSet<String> list = new HashSet<>();
        list.add("Hello");
        list.add("World");

        //When:
        list.remove("Hello");

        //Then:
        int sizeOfList = list.size();
        Assertions.assertEquals(1, sizeOfList);
    }

    @Test
    public void givenAListWithOneElement_whenItContainsTheElement_thenGetTrue() throws NotNullValuesAllowedException, NotValidIndexException{
        //Given:
        HashSet<String> list = new HashSet<>();
        list.add("Hello");

        //When:
        //Then:
        Assertions.assertTrue(list.contains("Hello"));
    }

    @Test
    public void givenAListWithOneElement_whenItDoesNotContainTheElement_thenGetFalse() throws NotNullValuesAllowedException, NotValidIndexException{
        //Given:
        HashSet<String> list = new HashSet<>();
        list.add("Hello");

        //When:
        //Then:
        Assertions.assertFalse(list.contains("World"));
    }

    @Test
    public void givenAListWithThreeElements_whenIteratorGoesNextTwoTimes_thenIteratorHasNext() throws NotNullValuesAllowedException, NotValidIndexException, NotSuchElementException{
        //Given:
        HashSet<String> list = new HashSet<>();
        list.add("Hello");
        list.add("World");
        list.add(":D");

        //When:
        list.iterator().next();
        list.iterator().next();
        list.iterator().hasNext();

        //Then:
        int sizeOfList = list.size();
        Assertions.assertEquals(3, sizeOfList);
    }
}