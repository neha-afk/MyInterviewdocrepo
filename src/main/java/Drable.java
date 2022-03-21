import java.util.StringJoiner;

@FunctionalInterface
public interface Drable {
    public default void add1(){
        StringJoiner joins = new StringJoiner(",");
        joins.add("neha");
        joins.add("ravi");

        System.out.println(joins);


    }
     void add();

}
