package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      // TODO: Your answer
	  extractedMethod(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      // TODO: Your answer
	  extractedMethod(edgeList, p);
	   
      // other implementation
      return null;
   }

   // TODO: Your answer
   // ? extractedMethod(?) {
   //
   // }
   
   private <T extends Container> void extractedMethod(List<T> list, String p) {
	   for (T obj : list) {
		   if (obj.contains(p)) {
			   System.out.println(obj);
		   }
	   }
   }
   
}

// Another way of recognizing contains(p: str).
// Not as good a solution as p6 though.
interface Container {  
	public boolean contains(String p);
}

class Node implements Container {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge implements Container {
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}