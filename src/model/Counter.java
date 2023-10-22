package model;

public class Counter {
    public Counter() {
        cnt = 0;
    }

    public int getCnt() {
        return cnt;
    }

    public void Add(){
        cnt++;
    }
    private int cnt;
}
