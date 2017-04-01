import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by baranipek on 01/04/17.
 */
public class MergeNodeTest extends MergeNode {
    @Test
    public void testMerge() throws Exception {

        //4,6
        MergeNode.Node n1 = new MergeNode.Node(4);
        MergeNode.Node n2 = new MergeNode.Node(6);
        n1.next = n2;
        n2.next = null;

        //3,5
        MergeNode.Node n5 = new MergeNode.Node(3);
        MergeNode.Node n6 = new MergeNode.Node(5);
        n5.next = n6;
        n6.next = null;

        assertEquals(merge(n1,n5).toString(),("3->4->5->6->"));
        
    }



}