/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanManuel
 */
public abstract class Duck {
    
    //es el atributo que nos permite llamar a las clases concretas de la interfaz Quack
    QuackBehavior quackbehavior;
    FlyBehavior flybehavior;
    public void swimm (){
        System.out.println("I{m swimming");
    }
    
    public void showDuck(){
        display();
        quackbehavior.quack();
        flybehavior.fly();
        swimm();
        
    }
    
    public void setQuackBehavior (QuackBehavior qb){
        quackbehavior = qb;
    }
    
    public void setFlyBehavior (FlyBehavior fb){
        flybehavior = fb;
    }
    
    
    public abstract void display();
}
