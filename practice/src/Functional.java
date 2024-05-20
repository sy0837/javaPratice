@FunctionalInterface
public interface Functional {
    void run();
    default int check(int s){
        if(s== 2)
            return 0;
        return 1;
    }
}
