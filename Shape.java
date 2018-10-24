import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Some sort of shape that appears at the top of the world and moves down 
 * to the keys as it fading away
 * 
 * @author Marlene Inoue
 * @version 1.0 23 October 2018
 */
public class Shape extends Actor {
    
    
    /**
     * 
     */
    public Shape() {
        this(50, 50, new Color(Greenfoot.getRandomNumber(256),
                       Greenfoot.getRandomNumber(256),
                       Greenfoot.getRandomNumber(256)));
    }
    
    /**
     * 
     */
    public Shape(int width, int height, Color color) {
        GreenfootImage image = new GreenfootImage(width, height);
        image.setColor(color);
        int[] x = {50, 100, 150, 150, 50};
        int[] y = {130, 100, 150, 160, 160};
        //int[] x = {130, 180, 195, 230, 280, 240, 220, 195, 155, 170};
        //int[] y = {100, 100, 0, 100, 100, 150, 200, 175, 200, 150};
        image.fillPolygon(x, y, x.length);
        //image.fillOval(0, 0, width, height);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Shape wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        
    }    
}
