package Generics;

public class ParamterizedClass {
    /*
    * Type Erasure - затирание типов, чтобы сохранить обратную совместимость (backward compatibility)
    * с версиями когда не было generics
    *
    *
    * */
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Cat");
        System.out.println(info1);
        Info<Integer> info2 = new Info<>(12);
        System.out.println(info2);
    }

}
