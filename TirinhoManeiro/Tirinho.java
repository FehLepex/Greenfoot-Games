import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tirinho here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tirinho extends Actor
{
    /**
     * Act - do whatever the tirinho wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        move(8);
        if (isTouching(GiantBugs.class)) {
            removeTouching(GiantBugs.class);
            getWorld().removeObject(this);
        }else {
        if (isAtEdge()){
        getWorld().removeObject(this);
        }
    }
    }
}


