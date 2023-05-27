/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula14;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JCMB
 */
public class ProductNotifier {
    private List<IProductObserver> observers;

    public ProductNotifier() {
        observers = new ArrayList<>();
    }

    public void attachObserver(IProductObserver observer) {
        observers.add(observer);
    }

    public void detachObserver(IProductObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (IProductObserver observer : observers) {
            observer.update();
        }
    }
}