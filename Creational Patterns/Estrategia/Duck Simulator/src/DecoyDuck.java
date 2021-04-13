/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanManuel
 */
public class DecoyDuck extends Duck{
    
    public DecoyDuck  (){
        quackbehavior = new MuteQuack();
        flybehavior   = new FlyNoWay(); 
    }

    @Override
    public void display() {
        System.out.println ("I'm a decoy Duck");
    }
    
}
