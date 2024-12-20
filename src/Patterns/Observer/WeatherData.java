package Patterns.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) { //добавляем наблюдателей в список
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {//Если наблюдатель хочет отменить подписку, просто удаляем его из списка
        int i = observers.indexOf(o);
        if (i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() { //Оповещение наблюдателей об изменении состояния через метод update(), реализуемый
                                    // всеми наблюдателями
        for (int i = 0; i < observers.size();i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){ //изменение состояния
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
