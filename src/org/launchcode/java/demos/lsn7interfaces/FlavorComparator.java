package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor o1, Flavor o2) {
        int size1 = o1.getAllergens().size();
        int size2 = o2.getAllergens().size();
        if (size1 - size2 < 0) {
            return 1;
        } else if (size1 - size2 > 0) {
            return -1;
        } else {
            return 0;
        }
    }

}
