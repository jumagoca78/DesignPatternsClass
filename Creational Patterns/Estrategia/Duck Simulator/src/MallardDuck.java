/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanManuel
 */

//Clase concreta de la clase abstract Duck
public class MallardDuck extends Duck {
    
    public MallardDuck(){
        quackbehavior = new Quack();
        flybehavior = new Fly();
    }
    
    @Override
    public void display(){
        System.out.println("I'm a Mallard Duck");
    }

    
    
}
