/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUANLenovo
 */
public interface Subject {
    public void registerObserver (Observer o);
    public void remove (Observer o);
    public void notifyObservers ();
}
