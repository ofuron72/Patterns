package Patterns.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    /*элемент реализует Observer,
    чтобы получать данные от объекта weatherData
     */

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){  //Конструктору передается объект weatherData, который
        this.weatherData = weatherData;                     //используется для регистрации элемента в качестве наблюдателя
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+ temperature+"F degrees and "+ humidity + "%");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity=humidity;
        display();

    }
}
