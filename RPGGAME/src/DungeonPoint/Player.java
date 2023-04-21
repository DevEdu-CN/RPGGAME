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
public abstract class Player {
    protected String name;
    List <Dice> diceSet = new ArrayList<Dice>(); 
    
    public abstract void Accept(Map Observa); 
    public abstract void createCharacter(String name); 
    public abstract void addDice(Dice generic); 
   
    
};
