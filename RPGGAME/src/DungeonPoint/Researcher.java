/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DungeonPoint;

/**
 *
 * @author Crescer
 */
public class Researcher extends Player{

    @Override
    public void Accept(Map local) {
      local.researcherObserve(this, diceSet.get(0).Roll());
    }
    @Override
    public void createCharacter(String name) {
       this.name = name;
       D8 primeiro = new D8(); 
       D20 segundo = new D20();
       D10 terceiro = new D10();
       this.addDice(primeiro);
       this.addDice(segundo);
       this.addDice(terceiro);
    }

    @Override
    public void addDice(Dice generic) {
        this.diceSet.add(generic);
    }
}
