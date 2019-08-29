package com.bmw.interview.pretest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SharedLLCFinderTest {

    @Test
    public void testFindWithNotEmpty() {
        SharedLLCFinder sharedLLCFinder = new SharedLLCFinder();
        SharedLLCFinder.LinKedNode c3 = sharedLLCFinder.new LinKedNode("c3", null);
        SharedLLCFinder.LinKedNode c2 = sharedLLCFinder.new LinKedNode("c2", c3);
        SharedLLCFinder.LinKedNode c1 = sharedLLCFinder.new LinKedNode("c1", c2);

        SharedLLCFinder.LinKedNode b3 = sharedLLCFinder.new LinKedNode("b3", c1);
        SharedLLCFinder.LinKedNode b2 = sharedLLCFinder.new LinKedNode("b2", b3);
        SharedLLCFinder.LinKedNode b1 = sharedLLCFinder.new LinKedNode("b1", b2);
        SharedLLCFinder.LinKedNode a2 = sharedLLCFinder.new LinKedNode("a2", c1);
        SharedLLCFinder.LinKedNode a1 = sharedLLCFinder.new LinKedNode("a1", a2);

        sharedLLCFinder.setRootOne(a1);
        sharedLLCFinder.setRootTwo(b1);
        sharedLLCFinder.find(a1, b1);
        assertEquals("c1", sharedLLCFinder.getResult());
    }

    @Test
    public void testFindWithEmpty() {
        SharedLLCFinder sharedLLCFinder = new SharedLLCFinder();
        SharedLLCFinder.LinKedNode c3 = sharedLLCFinder.new LinKedNode("c3", null);
        SharedLLCFinder.LinKedNode c2 = sharedLLCFinder.new LinKedNode("c2", c3);
        SharedLLCFinder.LinKedNode c1 = sharedLLCFinder.new LinKedNode("c1", c2);

        SharedLLCFinder.LinKedNode c11 = sharedLLCFinder.new LinKedNode("c1", c3);
        SharedLLCFinder.LinKedNode b3 = sharedLLCFinder.new LinKedNode("b3", c1);
        SharedLLCFinder.LinKedNode b2 = sharedLLCFinder.new LinKedNode("b2", b3);
        SharedLLCFinder.LinKedNode b1 = sharedLLCFinder.new LinKedNode("b1", b2);
        SharedLLCFinder.LinKedNode a2 = sharedLLCFinder.new LinKedNode("a2", c11);
        SharedLLCFinder.LinKedNode a1 = sharedLLCFinder.new LinKedNode("a1", a2);

        sharedLLCFinder.setRootOne(a1);
        sharedLLCFinder.setRootTwo(b1);
        sharedLLCFinder.find(a1, b1);
        assertEquals(null, sharedLLCFinder.getResult());
    }

}
