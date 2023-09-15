import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class People here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class People extends Actor
{
    int quantidadeMacasCapturadas = 0;
    public void act()
    {
            if(isTouching(Life.class)){
            removeTouching(Life.class);
            quantidadeMacasCapturadas++;
        }
            getWorld().showText("Pontos" + quantidadeMacasCapturadas, 200,20);
            if(quantidadeMacasCapturadas == 6) {
            getWorld().showText("YOU WIN",300,200);
            Greenfoot.stop();
        }
            if(Greenfoot.isKeyDown("D")){
            setRotation(0);
            move(4);
        }
          if(Greenfoot.isKeyDown("A")){
            setRotation(180);
            move(4);
        }
          if(Greenfoot.isKeyDown("W")){
            setRotation(270);
            move(4);
        }
          if(Greenfoot.isKeyDown("S")){
            setRotation(90);
            move(4);
        }
    }
}
