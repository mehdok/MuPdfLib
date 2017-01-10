package com.artifex.mupdflib;

public class OutlineActivityData {
    static private OutlineActivityData singleton;
    public OutlineItem items[];
    public int position;

    static public void set(OutlineActivityData d) {
        singleton = d;
    }

    static public OutlineActivityData get() {
        if (singleton == null) {
            singleton = new OutlineActivityData();
        }
        return singleton;
    }
}
