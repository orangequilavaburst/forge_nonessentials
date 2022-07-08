package com.j8bit.forager_nonessentials.entity.client.variant;


import java.util.Arrays;
import java.util.Comparator;

public enum AmongusVariant {
    RED(0),
    BLUE(1),
    GREEN(2),
    PINK(3),
    ORANGE(4),
    YELLOW(5),
    BLACK(6),
    WHITE(7),
    PURPLE(8),
    BROWN(9),
    CYAN(10),
    LIME(11);

    private static final AmongusVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(AmongusVariant::getID)).toArray(AmongusVariant[]::new);
    private final int id;

    AmongusVariant(int id){
        this.id = id;
    }

    public int getID(){
        return this.id;
    }

    public static AmongusVariant byID(int id){
        return BY_ID[id % BY_ID.length];
    }

}
