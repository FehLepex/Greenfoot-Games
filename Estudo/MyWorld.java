import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Home home = new Home();
        addObject(home,289,182);
        Bola bola = new Bola();
        addObject(bola,552,45);
        Bola bola2 = new Bola();
        addObject(bola2,576,161);
        bola2.setLocation(542,182);
        bola2.setLocation(822,113);
        Bola bola3 = new Bola();
        addObject(bola3,553,338);
        Bola bola4 = new Bola();
        addObject(bola4,55,59);
        Bola bola5 = new Bola();
        addObject(bola5,57,205);
        Bola bola6 = new Bola();
        addObject(bola6,55,338);
        bola2.setLocation(555,194);
        bola2.setLocation(555,194);
        bola4.setLocation(46,139);
        bola5.setLocation(52,220);
        bola5.setLocation(52,220);
        bola.setLocation(557,131);
        bola2.setLocation(562,234);
        bola.setLocation(555,151);
        bola.setLocation(555,151);
        bola2.setLocation(550,241);
        bola5.setLocation(49,240);
        bola4.setLocation(57,166);
        bola5.setLocation(60,241);
    }
}
