/*

 */
package finalproject;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author harja
 */
public class Player extends Character{
    String name;
    int rank;
    
    public Player(){
        name = "";
        rank = 0;
    }
    
    public Player(String name, Color bow, BufferedImage animal, boolean direction, ArrayList cards){
        this.name = name;
        this.bow = bow;
        this.animal = animal;
        this.direction = direction;
        this.cards = cards;
    }
        
    /**
     * 
     * @param name 
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * 
     * @return 
     */
    public String getName(){
        return name;
    }
    /**
     * 
     * @param rank 
     */
    public void setRank(int rank){
        this.rank = rank;
    }
    /**
     * 
     * @return 
     */
    public int getRank(){
        return rank;
    }
    /**
     * 
     * @return 
     */
    public Player clone(){
        Player newPlayer = new Player(); //After adding second constructor, use that
        return newPlayer;
    }
    /**
     * 
     * @return 
     */
    public String toString(){
        return name + "\t" + rank;
    }
}
