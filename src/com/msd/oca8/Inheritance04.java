package com.msd.oca8;

public class Inheritance04 {
    public static void main(String[] args) {
        D d = new D();
        D1 d1 = new D1();
        D2 d2 = new D2();

        d = d1;  // Valid - child can be assigned to a parent
        //d1 = d;  // Invalid - parent cannot be assigned to child, without a cast to skip compiler error
        d2 = (D2) d; // valid , requires a cast, compiles ok, but could be a runtime ClassCastException
        //d1 = d2;  // Invalid, D1 and D2 do not share a is-a relationship
        //d1 = (D1) d2; // Still invalid, cast won't help here. Compiler knows, D2 cannot be cast to D1

    }
}

class D {

}

class D1 extends D {

}

class D2 extends D {

}
