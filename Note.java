import greenfoot.*;
import java.util.List;
public class Note extends Actor
{
    private int life = 40;
    private int wag = 5;
    private int duration;
    private int len;
    public Note(){
        this(Greenfoot.getRandomNumber(2),Greenfoot.getRandomNumber(2)+1);
    }
    public Note(int _duration,int _len){
        duration = _duration;
        len = _len;
        int R = Greenfoot.getRandomNumber(255);
        int B = Greenfoot.getRandomNumber(255);
        int G = Greenfoot.getRandomNumber(255);
        Color color = new Color(R,G,B);
        drawNote(color,duration);
    }
    public void act(){
        List<Note> notes = getWorld().getObjects(Note.class);
        for(Note note : notes){
            if(note != null)
                note.wiggle();
        }
        life--;
        if(life <= 0)
            getWorld().removeObject(this);
    }
    public void drawNote(Color _color,int _duration){
        GreenfootImage image = new GreenfootImage(50 * len,50);
        image.setColor(_color);
        switch(duration){
            case 0:
                int[] xs1 = {0,34,34,44,44,29,29,10,10,20,20, 5, 5};
                int[] ys1 = {0, 0,34,34,44,44, 5, 5,34,34,44,44, 5};
                int[] x = new int[xs1.length];
                int[] y = new int[xs1.length];
                for(int j = 0; j < len; j++){
                    for(int i = 0; i < xs1.length; i++){
                        x[i] = xs1[i] + (50 * j);
                        y[i] = ys1[i];
                    }
                    image.drawPolygon(x,y,xs1.length);
                }
            break;
            case 1:
                int[] xs2 = {0,34,34,44,44,29,29,10,10,20,20, 5, 5};
                int[] ys2 = {0, 0,34,34,44,44, 5, 5,34,34,44,44, 5};
                int[] x2 = new int[xs2.length];
                int[] y2 = new int[xs2.length];
                for(int j = 0; j < len; j++){
                    for(int i = 0; i < xs2.length; i++){
                        x2[i] = xs2[i] + (50 * j);
                        y2[i] = ys2[i];
                    }
                    image.fillPolygon(x2,y2,xs2.length);
                }
            break;
        }
        int range = 15; //Should be in the range 0-255.
        Color transparent = new Color(0, 0, 0, 0);
        for(int x = 0; x < 50; x++){
            for(int y = 0; y < 50; y++){
                Color color = image.getColorAt(x, y);
                if(color.getRed()   > 255 - range
                && color.getGreen() > 255 - range
                && color.getBlue()  > 255 - range)
                    image.setColorAt(x, y, transparent);
            }
        }
        setImage(image);
    }
    public void wiggle(){
        wag = -wag;
        setLocation(getX() + wag,getY());
        turn(-wag/2);
    }
}
