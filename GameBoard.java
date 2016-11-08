import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameBoard extends World
{
    private static final int WORLD_WIDTH = 1200;
    private static final int WORLD_HEIGHT = 800;
    private Player player;
    private Creature creature;
    /**
     * Constructor for objects of class GameBoard.
     */
    public GameBoard()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(WORLD_WIDTH, WORLD_HEIGHT, 1, true);
        //
        // Load default settings.
        init();
        
    }
    
    /**
     * 
     */
    public void act()
    {
        /*
            this.showText(String.valueOf(player.getScore()), 15, 15);
            if (player.getHealth() == 0)
            {
                this.removeObject(player);
            }
        */
    }
    
    /**
     * Initializes the default settings for the GameBoard.
     */
    public void init()
    {
        player = new Player();
        player.getImage().rotate(player.getRotation() - 45); // Depends on image.
        this.addObject(player, WORLD_WIDTH/2, WORLD_HEIGHT/2);
    }
    
    public void startNextWave(int amount)
    {

    }
    
    /**
     * Return the player currently within the GameBoard
     */
    public Player getPlayer()
    {
        return player;
    }
}
