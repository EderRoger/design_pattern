package adapter.enumeration;

/**
 * Created by eder on 24/10/15.
 */
public class EnumertarionIterator implements Iterator {
    Enumeration enumeration;

    public EnumertarionIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw  new UnsupportedOperationException();
    }
}
