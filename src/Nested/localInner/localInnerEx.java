package Nested.localInner;

public class localInnerEx {
    //локальный inner class, класс который находится внутри блока (метода), недоступен вне метода
    //они очень редки
    //local inner не может быть static,
    //может обращаться к private внешнего класса
    //Local inner класс может обращаться к элементам блока, в котором он написан при условии,
    //что они final или effectively final
    //effectively final это переменная котрая не обозначена final, но после инициализации которой, значение не меняется
}
