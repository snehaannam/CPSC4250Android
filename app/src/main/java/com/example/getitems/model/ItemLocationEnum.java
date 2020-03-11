package com.example.getitems.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum ItemLocationEnum {

    Unknown(0),
    Head(10),
    Necklass(20),
    PrimaryHand(30),
    OffHand(40),
    Finger(50),
    RightFinger(60),
    LeftFinger(70),
    Feet(80);

    // Make sure all strings are in the string table
    @Override
    public String toString() {
        switch(this){
            case Unknown:
                return "Unknown";
            case Head:
                return "Head";
            case Necklass:
                return "Necklass";
            case PrimaryHand:
                return "PrimaryHand";
            case OffHand:
                return "OffHand";
            case Finger:
                return "Any Finger";
            case RightFinger:
                return "Right Finger";
            case LeftFinger:
                return "Left Finger";
            case Feet:
                return "Feet";
        }
        return "Unknown";
    }

    private int intValue;
    private static final List<String> VALUES;

    static {
        VALUES = new ArrayList<>();
        for (ItemLocationEnum someEnum : ItemLocationEnum.values()) {
            VALUES.add(someEnum.toString());
        }
    }

    public static List<String> getValues() {
        return Collections.unmodifiableList(VALUES);
    }

    ItemLocationEnum(int value) {
        intValue = value;
    }

    // Lookup the string for the value
    public static String getString(int value){
        for (ItemLocationEnum item : ItemLocationEnum.values()) {
            if (value == item.intValue){
                return item.toString();
            }
        }
        return null;
    }

    // Lookup the value for the string
    public static int getValue(String string){
        for (ItemLocationEnum item : ItemLocationEnum.values()) {
            if (string.equals(item.toString())){
                return item.intValue;
            }
        }
        return -1;
    }
}