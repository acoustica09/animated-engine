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
        String keyString = k.getString();
        //for even black keys @Chandler
        if (keyString == "w"|| keyString == "t"|| keyString == "u"|| keyString == "p"){  
            int width = Greenfoot.getRandomNumber(100)+2;
            int x = k.getX();
            int drawHeight = image.getHeight() - width / 2;
            int y = Greenfoot.getRandomNumber(drawHeight) + width / 4;
            Color color = k.getColor();
            Suprise suprise = new Suprise(width, width/2);
            getWorld().addObject(suprise, x, y);
        }
        //For every Black starting on the second @Camille
        if (keyString == "e"|| keyString == "y" || keyString == "o" || keyString == "]"){ 
            int width = k.getImage().getWidth();
            int x = k.getX();
            int drawHeight = image.getHeight() - width / 2;
            int y = Greenfoot.getRandomNumber(drawHeight) + width / 4;
            Color color = k.getColor();
            Triangles shape = new Triangles(width, width / 2);
            getWorld().addObject(shape, x, y);
        }
        //For every 3rd white key starting on the first @Tyler
        if (keyString == "a"|| keyString == "f" || keyString == "j" || keyString == ";"){ 
            int width = k.getImage().getWidth();
            int x = k.getX();
            int drawHeight = image.getHeight() - width / 2;
            int y = Greenfoot.getRandomNumber(drawHeight) + width / 4;
            Color color = k.getColor();
            Note shape = new Note();
            getWorld().addObject(shape, x, y);
        }
        //For every 3rd white key starting on the second @Marlene
        if (keyString == "s"|| keyString == "g" || keyString == "k" || keyString == "'"){ 
            int width = k.getImage().getWidth();
            int x = k.getX();
            int drawHeight = image.getHeight() - width / 2;
            int y = Greenfoot.getRandomNumber(drawHeight) + width / 4;
            Color color = k.getColor();
            Shape shape = new Shape(width, width / 2, color);
            getWorld().addObject(shape, x, y);
        }
        //For every 3rd white key starting on the third @Phil
        if (keyString == "d"|| keyString == "h" || keyString == "l" || keyString == "enter"){ 
            int width = k.getImage().getWidth();
            int x = k.getX();
            int drawHeight = image.getHeight() - width / 2;
            int y = Greenfoot.getRandomNumber(drawHeight) + width / 4;
            Color color = k.getColor();
            Oval shape = new Oval(width, width / 2, color);
            getWorld().addObject(shape, x, y);
        }
    }

    /**
     * Act - do whatever the Visualizer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {

    }    
}
