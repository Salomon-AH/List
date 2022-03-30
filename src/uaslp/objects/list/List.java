package uaslp.objects.list;

import uaslp.objects.list.Exception.NotNullValuesAllowedException;
import uaslp.objects.list.Exception.NotValidIndexException;

public interface List <T> {

    void addAtTail(T data)throws NotNullValuesAllowedException;

    void addAtFront(T data) throws NotNullValuesAllowedException;

    void remove(int index) throws NotValidIndexException;

    void removeAll();

    void setAt(int index, T data) throws NotValidIndexException, NotNullValuesAllowedException;

    T getAt(int index) throws NotValidIndexException;

    Iterator<T> getIterator();

    int getSize();
}
