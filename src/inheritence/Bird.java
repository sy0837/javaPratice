package inheritence;

public interface Bird extends LivingThings {
    int a =0;
    boolean canBreath();
    String learn();

    public static boolean checker(){
        return runTo().equalsIgnoreCase("");
    }

    private static String runTo(){
        return "";
    }
}
