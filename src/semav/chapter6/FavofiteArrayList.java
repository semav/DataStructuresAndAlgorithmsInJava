package semav.chapter6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FavofiteArrayList<T> implements FavoriteList<T> {
    private final ArrayList<Entry<T>> array = new ArrayList<>();

    @Override
    public void access(T value) {
        int index = find(value);

        if (index < 0){
            array.add(new Entry<>(value));
        }
        else {
            Entry<T> entry = array.get(index);
            entry.incrementCount();

            while (index > 0){
                Entry<T> prevEntry = array.get(index - 1);
                if (prevEntry.count < entry.count) {
                    Collections.swap(array, index, index - 1);
                    index--;
                }
                else {
                    break;
                }
            }
        }
    }

    @Override
    public void remove(T value) {
        int index = find(value);

        if (index >= 0) {
            array.remove(index);
        }
    }

    @Override
    public List<T> top(int limit) {
        if (limit < 0)
            throw new IllegalArgumentException("Invalid argument");

        return array.stream().limit(limit).map(e->e.value).collect(Collectors.toList());
    }

    private int find(T value){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).value.equals(value)){
                return i;
            }
        }
        return -1;
    }

    private static class Entry<E> {
        private E value;
        private int count;

        Entry(E value) {
            count = 1;
            this.value = value;
        }

        public int incrementCount() { return ++count; }
    }
}
