package collectionLabSession.m2;

import collectionLabSession.m1.Item;

import java.util.*;

public class Inventory<T extends Item> {
    private Map<String, T> map;

    public Inventory() {
        map = new HashMap<>();
    }

    public void add(T item) {
        map.put(item.getId(), item);
    }

    public void remove() {

    }

    public T get(String id) {
        return null;
    }

    public List<T> getAll() {
//        List<T> items = new ArrayList<>();
//        for(T val: map.values()) {
//            items.add(val);
//        }
        return new ArrayList<>(map.values());
    }
}