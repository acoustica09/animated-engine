import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Visualizer here.
 * 
 * @author Marlene Inoue 
 * @version 1.1 18 October 2018
 */
public class Visualizer extends Actor {
    private GreenfootImage image;

    public Visualizer() {
        image = new GreenfootImage(800, 340); // make image
        image.setColor(Color.DARK_GRAY); // set a color to draw with
        image.fill(); // draw
        setImage(image); // set the image of the actor
    }

    /**
     * Play imagery when pressing piano keys.
     *
     * @param k The key that was played.
     */
    public void visualize(Key k) {
        int width = k.getImage().getWidth();
        int x = k.getX();
        int drawHeight = image.getHeight() - width / 2;
        int y = Greenfoot.getRandomNumber(drawHeight) + width / 4;

        Color color = k.getColor();
        Oval shape = new Oval(width, width / 2, color);
        getWorld().addObject(shape, x, y);

        GreenfootImage image = new GreenfootImage(50, 50);
        image.setColor(color);
        //int[] x1 = {50, 100, 150, 150, 50};
        //int[] y1 = {130, 100, 150, 160, 160};
        image.fill();
        int[] x1 = {130, 180, 195, 230, 280, 240, 220, 195, 155, 170};
        int[] y1 = {100, 100, 0, 100, 100, 150, 200, 175, 200, 150};
        image.fillPolygon(x1, y1, x1.length);
        
        /**
        // Following is the visualization code
        if (image.getColor().equals(Color.MAGENTA)) {
        image.setColor(Color.CYAN);
        }
        else {
        image.setColor(Color.MAGENTA);
        }
        
        image.fill();
        image.drawLine(0, 0, 49, 49);
        image.drawRect(0, 0, 30, 30);
        image.fillOval(20, 20, 29, 29);

        int[] x1 = {100, 200, 200};
        int[] y1 = {100, 100, 200};
        image.fillPolygon(x1, y1, x1.length);
         */
    }

    /**
     * Act - do whatever the Visualizer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {

    }    
}
