package uaslp.objects.list;

import uaslp.objects.list.Exception.NotSuchElementException;
import uaslp.objects.list.Exception.NotValidIndexException;

public interface Iterator <T> {

    boolean hasNext();

    T next() throws NotSuchElementException, NotValidIndexException;
}
