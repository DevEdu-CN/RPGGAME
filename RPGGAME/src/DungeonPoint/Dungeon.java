/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DungeonPoint;

/**
 *
 * @author Crescer
 */
public class Dungeon extends Map {
    @Override
    public void researcherObserve(Researcher Player, int test) {
        if(test >= this.CA) { 
        System.out.println("Vida Vegetal:" + this.life);
        setExplore();
        };
    }

    @Override
    public void scoutObserve(Scout Player, int test) {
        if(test >= this.CA) { 
        System.out.println("Clima:" + this.clima + "Relevo: " + this.relevo);
        setExplore();
        }
    }

    @Override
    public void archaeologistObserve(Archaeologist Player, int test) {
        if(test >= this.CA) { 
        System.out.println("Rochas:" + this.typeRock );
        setExplore();
        }
    }
    public void setExplore(){
    this.explorado = true; 
    };
}
