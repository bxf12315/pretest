package com.bmw.interview.pretest;

public class SharedLLCFinder {

    LinKedNode rootOne;
    LinKedNode rootTwo;
    String result;

    public String getResult() {
        return result;
    }

    public LinKedNode getRootOne() {
        return rootOne;
    }

    public void setRootOne(LinKedNode rootOne) {
        this.rootOne = rootOne;
    }

    public LinKedNode getRootTwo() {
        return rootTwo;
    }

    public void setRootTwo(LinKedNode rootTwo) {
        this.rootTwo = rootTwo;
    }

    public void find(LinKedNode one, LinKedNode two) {
        if (one.getCurrentValue().equals(two.getCurrentValue())) {
            if (one.getNextNode().equals(two.getNextNode())) {
                result = one.getCurrentValue();
                return;
            }
        }
        if (two.getNextNode() != null && result == null && one.getNextNode() != null) {
            find(one, two.getNextNode());
        }
        if (two.getNextNode() == null && result == null) {
            find(one.getNextNode(), rootTwo);
        }

        if (one.getNextNode() == null && two.getNextNode() == null) {
            return;
        }
    }

    public class LinKedNode {

        String currentValue;
        LinKedNode nextNode;

        public LinKedNode(String currentValue, LinKedNode nextNode) {
            this.currentValue = currentValue;
            this.nextNode = nextNode;
        }

        public String getCurrentValue() {
            return currentValue;
        }

        public void setCurrentValue(String currentValue) {
            this.currentValue = currentValue;
        }

        public LinKedNode getNextNode() {
            return nextNode;
        }

        public void setNextNode(LinKedNode nextNode) {
            this.nextNode = nextNode;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            LinKedNode that = (LinKedNode) o;

            if (currentValue != null ? !currentValue.equals(that.currentValue) : that.currentValue != null) {
                return false;
            }
            return nextNode != null ? nextNode.equals(that.nextNode) : that.nextNode == null;
        }

        @Override
        public int hashCode() {
            int result = currentValue != null ? currentValue.hashCode() : 0;
            result = 31 * result + (nextNode != null ? nextNode.hashCode() : 0);
            return result;
        }
    }
}
