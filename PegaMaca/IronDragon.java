import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class irondragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IronDragon extends Actor
{

    public IronDragon() {
        GreenfootImage gi = new GreenfootImage("airplane.png");
        gi.scale(50, 50);
        setImage(gi);
    }
    /**
     * Act - do whatever the irondragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int quantidadeMacasCapturadas = 0;
    public void act()
    {
        //move(3);
        getWorld().showText("x" + getX(), 300,200);
        getWorld().showText("y" + getY(), 300,160);
        if(isTouching(Life.class)){
            removeTouching(Life.class);
            quantidadeMacasCapturadas++;
        }
        getWorld().showText("Pontos" + quantidadeMacasCapturadas, 200,20);
        if(quantidadeMacasCapturadas == 15) {
            getWorld().showText("You Win",300,200);
            Greenfoot.stop();
        }
        if(Greenfoot.isKeyDown("D")){
            setLocation(getX()+1,getY());
        }
        if(Greenfoot.isKeyDown("A")){
            setLocation(getX()-1,getY());
        }
        if(Greenfoot.isKeyDown("W")){
            setLocation(getX(),getY()-1);
        }
        if(Greenfoot.isKeyDown("S")){
            setLocation(getX(),getY()+1);
        }
    }
}
