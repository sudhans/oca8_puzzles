package com.msd.oca8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Generics01 {
}

class G1 {
    <T extends Number> List<T> getMarks(T marks) { // Base class method
        return new ArrayList<>();
    }
}

class G2 extends G1 {

    @Override
    List<Number> getMarks(Number marks) {  // Valid override
        return super.getMarks(marks);
    }

    <T> List<T> getMarks(T marks) { // Valid overload, as the bounds are different
        return new LinkedList<>();
    }
}
