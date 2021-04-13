/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanManuel
 */
public class DuckTest {
    
    public static void main (String args []){
        Duck duck1, duck2, duck3, duck4;
        
        duck1 = new RedheadDuck();
        duck2 = new MallardDuck();
        duck3 = new RubberDuck();
        duck4 = new DecoyDuck();
       
        
        duck1.showDuck();
        //duck2.showDuck();
        //duck3.showDuck();
        //duck4.showDuck();
        
        duck3.setFlyBehavior(new FlyNoWay());
        //duck3.showDuck();
        
    }
    
}
