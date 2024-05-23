public interface ParentFunctional {
    default void running(){
        return;
    }
    static void doNothing(){
        return;
    }
}
