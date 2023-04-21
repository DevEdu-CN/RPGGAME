/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DungeonPoint;
import java.util.*;

/**
 *
 * @param <T>
 */
public class savePoint <T extends Player> {

    List <T> list = new ArrayList<>(); 
    public void save(T map) {
        list.add(map);
        System.out.println(map.name);
    }
    public void getMap () {
        list.forEach(System.out::println);
    }

   
    } 