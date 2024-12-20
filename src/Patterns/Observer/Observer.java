package Patterns.Observer;

public interface Observer {
    /*
    Интерфейс Observer реализуется всеми наблюдателями, таким образом
    все наблюдатели должны реализовать метод update
     */
    void update(float temp, float humidity, float pressure); //данные, передаваемые наблюдателям
    //при изменении состояния субъекта
}
