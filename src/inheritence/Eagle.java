package inheritence;

public class Eagle implements Bird{


    @Override
    public boolean canBreath() {
        System.out.println("Eagle");
        return false;
    }

    @Override
    public String learn() {
        return "";
    }

    @Override
    public boolean checkTerm(){
        System.out.println("checkTerm");
        return false;
    }

    @Override
    public long enhance() {
        return 0;
    }
}
