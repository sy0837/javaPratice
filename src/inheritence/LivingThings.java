package inheritence;

public interface LivingThings {
    default boolean canBreath(){
        System.out.println("Eagle");
        return true;
    }

    default boolean checkTerm(){
        System.out.println("Living Check Term");
        return false;
    }
    long enhance();
}
