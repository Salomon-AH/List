package uaslp.objects.list.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objects.list.Exception.NotNullValuesAllowedException;
import uaslp.objects.list.Exception.NotValidIndexException;
import uaslp.objects.list.Iterator;

public class ArrayListTest {

    @Test
    public void givenANewList_whenGetSize_thenResultIZero(){

        //Given:
        ArrayList<String> list = new ArrayList<>();

        //When:
        int sizeOfList = list.getSize();

        //Then:
        Assertions.assertEquals(0, sizeOfList, "Size of list after creation must be zero");
    }

    @Test
    public void givenANewList_whenAddAtFrontAnElement_thenSizeIsOne() throws NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hello");

        //When
        int size = list.getSize();

        //Then
        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Hello", list.getAt(0));
    }

    @Test
    public void givenANewList_whenAddAtTailAnElement_thenSizeIsOne() throws NotNullValuesAllowedException{
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Hello");

        //When
        int size = list.getSize();

        //Then
        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Hello", list.getAt(0));
    }

    @Test
    public void givenANewListWithElement_whenAddAtFrontAnElement_thenSizeIsTwo() throws NotNullValuesAllowedException{
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hello");

        //When
        list.addAtFront("World");

        //Then
        int size = list.getSize();
        Assertions.assertEquals(2, size);
        Assertions.assertEquals("World", list.getAt(0));
        Assertions.assertEquals("Hello", list.getAt(1));
    }

    @Test
    public void givenANewListWithElement_whenAddAtTailAnElement_thenSizeIsTwo() throws NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Hello");

        //When
        list.addAtTail("World");

        //Then
        int size = list.getSize();
        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Hello", list.getAt(0));
        Assertions.assertEquals("World", list.getAt(1));
    }

    @Test
    public void givenAListWithOneElement_whenRemove_thenSizeIsZero() throws NotValidIndexException, NotNullValuesAllowedException{
        //Given:
        ArrayList<String> list = new ArrayList<>();
        list.addAtFront("Hello");

        //When:
        list.remove(0);

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(0, size);
    }

    @Test
    public void givenAListWithTwoElements_whenRemoveIndexZero_thenSizeIsOne() throws NotValidIndexException, NotNullValuesAllowedException{
        //Given:
        ArrayList<String> list = new ArrayList<>();
        list.addAtFront("Hello");
        list.addAtTail("World");

        //When:
        list.remove(0);

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(1, size);
        Assertions.assertEquals("World", list.getAt(0));
    }

    @Test
    public void givenAListWithTwoElements_whenRemoveIndexOne_thenSizeIsOne() throws NotValidIndexException, NotNullValuesAllowedException{
        //Given:
        ArrayList<String> list = new ArrayList<>();
        list.addAtFront("Hello");
        list.addAtTail("World");

        //When:
        list.remove(1);

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Hello", list.getAt(0));
    }

    @Test
    public void givenAListWithThreeElements_whenRemoveIndexOne_thenSizeIsTwo() throws NotValidIndexException, NotNullValuesAllowedException{
        //Given:
        ArrayList<String> list = new ArrayList<>();
        list.addAtTail("World");
        list.addAtTail(":D");
        list.addAtFront("Hello");

        //When:
        list.remove(1);

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Hello", list.getAt(0));
        Assertions.assertEquals(":D", list.getAt(1));
    }

    @Test
    public void givenAListWithThreeElements_whenRemoveElementAtTail_thenSizeIsTwo() throws NotValidIndexException, NotNullValuesAllowedException{
        //Given:
        ArrayList<String> list = new ArrayList<>();
        list.addAtFront("Hello");
        list.addAtTail("World");
        list.addAtTail(":D");

        //When:
        list.remove(2);

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Hello", list.getAt(0));
        Assertions.assertEquals("World", list.getAt(1));
    }

    @Test
    public void givenAListWithThreeElements_whenRemoveElementAtFront_thenSizeIsTwo() throws NotValidIndexException, NotNullValuesAllowedException{
        //Given:
        ArrayList<String> list = new ArrayList<>();
        list.addAtFront("Hello");
        list.addAtTail("World");
        list.addAtTail(":D");

        //When:
        list.remove(0);

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("World", list.getAt(0));
        Assertions.assertEquals(":D", list.getAt(1));
    }

    @Test
    public void givenAListWithThreeElements_whenRemoveAll_thenSizeIsZero() throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> list = new ArrayList<>();
        list.addAtFront("Hello");
        list.addAtTail("World");
        list.addAtTail(":D");

        //When:
        list.removeAll();

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(0, size);
    }

    @Test
    public void givenAListWithTwoElements_whenSetAt_thenElementIsModified() throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> list = new ArrayList<>();
        list.addAtFront(":D");
        list.addAtTail("World");

        //When:
        list.setAt(0, "Hello");

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Hello", list.getAt(0));
        Assertions.assertEquals("World", list.getAt(1));
    }

    @Test
    public void givenAListWithThreeElements_whenGetIterator_thenWorksOverThreeElements() throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> list = new ArrayList<>();
        list.addAtFront("Hello");
        list.addAtTail("World");
        list.addAtTail(":D");

        //When:
        Iterator<String> iterator = list.getIterator();

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(3, size);
        Assertions.assertNotNull(iterator);
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Hello", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("World", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(":D", iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }

    @Test
    public void givenANewListWithTwoElements_whenRemoveIndexThree_thenNotValidIndexExceptionIsThrown() throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hello");
        list.addAtFront("World");

        //When:
        //Then:
        Assertions.assertThrows(NotValidIndexException.class, ()->list.remove(3));
    }

    /*
    @Test
    public void givenANewListWithTwoElements_whenSetAt_thenNotValidIndexExceptionIsThrown() throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hello");
        list.addAtFront("World");

        //When:
        //Then:
        Assertions.assertThrows(NotValidIndexException.class, ()->list.setAt(3, "Valor"));
    }*/
    
    @Test
    public void givenANewListWithTwoElements_whenAddAtFrontNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hello");
        list.addAtFront("World");

        //When:
        //Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class, ()->list.addAtFront(null));
    }

    @Test
    public void givenANewListWithTwoElements_whenAddAtTailNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hello");
        list.addAtFront("World");

        //When:
        //Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class, ()->list.addAtTail(null));
    }

    @Test
    public void givenANewListWithTwoElements_whenSetAtNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hello");
        list.addAtFront("World");

        //When:
        //Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class, ()->list.setAt(0, null));
    }

    @Test
    public void givenANewList_whenAddAtFrontTooMuchElements_thenIncreaseArraySize() throws NotNullValuesAllowedException
    {
        //Given:
        ArrayList<String> list = new ArrayList<>(2);

        //When:
        list.addAtFront("1");
        list.addAtFront("2");

        list.addAtFront("3");
        //Then
        int sizeOfList = list.getSize();
        Assertions.assertEquals(3, sizeOfList, "Increase array list");
        Assertions.assertEquals("3", list.getAt(0));
        Assertions.assertEquals("2", list.getAt(1));
        Assertions.assertEquals("1", list.getAt(2));
    }

    @Test
    public void givenANewList_whenAddAtTailTooMuchElements_thenIncreaseArraySize() throws NotNullValuesAllowedException
    {
        //Given:
        ArrayList<String> list = new ArrayList<>(2);

        //When:
        list.addAtTail("1");
        list.addAtTail("2");

        list.addAtTail("3");

        //Then
        int sizeOfList = list.getSize();
        Assertions.assertEquals(3, sizeOfList, "Increase array list");
        Assertions.assertEquals("1", list.getAt(0));
        Assertions.assertEquals("2", list.getAt(1));
        Assertions.assertEquals("3", list.getAt(2));
    }
}
