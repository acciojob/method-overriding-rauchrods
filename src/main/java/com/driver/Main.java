package com.driver;

public class Main {
    class  A{
        String meth(){
            return "Invoking method from class A";
        }
    }
    class  B extends A{
        String meth(){
            return "Method is overridden in Extendend class B";
        }
    }

    public void main(String[] args) {

        B bobj = new B();
        bobj.meth();
    }
}