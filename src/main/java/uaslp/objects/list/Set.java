package uaslp.objects.list;

import uaslp.objects.list.Exception.NotNullValuesAllowedException;
import uaslp.objects.list.Exception.NotValidIndexException;

public interface Set<T> {

    void add(T element) throws NotValidIndexException, NotNullValuesAllowedException;

    void remove(T element) throws NotValidIndexException;

    boolean contains(T element) throws NotValidIndexException;

    Iterator<T> iterator();

    int size();

}
