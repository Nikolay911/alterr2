package com.alterr;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height){
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y + height;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getWidth(){
        return x2;
    }

    public int getHeight(){
        return y2;
    }

    public boolean collides(Ball ball){

        float a = ball.getX() + ball.getRadius();
        float b = ball.getX() - ball.getRadius();
        float c = ball.getY() + ball.getRadius();
        float d = ball.getY() - ball.getRadius();

        if(x1 <= b && x2 >= a && y1 <= d && y2>=c)
            return true;
        else
            return false;
    }

    /*public boolean timetorevers(Ball ball){
        float a = ball.getX() + ball.getRadius();
        float b = ball.getX() - ball.getRadius();
        float c = ball.getY() + ball.getRadius();
        float d = ball.getY() - ball.getRadius();

        if(x1 >= b || x2 <= a ){
            ball.reflectHorizontal();
        }
        else if( y1 >= d || y2<=c){
            ball.reflectVertical();
        }
        else
            return false;

        return true;
    }*/

    @Override
    public String toString() {
        return "Container{" +
                "( " + x1 +
                ", " + y1 +
                "), (" + x2 +
                ", " + y2 +
                ") }";
    }
}
