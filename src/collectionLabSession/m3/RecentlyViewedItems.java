package collectionLabSession.m3;

import collectionLabSession.m1.Item;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItems {

    private List<Item> items;
    private Integer MAX_SIZE = 3;

    public RecentlyViewedItems() {
        items = new LinkedList<>();
    }

    public void addRecentlyViewedItem(Item item) {
        items.remove(item);

        items.addFirst(item);
        if (items.size() > MAX_SIZE) {
            items.removeLast();
        }
    }

    public List<Item> getRecentlyViewedItems() {
        return new ArrayList<>(items);
    }
}