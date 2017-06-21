class Base {
    protected int num;
    public Base() {
        num = 0;
    }
    public Base(int n) {
        num = n;
    }
    public void setNum(int n) {
        num = n;
    }
    public int getNum() {
        return num;
    }
    public void showNum() {
        System.out.printf("num: %d\n", num);
    }
}
