package semav.chapter6;

import java.util.Iterator;
import java.util.List;

public interface FavoriteList<T> {
    void access(T value);
    void remove(T value);
    List<T> top(int k);
}
