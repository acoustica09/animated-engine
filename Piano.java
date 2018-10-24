import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: Marlene Inoue
 * @version: 1.0, 6 October 2018
 */
public class Piano extends World {
    public static final int SCREEN_HEIGHT = 340;
    private String[] whiteKeys =
        {"a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "\\",};
    private String[] whiteNotes =
        {"2c", "2d", "2e", "2f", "2g", "2a", "2b", "3c", "3d", "3e", "3f", "3g",};
    private String[] blackKeys =
        { "w", "e", "", "t", "y", "u", "", "o", "p", "", "]" }; 
    private String[] blackNotes =
        { "3c#", "3d#", "", "3f#", "3g#", "3a#", "", "4c#", "4d#", "", "4f#" };
    private Visualizer screen = new Visualizer();
    private Color[] whiteKeyColors = {
            new Color(230, 101, 166, 128),
            new Color(198, 227, 171, 128),
            new Color(146, 223, 227, 128),
            new Color(229, 156, 215, 128),
            new Color(51, 255, 0, 128),
            new Color(243, 7, 26, 128),
            new Color(152, 0, 45, 128),
            new Color(93, 28, 210, 128),
            new Color(98, 94, 38, 128),
            new Color(0, 207, 6, 128),
            new Color(183, 146, 29, 128),
            new Color(102, 255, 153, 128)};

    /**
     * Make the piano.
     */
    public Piano() {
        super(800, 340 + SCREEN_HEIGHT, 1);
        makeKeys();
        showText("Click 'Run', then use your keyboard to play", 400, 320 + SCREEN_HEIGHT);
        addObject(screen, getWidth() / 2, screen.getImage().getHeight() / 2);
    }

    /**
     * Create and place white and black piano keys
     */
    public void makeKeys() {
        //white keys
        for (int i = 0; i < whiteKeys.length; i++) {
            Key key = new Key(whiteKeys[i], whiteNotes[i] + ".wav",
                    "white-key.png", "white-key-down.png");
            key.setVisualizer(screen);
            key.setColor(Color.RED);
            addObject(key, (i * 63) + 54, 140 + SCREEN_HEIGHT);
            key.setColor(whiteKeyColors[i]);
            //System.out.println(whiteKeys[i] + "|" +  whiteNotes[i]+".wav" + "|" +  "white-key.png" + "|" +  "white-key-down.png");
        }

        //black keys
        for (int i = 0; i < blackKeys.length; i++) {
            if (!blackKeys[i].equals("")) {
                Key key = new Key(blackKeys[i], blackNotes[i] + ".wav",
                        "black-key.png", "black-key-down.png");
                key.setVisualizer(screen);
                key.setColor(Color.RED);
                addObject(key, (i * 63) + 85, 86 + SCREEN_HEIGHT);
                int red = Greenfoot.getRandomNumber(200) + 55;
                int green = Greenfoot.getRandomNumber(200) + 55;
                int blue = Greenfoot.getRandomNumber(200) + 55;
                key.setColor(new Color(red, green, blue, 128));
                //System.out.println(blackKeys[i] + "|" +  blackNotes[i]+".wav" + "|" +  "black-key.png" + "|" +  "black-key-down.png");
            }
        }
    }

}