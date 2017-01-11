import java.util.Arrays;

/**
 * Created by xinrui on 08/01/17.
 */
public class TestDefaultInterface {
    public static void main(String args[]){
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };


        System.out.println(formula.calculate(100)); // 100.0
        System.out.println(formula.sqrt(16));
        formula.display(150);
        System.out.println("================functional interface ============");
        //FInterface fint = (a,b) -> a+b;
        //System.out.println(fint.add(1,2));
        TEntity te = new TEntity();
        Arrays.asList(1,2,3).forEach(TEntity::inc);
        Arrays.asList(1,2,3).forEach(System.out::print);
        System.out.println("================Test ============");
        Arrays.asList(1,2,3).forEach((a)->System.out.println(a+1));


    }
}
