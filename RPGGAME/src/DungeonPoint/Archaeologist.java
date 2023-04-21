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
public class Archaeologist extends Player{
    
    @Override
    public void Accept(Map local) {
      local.archaeologistObserve(this, diceSet.get(0).Roll());
    }

    @Override
    public void createCharacter(String name) {
       this.name = name;
       D8 primeiro = new D8(); 
       D6 segundo = new D6();
       D12 terceiro = new D12();
       this.addDice(primeiro);
       this.addDice(segundo);
       this.addDice(terceiro);
    }

    @Override
    public void addDice(Dice generic) {
        this.diceSet.add(generic);
    }
    
    
}
