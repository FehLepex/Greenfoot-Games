import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Espaco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Espaco extends World
{

    /**
     * Constructor for objects of class Espaco.
     * 
     */
    public Espaco()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Foguete foguete = new Foguete();
        addObject(foguete,343,245);
        Meteorio meteorio = new Meteorio();
        addObject(meteorio,628,425);
        Meteorio meteorio2 = new Meteorio();
        addObject(meteorio2,638,50);
        Meteorio meteorio3 = new Meteorio();
        addObject(meteorio3,71,52);
        Meteorio meteorio4 = new Meteorio();
        addObject(meteorio4,64,428);
        Poder poder = new Poder();
        addObject(poder,538,276);
        foguete.setLocation(256,188);
    }
}
