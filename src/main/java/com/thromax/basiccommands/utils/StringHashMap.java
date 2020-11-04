package com.thromax.basiccommands.utils;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Equivalent to HashMap but intended to be unmodifiable.
 */
public final class StringHashMap implements Iterable<String> {
    HashMap<String, String> strs = new HashMap<String, String>();

    public StringHashMap(String[][] strings) {
        for (int i = 0; i < strings.length; i++) {
            this.strs.put(strings[i][0], strings[i][1]);
        }
    }

    /**
     * Returns String value that corresponds to the key provided.
     *
     * @param key Key that corresponds to the value to retrieve
     * @return String value that corresponds to the key provided
     */
    public String get(String key) {
        return strs.get(key);
    }

    @Override
    public Iterator<String> iterator() {
        return strs.keySet().iterator();
    }
}
