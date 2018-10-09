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
    private GreenfootSound musica;
    private Counter vida;
    private Tiempo tiempo;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    

        super(560, 560, 1);
        crab = new Crab();
        addObject(crab,260,232);
        
        tiempo = new Tiempo();
        tiempo.addedToWorld(this);
        
        lobster = new Lobster();
        addObject(lobster,100, 100);
        
        vida = new Counter("Vidas: ");
        addObject(vida , 50, 45);
        vida.setValue(3);
        
        musica = new GreenfootSound("ufo-t-balt.mp3");
        
        prepare(10);
    }
    
    public void started()
    {
        //Greenfoot.playSound("ufo-balt.mp3");
        musica.playLoop();
    }
    
    public void stopped()
    {
        musica.stop();
    }
    
    public Lobster accedeLangosta()
    {
        return lobster;
    }
    
    public void restarVida()
    {
        vida.setValue(vida.getValue() -1);
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
