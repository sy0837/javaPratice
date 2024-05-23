public enum TryEnum implements  ToLower {
    MONDAY(1, "Mon"),
    TUESDAY(2, "Tues");

    final int a;
    final String b;
    TryEnum(int a, String b){
        this.a= a;
        this.b= b;
    }


    @Override
    public String toLower() {
        return this.name().toLowerCase();
    }
}
