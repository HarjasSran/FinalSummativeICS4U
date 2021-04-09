/*
add update method
update the mouseOver method
 */
package finalproject;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author harja
 */
abstract public class GameObject {

    int xPos;
    int yPos;
    int rotation;
    int width;
    int height;
    int scale;
    boolean direction; //true == left

//    static BufferedImage GIRAFFE_IMAGE = null;
//    static BufferedImage BOSS_IMAGE = null;
//    static BufferedImage GORILLA_IMAGE = null;
//    static BufferedImage TIGER_IMAGE = null;
//    static BufferedImage MONKEY_IMAGE = null;
//    static BufferedImage ZEBRA_IMAGE = null;
//
//    static BufferedImage FIREBALL_IMAGE = null;
//    static BufferedImage WATERBALL_IMAGE = null;
//    static BufferedImage SNOWBALL_IMAGE = null;
//
//    static BufferedImage CARD_SPRITESHEET = null;

    /**
     * Default constructor
     */
    
    

    public GameObject() {

    
        xPos = 0;
        yPos = 0;
        rotation = 0;
        width = 0;
        height = 0;
        scale = 0;
        direction = true; //Facing left
    }

    /**
     * Second constructor used for making GameObjects
     *
     * @param xPos - x position of object
     * @param yPos - y position of object
     * @param rotation - rotation of the object
     * @param width - width of the object
     * @param height - height of the object
     * @param scale - scale of the object
     * @param direction - the direction the object is facing. true == left
     */
    public GameObject(int xPos, int yPos, int rotation, int width, int height,int scale, boolean direction) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.rotation = rotation;
        this.width = width;

        this.height = height;
        this.scale = scale;
        this.direction = direction;
    }

    /**
     * Mutator method which changes x and y position of game objects
     *
     * @param xPos - x position of the object
     * @param yPos - y position of the object
     */
    public void move(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    /**
     * Mutator method which changes the x position of the game objects
     *
     * @param xPos - x position of the object
     */
    public void setX(int xPos) {
        this.xPos = xPos;
    }

    /**
     * Mutator method which changes the y position of the game objects
     *
     * @param yPos - y position of the object
     */
    public void setY(int yPos) {
        this.yPos = yPos;
    }
    /**
     * mutator method which sets the x and y position of the game objects
     * @param xPos
     * @param yPos 
     */
    public void setPositon(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    /**
     * Accessor method for x position
     *
     * @return - x position of the object
     */
    public int getX() {
        return xPos;//return th x position
    }

    /**
     * Accessor method for y position
     *
     * @return - y position of the object
     */
    public int getY() {
        return yPos;//return the y position
    }

    /**
     * Mutator method to change the rotation of the object
     *
     * @param rotation - rotation of the object
     */
    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    /**
     * Accessor method for rotation
     *
     * @return - rotation of the object
     */
    public int getRotation() {
        return rotation;//return the rotation
    }



    /**
     * Accessor method for scale
     *
     * @return - scale of the object
     */
    public double getScale() {
        return scale;//return the scale
    }

    /**
     * Mutator method to set the width of the object
     *
     * @param width - width of the object
     */
    public void setWidth(int width) {

     
            this.width = width;

    }

    /**
     * Accessor method for width
     *
     * @return - width of the object
     */
    public int getObjectWidth() {
        
        return width;//return the width
    }

    /**
     * Mutator method to set the height of the object
     *
     * @param height - height of the object
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Accessor method for height
     *
     * @return - height of the object
     */
    public int getObjectHeight() {
        return height;
    }

    /**
     * Mutator method to set the direction that the object is facing
     *
     * @param direction - direction that the object is facing
     */
    public void setDirection(boolean direction) {
        this.direction = direction;
    }

    /**
     * Accessor method for directon
     *
     * @return - direction that the object is facing
     */
    public boolean getDirection() {
        return direction;//return the direction
    }
    /**
     * check if the mouse is over an object
     */
    public void mouseOver() { 
        
    }

    /**
     * Accessor method to return all GameObject attributes and values
     *
     * @return - all GameObject attributes and values
     */
    public String toString() {
        return "X Position: " + xPos + "\tY Position: " + yPos + "\tRotation: " + rotation + "\tWidth: " + width + "\tHeight: " + height + "\tScale: " + scale + "\tDirection: " + direction;//to string of attributes of the object
    }
    /**
     * method to create buffered image
     * @param src
     * @return 
     */
    protected BufferedImage createBufferedImage(String src) {
        BufferedImage img;

        try {

            img = ImageIO.read(getClass().getResourceAsStream(src)); //load image using source and save

        } catch (IOException | IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "ERROR LOADING " + src + " :\n" + e); //error message
            img = null; //no image if error occurs 

        }
        return img;//return the image

    }

}
