import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    private int vida;
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
        move(4);
        if(Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("eating.wav");
        }
        if(isTouching(Lobster.class))
        {
            Label perdiste;
            setLocation(250, 500);
            //getWorld().showText("Perdiste una vida", 200, 200);
            
            getWorldOfType(CrabWorld.class).accedeLangosta().setLocation(250,500);
        }
        
        
    }
    
    
}
