import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Poder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poder extends Actor
{
    /**
     * Act - do whatever the Poder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        if(isTouching(Meteorio.class)) {
            removeTouching(Meteorio.class);
            getWorld().removeObject(this);
        } else {
            if(isAtEdge()) {
                getWorld().removeObject(this);
            }
        }
    }
}