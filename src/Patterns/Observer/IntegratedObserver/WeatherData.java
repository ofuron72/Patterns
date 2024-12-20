package Patterns.Observer.IntegratedObserver;

import Patterns.Observer.Observer;
import Patterns.Observer.Subject;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {  //observer

    /*
    WeatherData расширяет Observable
     */

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData() {
    }//теперь структура для хранения наблюдателей не нужна

    public void measurementsChanged(){
        setChanged();//перед вызовом  notify необходимо вызвать setChanged()
        notifyObservers(); //Объект данных не передается значит мы используем модель ЗАПРОСА ДАННЫХ
    }

    public float getTemperature() { //getter ы будут использоваться наблюдателями для получения состояния объекта weather data
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }


    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }




}
