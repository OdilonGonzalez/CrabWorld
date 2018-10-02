import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends greenfoot.World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    

        super(560, 560, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,260,232);
        Worm worm = new Worm();
        addObject(worm,418,65);
        Worm worm2 = new Worm();
        addObject(worm2,448,230);
        Worm worm3 = new Worm();
        addObject(worm3,441,323);
        Worm worm4 = new Worm();
        addObject(worm4,339,418);
        Worm worm5 = new Worm();
        addObject(worm5,162,390);
        Worm worm6 = new Worm();
        addObject(worm6,82,227);
        Worm worm7 = new Worm();
        addObject(worm7,109,87);
        Worm worm8 = new Worm();
        addObject(worm8,234,79);
        Worm worm9 = new Worm();
        addObject(worm9,495,489);
        Worm worm10 = new Worm();
        addObject(worm10,103,491);
        Worm worm11 = new Worm();
        addObject(worm11,221,512);
        Worm worm12 = new Worm();
        addObject(worm12,46,344);
        Lobster lobster = new Lobster();
        addObject(lobster,424,423);
    }
}
