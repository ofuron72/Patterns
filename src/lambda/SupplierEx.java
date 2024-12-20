package lambda;

import java.util.ArrayList;
import java.util.function.Supplier;

//Supplier содержит метод T get();
public class SupplierEx {
    public ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {

        ArrayList<Car>  list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(carSupplier.get());

        }
        return list;
    }
    SupplierEx supplierEx = new SupplierEx();

    public static void main(String[] args) {
        SupplierEx supplierEx = new SupplierEx();
        ArrayList<Car> ourCars = supplierEx.createThreeCars(()->new Car("Mercedes","blue", 1.6));
        //машина которая создается на ходу

        
    }

}
