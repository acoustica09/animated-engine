import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Oval here.
 * 
 * @author Marlene Inoue 
 * @version 1.0 18 October 2018
 */
public class Oval extends Actor {
    /**
     * Default Oval Constructor
     */
    public Oval() {
        this(50, 25, new Color(Greenfoot.getRandomNumber(256),
                Greenfoot.getRandomNumber(256),
                Greenfoot.getRandomNumber(256),
                Greenfoot.getRandomNumber(256)));
    }

    /**
     * Oval Constructor
     *
     * @param width  The width of the oval.
     * @param height  The height of the oval.
     * @param color  The color of the oval.
     */
    public Oval(int width, int height, Color color) {
        GreenfootImage image = new GreenfootImage(width, height);
        image.setColor(color);
        image.fillOval(0, 0, width, height);
        setImage(image);
    }

    /**
     * Act - do whatever the Oval wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        int alpha = getImage().getTransparency();
        
        if (alpha > 2) {
            getImage().setTransparency(alpha - 2);
        }
        else {
            getWorld().removeObject(this);
        }
    }    
}
