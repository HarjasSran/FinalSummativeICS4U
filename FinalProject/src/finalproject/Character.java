/*
cant finish yet, wait for images
 */
package finalproject;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author harja
 */
public class Character extends GameObject {
    Color bow;
    Image animal;
    ArrayList cards;
    
    //public Character(){
    
    //public Character(Color bow, Image Animal, boolean direction, ArrayList cards)
    
    public void setBow(Color c){
        bow = c;
    }
    public Color getBow(){
        return bow;
    }
    
    //public void setAnimal(Image animal)
    
    public Image getAnimal(){
        return animal;
    }
    
    public ArrayList getCards(){
        return cards;
    }
    
    //public Character clone(){
        //Character newChar = new Character(Color bow, Image animal, boolean direction, ArrayList cards);
        //return newChar
    //}
    
    public String toString(){
        return bow + "\t" + animal + "\t" + cards;
    }
}