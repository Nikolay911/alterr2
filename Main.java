package com.alterr;

public class Main {


    public static void main(String[] args) {

        //-----------------------------TEST MYCOMPLEX----------------------------------------
        System.out.println("-----------------------------TEST MYCOMPLEX----------------------------------------");

	    MyComplex c1 = new MyComplex(1,1);
        MyComplex c2 = new MyComplex(1,1);

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(1,2));

        System.out.println(c1.addNew(c2));
        System.out.println(c1);
        c1.conjugate();
        System.out.println(c1);





        //-----------------------------TEST BALL AND CONTAINER----------------------------------------
        System.out.println("-----------------------------TEST BALL AND CONTAINER----------------------------------------");

        Ball ball = new Ball(5,5,1,1, -150);

        System.out.println(ball.toString());

        Container container = new Container(0,0,10,10);

        if(container.collides(ball)==true){
            System.out.println("мячик на месте!");
                for(int i=0;i<=20;i++){

                        ball.move();
                        if(container.getX1()>= ball.getX()) {
                            ball.setX(container.getX1());
                            ball.reflectHorizontal();
                        }
                        else if(container.getWidth()<= ball.getX()){
                            ball.setX(container.getWidth());
                            ball.reflectHorizontal();
                        }
                        else if(container.getY1()>= ball.getY()) {
                            ball.setY(container.getY1());
                            ball.reflectVertical();
                        }
                        else if(container.getHeight()<= ball.getY()){
                            ball.setY(container.getHeight());
                            ball.reflectVertical();
                        }
                    System.out.println(ball.toString());


                }
        }
        else
            System.out.println("мячик улетел!");

        //-----------------------------TEST MYPOLYNOMIAL----------------------------------------
        System.out.println("-----------------------------TEST MYPOLYNOMIAL----------------------------------------");

        double[] a = {2,3};
        double[] b = {1,4};
        MyPolynomial myPolynomial1 = new MyPolynomial(a);
        System.out.println(myPolynomial1.getDegree());
        System.out.println(myPolynomial1.toString());

        MyPolynomial myPolynomial2 = new MyPolynomial(b);
        System.out.println(myPolynomial2.toString());

        System.out.println(myPolynomial1.add(myPolynomial2).toString());
        System.out.println(myPolynomial1.multiply(myPolynomial2).toString());

    }
}
