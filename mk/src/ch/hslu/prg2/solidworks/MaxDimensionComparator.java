/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.solidworks;

import java.util.Comparator;

/**
 *
 * @author mogria
 */
public class MaxDimensionComparator implements Comparator<Cube> {

    @Override
    public int compare(Cube o1, Cube o2) {
        return o1.getMaxDimension() - o2.getMaxDimension();
    }
    
    
}
