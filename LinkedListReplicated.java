/*
 * LinkedListReplicated.java
 * 
 */


public class LinkedListReplicated  {
 
    public static void main(String s[]) 
    {
    	
    	LinkedIntList trial = new LinkedIntList();
    	LinkedIntList trial2 = new LinkedIntList(12);
    	
    	trial2.add(122);
    	trial2.add(534);
		trial2.add(-756);
    	trial2.add(886);
		trial2.add(2,23);
    	trial2.add(2, -74);

		System.out.println(trial2.toString());
		System.out.println(trial2.get(6));

		trial2.remove(6);
		System.out.println(trial2.toString());
		System.out.println(trial2.get(5));
		System.out.println(trial2.size());
		System.out.println(trial2.indexOf(534));
		trial2.sort();
		System.out.println(trial2.toString());
		trial.clear();
		System.out.println(trial.toString());




    	
      	//Test out each of your various methods (add, insert, get, indexOf, remove, size, toString)) 
      		//using either of the instantiated LinkedIntList objects
    }
    
}
