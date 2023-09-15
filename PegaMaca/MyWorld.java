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
        String nicknamePlayer = Greenfoot.ask ("Digite o seu apelido");
        showText("Nick:Lepex",70,30);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        People people = new People();
        addObject(people,294,215);
        people.setLocation(294,215);
        People people2 = new People();
        addObject(people2,294,215);
        people.setLocation(220,187);
        people.setLocation(298,205);
        people.setLocation(298,205);
        people.setLocation(298,205);
        people.setLocation(298,205);
        removeObject(people);
        people2.setLocation(282,192);
        Life life = new Life();
        addObject(life,552,31);
        Life life2 = new Life();
        addObject(life2,549,160);
        Life life3 = new Life();
        addObject(life3,554,290);
        Life life4 = new Life();
        addObject(life4,57,319);
        Life life5 = new Life();
        addObject(life5,64,188);
        Life life6 = new Life();
        addObject(life6,58,56);
        life3.setLocation(550,332);
        life2.setLocation(559,176);
        life.setLocation(556,52);
        IronDragon ironDragon = new IronDragon();
        addObject(ironDragon,143,137);
        people2.setLocation(292,189);
        removeObject(people2);
        life5.setLocation(381,126);
        life2.setLocation(483,207);
        life3.setLocation(524,345);
        life6.setLocation(359,339);
        life4.setLocation(122,301);
        life6.setLocation(276,282);
        life2.setLocation(489,240);
        life3.setLocation(437,358);
        ironDragon.setLocation(89,85);
        removeObject(life4);
        removeObject(life6);
        removeObject(life5);
        removeObject(life2);
        removeObject(life);
        Life life7 = new Life();
        addObject(life7,472,121);
        Life life8 = new Life();
        addObject(life8,373,204);
        Life life9 = new Life();
        addObject(life9,497,231);
        Life life10 = new Life();
        addObject(life10,335,308);
        Life life11 = new Life();
        addObject(life11,250,221);
        Life life12 = new Life();
        addObject(life12,215,319);
        Life life13 = new Life();
        addObject(life13,71,323);
        Life life14 = new Life();
        addObject(life14,120,222);
        Life life15 = new Life();
        addObject(life15,231,117);
        Life life16 = new Life();
        addObject(life16,174,40);
        Life life17 = new Life();
        addObject(life17,282,45);
        Life life18 = new Life();
        addObject(life18,354,108);
        Life life19 = new Life();
        addObject(life19,429,46);
        Life life20 = new Life();
        addObject(life20,553,146);
    }
}
