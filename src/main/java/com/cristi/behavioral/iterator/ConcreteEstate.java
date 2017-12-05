package com.cristi.behavioral.iterator;

public class ConcreteEstate implements ConcreteIterator {
    public String styles[] = {"Loft", "Classic", "Modern", "Minimalism"};

    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            if(index<styles.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return styles[index++];
            }
            return null;
        }
    }
}
