/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rpggame;

import java.util.Random;
/**
 *
 * @author Crescer
 */
abstract class Creature {
    /* Característica das Criaturas */
    protected String name;
    protected String race;
    protected int Level; 
    
    protected int force; 
    protected int constitution; 
    protected int Intelligence; 
    

    public abstract int Roll(int dice, int sided, String name); 
    public int MP (int intelligence, int constitution) {
    return this.Intelligence * 2 + this.constitution / 2;
    }; 
    public int Vida (int force, int constitution) {
    return this.constitution * 2 + this.force / 2;
    
    }; 


}

class Player extends Creature{
    @Override
    public int Roll(int dice, int sited, String name) {
    int playDice  = 0;
    int result = 0;
    String allDice = "";
    Random rand = new Random();
    for (int i = 0; i < dice; i++) {
        playDice = rand.nextInt(1, sited);
        allDice += "[" + playDice + "]";
        result += playDice;
        
    }
    System.out.println (name + " rolou " + dice + "D" + sited +
            "(" + allDice + ") = " 
            + result); 
    return result;    
    }
    
    public void setAtributtes(int force, int constitution, int intelligence){
        this.force = force; 
        this.constitution = constitution; 
        this.Intelligence = intelligence;   
    }
    public void Observa(MapFloresta forest){
        System.out.println();
    }
    
    
}  
