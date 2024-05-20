public final class TestingImmutable extends ThreadBuffer {
    private final int s= 0;

    public int getS(){
        return s;
    }
    public int checkS(int b){
        if(b == s)
            return 1;
        return -1;
    }



    @Override
    void getValue(){

        System.out.println("I am running");
        System.out.println(Thread.currentThread().getName());
            System.out.println("Value consumed:");
    }
}
