import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Random movement, color and start point.
 * 
 * @author Chandler Clarke
 * @version 10/24/18
 */
public class Suprise extends Actor{
    private Color[] colors = {Color.BLUE, Color.MAGENTA, Color.GREEN, Color.YELLOW, Color.CYAN};
    private int direction, yDirection = -4;
    private int startingInt, startingYInt, actTimer;
    public Suprise(){
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
        if (actTimer == 1){
            startingInt = getX();
            startingYInt = getY();
        }
        randomMover();
        int alpha = getImage().getTransparency();
        if (alpha > 2) {
            getImage().setTransparency(alpha - 2);
        }
        else {
            getWorld().removeObject(this);
        }
        actTimer++;
    }

    public void randomMover(){
        setLocation(getX() + direction, getY() + yDirection);
        if (getX() <= startingInt - 50){
            direction = Greenfoot.getRandomNumber(10)+1;
        }
        if (getX() >= startingInt + 50){
            direction = -(Greenfoot.getRandomNumber(10)+1) ;
        }
        if (getY() <= startingYInt - 50 || isAtEdge() == true){
            yDirection = Greenfoot.getRandomNumber(10)+1;
        }
        if (getY() >= startingYInt + 50 || getY() >= 300 ){
            yDirection = -(Greenfoot.getRandomNumber(10)+1);
        }
    }
}
