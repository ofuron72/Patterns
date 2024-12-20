package Generics;

import java.util.ArrayList;

public class GenMethod {
    public static <T> T getSecondElem(ArrayList<T> arrayList){ //<T> T означает return type
        return arrayList.get(1);
    }
}
