/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

/**
 *
 * @author Dresen_HP
 */
public class HuntControl {
    public double calcFoodWeight(long baseWeight1, long baseWeight2, int guide) {
        // validate inputs
        if (baseWeight1 < 0) {
            return -1;
        }
        if (baseWeight2 < 0) {
            return -1;
        }
        if (guide != 0 && guide != 1) {
            return -1;
        }
        
        // calculations
        long yield = baseWeight1 + baseWeight2;
        long weight;
        if (guide == 0) {
            weight = yield - 100;
            if (weight > 0) {
                yield = 100;
            }
        }
        if (guide == 1) {
            weight = yield - 200;
            if (weight > 0) {
                yield = 200;
            }
        }
        return yield;
    }

        
    
}
