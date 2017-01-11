/**
 * Created by xinrui on 08/01/17.
 */
public interface Formula {
    double calculate(int a);


    default double sqrt(int a) {
        return Math.sqrt(a);
    }

    default void display(int a) {
        System.out.println(a);
    }
}
