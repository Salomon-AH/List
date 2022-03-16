package uaslp.objects.list.arraylist;

import uaslp.objects.list.Iterator;
import uaslp.objects.list.List;

public class ArrayList<T> implements List<T> {
    private static final int DEFAULT_SIZE = 50;
    private T[] array;
    private int size;

    public ArrayList(){
        array = (T[])new Object[DEFAULT_SIZE];
    }

    public ArrayList(int size){
        array = (T[])new Object[size];
    }

    @Override
    public void addAtTail(T data){
        if(size == array.length){
            increaseArraySize();
        }

        this.array[size] = data;
        size++;
    }

    @Override
    public void addAtFront(T data){
        if(size == array.length){
            increaseArraySize();
        }

        if (size >= 0){
            System.arraycopy(array, 0, array, 1, size);
        }
        array[0] = data;
        size++;
    }

    @Override
    public void remove(int index){
        if(index < 0 || index >= size){
            return;
        }

        if (size - 1 - index >= 0){
            System.arraycopy(array, index + 1, array, index, size - 1 - index);
        }
        array[size - 1] = null;
        size--;
    }

    @Override
    public void removeAll(){
        for(int i = 0; i < size - 1; i++){
            array[i] = null;
        }
        size = 0;
    }

    @Override
    public void setAt(int index, T data){
        if (index >= 0 && index < size){
            array[index] = data;
        }
    }

    @Override
    public T getAt(int index){
        return index >= 0 && index < size ? array[index] : null;
    }

    @Override
    public Iterator<T> getIterator(){
        return new ArrayListIterator<>(this);
    }

    @Override
    public int getSize(){
        return size;
    }

    private void increaseArraySize(){
        T[]newArray = (T[])new Object[array.length * 2];

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }

        array = newArray;
    }
}