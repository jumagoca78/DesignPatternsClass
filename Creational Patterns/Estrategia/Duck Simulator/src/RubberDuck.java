/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanManuel
 */
public class RubberDuck extends Duck {

    public RubberDuck(){
        quackbehavior = new Squeeze();
        flybehavior = new FlyRocketPowered();
    }
    
    
    @Override
    public void display() {
        System.out.println ("I'm rubber duck");
    }
}
