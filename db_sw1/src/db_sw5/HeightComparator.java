/* Copyright 2015 Hochschule Luzern - Technik & Architektur */

import java.util.Comparator;

/**
 * Compares to mountains according there heights.
 * @author Peter Sollberger (peter.sollberger@hslu.ch)
 */
public class HeightComparator implements Comparator<Mountain> {

    @Override
    public int compare(Mountain b1, Mountain b2) {
        return b2.getHeight() - b1.getHeight();
    }
}
