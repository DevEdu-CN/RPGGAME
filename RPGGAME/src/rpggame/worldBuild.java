/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpggame;

import java.util.*;



/**
 *
 * @author Crescer
 * @param <T>


 */
public class worldBuild <T extends Map> {

    List <T> list = new ArrayList<>(); 
    public void addmap(T map) {
        list.add(map);
        System.out.println(map.getClass());
    }
    public void getMap () {
        list.forEach(System.out::println);
    }

   
    } 
    
    
    
