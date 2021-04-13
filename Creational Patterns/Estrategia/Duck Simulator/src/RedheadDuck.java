/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanManuel
 */
public class RedheadDuck  extends Duck{

    public RedheadDuck (){
        quackbehavior = new Quack();
        flybehavior = new Fly();
    }

   
    @Override
    public void display() {
        System.out.println ("I'm redhead duck");
    }
    
    @Override
    public void swimm(){
        System.out.println ("glu glu glu");
    } 
}
