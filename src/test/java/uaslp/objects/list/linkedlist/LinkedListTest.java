package uaslp.objects.list.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objects.list.Exception.NotNullValuesAllowedException;
import uaslp.objects.list.Exception.NotSuchElementException;
import uaslp.objects.list.Exception.NotValidIndexException;
import uaslp.objects.list.Iterator;

public class LinkedListTest {

    @Test
    public void givenANewList_whenGetSize_thenResultIZero(){

        //Given:
        LinkedList<String> list = new LinkedList<>();

        //When:
        int sizeOfList = list.getSize();

        //Then:
        Assertions.assertEquals(0, sizeOfList, "Size of list after creation must be zero");
    }

    @Test
    public void givenANewList_whenAddAtFrontAnElement_thenSizeIsOne() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hello");

        //When
        int size = list.getSize();

        //Then
        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Hello", list.getAt(0));
    }

    @Test
    public void givenANewList_whenAddAtTailAnElement_thenSizeIsOne() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given
        LinkedList<String> list = new LinkedList<>();

        list.addAtTail("Hello");

        //When
        int size = list.getSize();

        //Then
        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Hello", list.getAt(0));
    }

    @Test
    public void givenANewListWithElement_whenAddAtFrontAnElement_thenSizeIsTwo() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given
        LinkedList<String> list = new LinkedList<>();

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
    public void givenANewListWithElement_whenAddAtTailAnElement_thenSizeIsTwo() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given
        LinkedList<String> list = new LinkedList<>();

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
        LinkedList<String> list = new LinkedList<>();
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
        LinkedList<String> list = new LinkedList<>();
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
        LinkedList<String> list = new LinkedList<>();
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
        LinkedList<String> list = new LinkedList<>();
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
        LinkedList<String> list = new LinkedList<>();
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
        LinkedList<String> list = new LinkedList<>();
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
        LinkedList<String> list = new LinkedList<>();
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
    public void givenAListWithTwoElements_whenSetAt_thenElementIsModified() throws NotValidIndexException, NotNullValuesAllowedException{
        //Given:
        LinkedList<String> list = new LinkedList<>();
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
    public void givenAListWithThreeElements_whenGetIterator_thenWorksOverThreeElements() throws NotNullValuesAllowedException, NotValidIndexException, NotSuchElementException {
        //Given:
        LinkedList<String> list = new LinkedList<>();
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
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hello");
        list.addAtFront("World");

        //When:
        //Then:
        Assertions.assertThrows(NotValidIndexException.class, ()->list.remove(3));
    }

    @Test
    public void givenANewListWithTwoElements_whenSetAt_thenNotValidIndexExceptionIsThrown() throws NotNullValuesAllowedException{
        //Given:
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hello");
        list.addAtFront("World");

        //When:
        //Then:
        Assertions.assertThrows(NotValidIndexException.class, ()->list.setAt(3, "Valor"));
    }

    @Test
    public void givenANewListWithTwoElements_whenAddAtFrontNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotNullValuesAllowedException{
        //Given:
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hello");
        list.addAtFront("World");

        //When:
        //Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class, ()->list.addAtFront(null));
    }

    @Test
    public void givenANewListWithTwoElements_whenAddAtTailNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotNullValuesAllowedException{
        //Given:
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hello");
        list.addAtFront("World");

        //When:
        //Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class, ()->list.addAtTail(null));
    }

    @Test
    public void givenANewListWithTwoElements_whenSetAtNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotNullValuesAllowedException{
        //Given:
        LinkedList<String> list = new LinkedList<>();

        list.addAtFront("Hello");
        list.addAtFront("World");

        //When:
        //Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class, ()->list.setAt(0, null));
    }
}
