/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import interfaces.IPerson;

/**
 *
 * @author Alex
 */
public class Cleric implements IPerson {

    public void goTo(int x, int y) {
        System.out.printf("Slowly walk to %d; %d\n", x, y);
    }
    
}
