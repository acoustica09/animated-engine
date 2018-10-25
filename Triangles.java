import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * 
 * @author Camille Otillio
 * @version 10/24/18
 */
public class Triangles extends Actor{
    private Color teal = new Color (40, 234, 209);
    private Color skyBlue = new Color (40, 168, 234);
    private Color limeGreen = new Color (108, 191, 10);
    private Color cobalt = new Color (50, 58, 231);
    private Color violet = new Color (130, 75, 221);
    
    private Color orange = new Color (234, 140, 18);
    private Color scarlet = new Color (228, 45, 45);
    private Color mustard = new Color (239, 186, 26);
    
    private Color[] coolColors = {teal, skyBlue, limeGreen, violet, cobalt};
    private Color[] warmColors = {orange, scarlet, mustard};
    private Color[] allColors = {scarlet, orange, mustard, limeGreen, teal, skyBlue, cobalt, violet};
    
    private Color Colores = allColors[Greenfoot.getRandomNumber(8)];
    private Color CooColor = coolColors[Greenfoot.getRandomNumber(5)];
    private Color WarmyColor = warmColors[Greenfoot.getRandomNumber(3)];
        
    private int[] xs = { 50, 75, 100 };
    private int[] ys = { 100,50,100 };
    //private int width, height;    
    private GreenfootImage img = new GreenfootImage(200,200);
        
    public Triangles(){
        this(50, 50);
    }

    /**
     * 
     */
    public Triangles(int width, int height) {
        
        img.setColor(Colores);
        
        img.fillPolygon(xs, ys, 3);
        setImage(img);
        
    }

    public void act() {
        moveUp();
        bPress();
        //changeColor();
        
        int alpha = getImage().getTransparency();
        if (alpha > 2) {
            getImage().setTransparency(alpha - 2);
        }
        else {
            getWorld().removeObject(this);
        }
        
    }
    public void moveUp(){
       
        setLocation(getX(), getY() - 2);
        if (getY() <= 12){
        setLocation(getX(), getY());
        } 
  }
  private void bPress()
    {
        if (Greenfoot.isKeyDown("b")) 
        {
            World world = getWorld();
            List<Triangles> triAng = world.getObjects(Triangles.class);
            
            for(Triangles triangles: triAng)
            {
                turn(-1);
                //colorSetter();
            }
        }
    }
    // private void colorSetter()
    // {
    //     if (img.getColorAt(getX(), getY()).equals(teal)) 
    //     {
    //         img.setColor(WarmyColor);
    //     }
    //     else {
    //         img.setColor(CooColor);
    //     }
    // }
    
}
