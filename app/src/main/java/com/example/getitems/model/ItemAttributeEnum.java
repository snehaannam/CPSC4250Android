package com.example.getitems.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum ItemAttributeEnum {

    Unknown(0),
    Speed(10),
    Defense(20),
    Attack(30),
    CurrentHealth(40),
    MaxHealth(50);

    // Make sure all strings are in the string table
    @Override
    public String toString() {
        switch(this){
            case Unknown:
                return "Unknown";
            case Speed:
                return "Speed";
            case Defense:
                return "Defense";
            case Attack:
                return "Attack";
            case CurrentHealth:
                return "Current Health";
            case MaxHealth:
                return "Max Health";
        }
        return "Unknown";
    }

    private int intValue;
    private static final List<String> VALUES;

    static {
        VALUES = new ArrayList<>();
        for (ItemAttributeEnum someEnum : ItemAttributeEnum.values()) {
            VALUES.add(someEnum.toString());
        }
    }

    public static List<String> getValues() {
        return Collections.unmodifiableList(VALUES);
    }

    ItemAttributeEnum(int value) {
        intValue = value;
    }

    // Lookup the string for the value
    public static String getString(int value){
        for (ItemAttributeEnum item : ItemAttributeEnum.values()) {
            if (value == item.intValue){
                return item.toString();
            }
        }
        return null;
    }

    // Lookup the value for the string
    public static int getValue(String string){
        for (ItemAttributeEnum item : ItemAttributeEnum.values()) {
            if (string.equals(item.toString())){
                return item.intValue;
            }
        }
        return -1;
    }
}