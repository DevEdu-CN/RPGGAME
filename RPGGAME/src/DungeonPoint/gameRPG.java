/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DungeonPoint;



/**
 *
 * @author Crescer
 */

public class gameRPG {
    public static void main (String[] args){
//    Player KiritoGameplay = new Player();;;
//    KiritoGameplay.name = "KiritoGameplay";
//    KiritoGameplay.Roll(4 ,6, KiritoGameplay.name);
//    KiritoGameplay.setAtributtes(10, 15, 20);
//   System.out.print(KiritoGameplay.Vida(KiritoGameplay.force, KiritoGameplay.constitution));
//    
//   
      Archaeologist Rogue = new Archaeologist();
      Researcher Kirito = new Researcher();
      savePoint Ponto = new savePoint();
      Rogue.createCharacter("João");
      Kirito.createCharacter("Pedro");
      Dungeon Masmorra = new Dungeon();
      Masmorra.life = "Flores";
      Masmorra.relevo = "Esse relevo";
      Masmorra.typeRock = "Verde";
      Masmorra.CA = 2;
      Rogue.Accept(Masmorra);
      Kirito.Accept(Masmorra);
      Ponto.save(Rogue);
    }
}