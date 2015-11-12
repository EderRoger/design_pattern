package iterator;

import java.util.*;

/**
 * Created by eder on 11/11/15.
 */
public class NullIterator implements java.util.Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
