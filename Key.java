import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: Marlene Inoue
 * @version: 1.2, 8 October 2018
 */
public class Key extends Actor {
    private boolean isDown;
    private String key;
    private String sound;
    private String keyUp;
    private String keyDown;
    private Visualizer screen;
    private Color keyColor;

    /**
     * Default constructor
     */
    public Key() {
        key = "A";
        sound = "3c.wav";
        keyUp = "white-key.png";
        keyDown = "white-key-down.png";
        setImage(keyUp);
        isDown = false;
    }

    /**
     * 
     */
    public Key(String newKey) {
        key = newKey;
        sound = "3c.wav";
        keyUp = "white-key.png";
        keyDown = "white-key-down.png";
        setImage(keyUp);
        isDown = false;
        int red = Greenfoot.getRandomNumber(200) + 55;
        int green = Greenfoot.getRandomNumber(200) + 55;
        int blue = Greenfoot.getRandomNumber(200) + 55;
        keyColor = new Color(red, green, blue, 100);
    }

    /**
     * Create a new key.
     */
    public Key(String keyName, String soundFile, String upImage, String downImage) {
        this.key = keyName;
        this.sound = soundFile;
        this.keyUp = upImage;
        this.keyDown = downImage;
        isDown = false;
        setImage(upImage);
    }

    /**
     * Sets a new Visualizer to use.
     *
     * @param visualizer The new Visualizer to use.
     */
    public void setVisualizer(Visualizer visualizer) {
        screen = visualizer;
    }

    public Color getColor() {
        return keyColor;
    }
    
    public void setColor(Color newColor) {
        keyColor = newColor;
    }
    
    /**
     * Play the note of this key.
     */
    public void play() {
        Greenfoot.playSound(sound);

        if (screen != null) {
            screen.visualize(this);
        }
    }

    /**
     * Do the action for this key.
     */
    public void act() {
        if (!isDown && Greenfoot.isKeyDown(key)) {
            play();
            setImage(keyDown);
            isDown = true;
        }
        if (isDown && !Greenfoot.isKeyDown(key)) {
            setImage(keyUp);
            isDown = false;
        }
        if (Greenfoot.mousePressed(this)) {
            play();
            setImage(keyDown);
        }
        if (Greenfoot.mouseClicked(null)) {
            setImage(keyUp);
        }
    }

}