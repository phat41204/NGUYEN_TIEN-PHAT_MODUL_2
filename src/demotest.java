import java.util.ArrayList;

public class demotest {
public static boolean findElement(int[] arr , int X) {
    ArrayList<Object> list = new ArrayList<>();
    for (int O : arr){
        list.add(O);
    }
    return list.contains(X);
}
}
