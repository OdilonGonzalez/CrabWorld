import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends greenfoot.World
{
    private Crab crab;
    private Lobster lobster;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    

        super(560, 560, 1);
        crab = new Crab();
        addObject(crab,260,232);
        
        lobster = new Lobster();
        addObject(lobster,100, 100);
        prepare(10);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(int numWorm)
    {
        
        for(int i = 0; i < numWorm; i++)
        {
            Worm worm = new Worm();
            int x = Greenfoot.getRandomNumber(520);
            int y = Greenfoot.getRandomNumber(520);
            addObject(worm, x, y);
        }
    }
}
