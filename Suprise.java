import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Suprise here.
 * 
 * @author Chandler Clarke
 * @version (a version number or a date)
 */
public class Suprise extends Actor{
    private Color[] colors = {Color.BLUE, Color.MAGENTA, Color.GREEN, Color.YELLOW, Color.CYAN};
    public Suprise() {
        this(50, 50);
    }

    /**
     * 
     */
    public Suprise(int width, int height) {
        GreenfootImage image = new GreenfootImage(width, height);
        Color color = colors[Greenfoot.getRandomNumber(5)];
        image.setColor(color);
        image.fillRect(0, 0, width, height);
        setImage(image);
    }

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
