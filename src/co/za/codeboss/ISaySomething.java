package co.za.codeboss;

public interface ISaySomething {
    default void say() {
        System.out.println("default implemented method");
    }
}
