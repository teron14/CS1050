
/**
 * A demo of the <code>getMinimumTree()</code> method of <code>Graph</code>.
 *
 * @author Bennett Alex Myers
 * @version 2015.09.24
 */
public class Demo
{

    public Demo()
    {

    }

    public void test()
    {
        Graph graph = new Graph(9);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 7, 8);
        graph.addEdge(1, 2, 8);
        graph.addEdge(1, 7, 11);
        graph.addEdge(2, 3, 7);
        graph.addEdge(2, 5, 4);
        graph.addEdge(2, 8, 2);
        graph.addEdge(3, 4, 9);
        graph.addEdge(3, 5, 14);
        graph.addEdge(4, 5, 10);
        graph.addEdge(5, 6, 2);
        graph.addEdge(6, 7, 1);
        graph.addEdge(6, 8, 6);
        graph.addEdge(7, 8, 7);
        graph.printGraph();
        Graph tree = graph.getMinimumTree(0);
        tree.printGraph();
    }
}