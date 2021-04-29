/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUANLenovo
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;
    
    
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver (this);
}
    
    public void update(float temp, float humidity, float pressure) {
        this.temperature= temperature;
        this.humidity = humidity;
        this.pressure=pressure;
        display();
    }

   
    public void display() {
        System.out.println ("Current conditions: "+temperature + 
                         "F degrees," + humidity + "% humidity, and "+
                          pressure+ "pressure" );
    }

}
