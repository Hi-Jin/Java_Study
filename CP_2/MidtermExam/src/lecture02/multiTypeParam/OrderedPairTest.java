package lecture02.multiTypeParam;

public class OrderedPairTest {

	Pair<String, Integer> 	p1 = new OrderedPair<String, Integer>("Even", 8);
	Pair<String, Integer> 	p2 = new OrderedPair<Integer, String>(1, "hi");
	Pair<String, Integer> 	p3 = new OrderedPair<>("park", 24);
	Pair<> 					p4 = new OrderedPair<String, Integer>("test", 1); 
	Pair					p5 = new OrderedPair(1, 1); // raw
}
