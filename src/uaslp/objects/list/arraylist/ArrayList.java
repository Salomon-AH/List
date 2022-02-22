package uaslp.objects.list.arraylist;

import uaslp.objects.list.linkedlist.LinkedListIterator;

public class ArrayList {
    /*private static final int DEFAULT_SIZE = 50;
    private String[] array;
    private int size;

    public ArrayList(){
        array = new String[DEFAULT_SIZE];
    }

    public ArrayList(int size){
        array = new String[size];
    }

    public void addAtTail(String data){
        if(size == array.length){
            increaseArraySize();
        }

        this.array[size] = data;
        size++;
    }

    public void addAtFront(String data){
        if(size >= 0){
            System.arraycopy();
        }
        array[0] = data;
    }

    public void remove(int index){
        for(int i = index; i < size - 1; i++){
            array[i] = array[i+1];
        }
        array[size-1] = null;
        size--;
    }

    public void removeAll(int index){
        for(int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    public void setAt(int index, String data){
        if (index >= 0 && index < size){
            array[index] = data;
        }
    }

    public void getAt(String index){
        return index >= 0 && index < size ? array[index];
    }

    public void removeAllWithValue(String data){
        return null;
    }

    public void getSize(){
        return null;
    }

    public void getIterator(ArrayListIterator){
        return null;
    }

    public void String[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

    private void increaseArraySize(){
        String []newArray = new String[array.length * 2];
        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }

        array = newArray;
    }*/
}
