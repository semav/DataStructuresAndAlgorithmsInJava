package semav.chapter6;

import java.util.Iterator;

public interface FavoriteList<T extends Comparable> {
    void access(T element);
    void remove(T element);
    Iterator<T> top();
}
