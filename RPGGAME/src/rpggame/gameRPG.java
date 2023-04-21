/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpggame;

import java.util.*;


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
    worldBuild world = new worldBuild();
    MapFloresta mapa = new MapFloresta();
    MapFloresta mapa2 = new MapFloresta();
    mapa.clima = "Qualquer coisa"; 
    mapa.location = "Pior ainda";
    mapa.relevo = "Odio";
    world.addmap(mapa);
    world.addmap(mapa2);
    world.getMap();
     System.out.println("sIdiota");
    }
}