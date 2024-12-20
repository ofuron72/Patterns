package Patterns.Observer.IntegratedObserver;

import Patterns.Observer.DisplayElement;
import Patterns.Observer.Subject;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement { //Реализуем интерфейс observer

    Observable observable; //это класс!
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
        /*
        Объект элемента текущего состояния добавляется в качестве наблюдателя
         */
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+ temperature+"F degrees and "+ humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        /*
        Обновленный метод update() получает observable и необязательные данные

        В update мы сначала проверяем, что субъект относиться к типу WeatherData, затем
        используем его get методы для получения температуры и влажности, после чего вызываем display
         */
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
