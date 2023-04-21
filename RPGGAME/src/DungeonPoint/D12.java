/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DungeonPoint;

import java.util.*;

/**
 *
 * @author Crescer
 */
public class D12 extends Dice {
    Random face = new Random();
    
    @Override
    public int Roll() {
    return face.nextInt(1, 20);
    }
    
}
