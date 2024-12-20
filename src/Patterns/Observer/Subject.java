package Patterns.Observer;

public interface Subject {
     void registerObserver(Observer o);

     void removeObserver(Observer o);
     // Оба метода получают в аргументе реализацию Observer (регистрируемый или исключаемый наблюдатель)

     void notifyObservers();
     //Этот метод вызывается для оповещения наблюдателей об изменении состояния субъекта
}
