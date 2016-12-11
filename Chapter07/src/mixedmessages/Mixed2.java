/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mixedmessages;

/**
 * @author thanhtung
 * @date Dec 11, 2016
 */

class A {
    int ivar = 7;
    void m1() {
        System.out.print("A's m1, ");
    }
    void m2() {
        System.out.print("A's m2, ");
    }
    void m3() {
        System.out.print("A's m3, ");
    }
}

class B extends A {
    void m1() {
        System.out.print("B's m1, ");
    }
}

class C extends B {
    void m3() {
        System.out.print("C's m3, " +  (ivar + 6));
    }
}
public class Mixed2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        
        a2.m1();
        a2.m2();
        a2.m3();
    }

}
