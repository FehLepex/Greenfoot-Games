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
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        IronDragon ironDragon = new IronDragon();
        addObject(ironDragon,80,115);
        GiantBugs giantBugs = new GiantBugs();
        addObject(giantBugs,256,118);
        GiantBugs giantBugs2 = new GiantBugs();
        addObject(giantBugs2,127,229);
        GiantBugs giantBugs3 = new GiantBugs();
        addObject(giantBugs3,362,285);
        GiantBugs giantBugs4 = new GiantBugs();
        addObject(giantBugs4,297,407);
        GiantBugs giantBugs5 = new GiantBugs();
        addObject(giantBugs5,445,147);
        GiantBugs giantBugs6 = new GiantBugs();
        addObject(giantBugs6,525,241);
        GiantBugs giantBugs7 = new GiantBugs();
        addObject(giantBugs7,453,430);
        GiantBugs giantBugs8 = new GiantBugs();
        addObject(giantBugs8,584,513);
        GiantBugs giantBugs9 = new GiantBugs();
        addObject(giantBugs9,598,381);
        GiantBugs giantBugs10 = new GiantBugs();
        addObject(giantBugs10,697,189);
        GiantBugs giantBugs11 = new GiantBugs();
        addObject(giantBugs11,546,38);
        GiantBugs giantBugs12 = new GiantBugs();
        addObject(giantBugs12,701,320);
        giantBugs2.setLocation(226,265);
        giantBugs4.setLocation(325,504);
        giantBugs2.setLocation(261,382);
        giantBugs.setLocation(326,70);
        ironDragon.setLocation(92,123);
    }
}
