import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends Actor
{   int quantidadeBolaCapturada = 0;
    /**
     * Act - do whatever the Home wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {     getWorld().showText("Pontos" + quantidadeBolaCapturada, 200,20);
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
        if(isTouching(Bola.class)){
            removeTouching(Bola.class);
            quantidadeBolaCapturada = quantidadeBolaCapturada + 1;
        }
            getWorld().showText("Pontos" + quantidadeBolaCapturada, 200,20);
            if(quantidadeBolaCapturada == 6) {
            getWorld().showText("YOU WIN",300,200);
            Greenfoot.stop();
        }
}}