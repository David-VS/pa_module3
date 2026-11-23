package data;

public class Calculator {

    private int x;
    private int y;

    public Calculator(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int sum (){
        return this.x + this.y;
    }

}
