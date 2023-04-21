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
public abstract class Map{
    public String clima;
    public String relevo;
    public String life;
    public String typeRock;
    public Boolean explorado = false; 
    public int CA = 0; 
//    public List<Event> Eventos;  
    
    public abstract void researcherObserve(Researcher Player, int test);
    
    public abstract void scoutObserve(Scout Player, int test);

    public abstract void archaeologistObserve(Archaeologist Player, int test);
   
}
