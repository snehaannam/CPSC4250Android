package com.example.getitems.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ItemViewModel {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<ItemModel> ITEMS = new ArrayList<ItemModel>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, ItemModel> ITEM_MAP = new HashMap<String, ItemModel>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        addItem(new ItemModel("Muffler", "Protects against heat and cold", 1, 1, 1,"muffler",ItemLocationEnum.Necklass));
        addItem(new ItemModel("Ring of Blocking", "Creates a wall of blocking", 0, 0, 2,"ring_of_blocking",ItemLocationEnum.RightFinger));
        addItem(new ItemModel("Warm Sock", "Protects against ice and fire attacks", 0, 0, 3,"warm_sock",ItemLocationEnum.Feet));
    }

    private static void addItem(ItemModel item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class ItemModel {
        public final int Range;
        public final int Damage;
        public final int Value;
        public final String Name;
        public final String Description;
        public final String id = UUID.randomUUID().toString();
        public final String Guid = id;
        public final String ImageURI;
        public final ItemLocationEnum Location;

        public ItemModel(String name,
                         String description,
                         int range,
                         int damage,
                         int value,
                         String uri,
                         ItemLocationEnum location) {
            this.Name = name;
            this.Description = description;
            this.Range = range;
            this.Damage  = damage;
            this.Value = value;
            this.ImageURI = uri;
            this.Location = location;
        }

        @Override
        public String toString() {
            return Name;
        }
    }
}