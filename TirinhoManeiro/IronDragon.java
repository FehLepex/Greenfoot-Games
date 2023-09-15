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
    int quantidadeMoscasMortas = 0;
    int balas = 500;
    public void act()
    {
        //move(3);
        getWorld().showText("Balas: "+ balas, 100, 20);
        if(isTouching(GiantBugs.class)){
            Greenfoot.stop();
        }
        getWorld().showText("Pontos" + quantidadeMoscasMortas, 400,20);
        if(quantidadeMoscasMortas == 12) {
            getWorld().showText("You Win",300,200);
            Greenfoot.stop();
        }
        if(Greenfoot.isKeyDown("D")){
            setLocation(getX()+3,getY());
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("A")){
            setLocation(getX()-3,getY());
            setRotation(180);
        }
        if(Greenfoot.isKeyDown("W")){
            setLocation(getX(),getY()-3);
            setRotation(270);
        }
        if(Greenfoot.isKeyDown("S")){
            setLocation(getX(),getY()+3);
            setRotation(90);
        }
        int botaoMouseClicado = 0;
        MouseInfo m = Greenfoot.getMouseInfo();
        if(m !=null) {
            botaoMouseClicado = m.getButton();
        }
        if(botaoMouseClicado == 1 && balas >0) {
            Tirinho t = new Tirinho();
            t.setRotation(getRotation());
            getWorld().addObject(t, getX(),getY());
            balas--;
        }   
    }
}
