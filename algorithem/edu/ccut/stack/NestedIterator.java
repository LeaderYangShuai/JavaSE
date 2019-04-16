package edu.ccut.stack;

import java.util.*;

public class NestedIterator{
    Stack<NestedInteger> stack;
    
    NestedIterator(Vector<NestedInteger> vector) {
        for (int i = vector.size() - 1; i >= 0; --i) {
            stack.push(vector.get(i));
        }
    }

    int next() {
        NestedInteger nestedInteger = stack.pop(); stack.pop();
        return nestedInteger.getInteger();
    }

    boolean hasNext() {
        while (!stack.empty()) {
            NestedInteger nestedInteger = stack.pop();
            if (nestedInteger.isInteger()) return true;
            stack.pop();
            for (int i = nestedInteger.getList().size() - 1; i >= 0; --i) {
                stack.push(nestedInteger.getList().get(i));
            }
        }
        return false;
    }


}