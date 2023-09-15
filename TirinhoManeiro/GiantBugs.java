import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GiantBugs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GiantBugs extends Actor
{
    /**
     * Act - do whatever the GiantBugs wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        turn(Greenfoot.getRandomNumber(30));
    }
}
