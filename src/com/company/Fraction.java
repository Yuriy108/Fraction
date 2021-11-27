package com.company;

public class Fraction {
    int num;
    int den;

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }
    void sum(Fraction b){
        num=num*b.den+den*b.num;
        den=den*b.den;

    }
    void minus(Fraction b){
        num=num*b.den-den*b.num;
        den=den*b.den;

    }
    void print(){
        System.out.println(this.num+"/"+this.den);
    }

}
