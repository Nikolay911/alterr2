package com.alterr;


public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex(){

    }
    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + "+" + imag + "i)";
    }

    public  boolean isReal(){
        if(real!=0)
            return true;
        else
            return false;
    }

    public  boolean isImaginary(){
        if(imag!=0)
            return true;
        else
            return false;
    }

    public boolean equals(MyComplex another) {
        if (this.real == another.getReal() && this.imag == another.getImag()) return true;
        else
            return false;
    }


    public boolean equals(double real, double imag){
        if (this.real == real && this.imag == imag) return true;
        else
            return false;
    }

    public double magnitude(){
        return Math.sqrt(real*real+imag*imag);
    }

    public double argument(){
        return imag/real;
    }

    public MyComplex add(MyComplex right){
        real = real + right.getReal();
        imag = imag + right.getImag();
        return this;
    }

    public MyComplex substract(MyComplex right){
        real = real - right.getReal();
        imag = imag - right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right){
        MyComplex one = new MyComplex(this.real + right.getReal(), this.imag + right.getImag());
        return one;
    }


    public MyComplex substractNew(MyComplex right){
        MyComplex one = new MyComplex(this.real - right.getReal(), this.imag - right.getImag());
        return one;
    }

    public MyComplex multiply(MyComplex right){
        real = real * right.getReal() - imag * right.getImag();
        imag = real * right.getImag() + imag * right.getReal();
        return this;
    }


    public MyComplex divide(MyComplex right){
        real = (real * right.getReal() + imag * right.getImag())/(Math.pow(right.getReal(),2)+Math.pow(right.getImag(),2));
        imag = (right.getReal()*imag-real*right.getImag())/(Math.pow(right.getReal(),2)+Math.pow(right.getImag(),2));
        return this;
    }

    public MyComplex conjugate(){
        imag=-imag;
        return this;
    }
}




