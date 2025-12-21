package Module1.basicjava;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Assignemnt47 
{

	public static void main(String[] args) 
	{
		 // Upcasting to List
        List<String> list = new LinkedList<>();

        System.out.println("Using LinkedList as List");

        //Adding elements
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        //Add at specific index
        list.add(2, "X");

        //AddAll
        List<String> extra = Arrays.asList("P", "Q");
        list.addAll(extra);

        System.out.println("List after additions: " + list);

        //Accessing elements
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Size: " + list.size());
        System.out.println("Is Empty? " + list.isEmpty());

        //Updating elements
        list.set(3, "Updated");
        System.out.println("After updating index 3: " + list);

        //Searching
        System.out.println("Contains 'C'? " + list.contains("C"));
        System.out.println("Index of 'X': " + list.indexOf("X"));
        System.out.println("Last index of 'P': " + list.lastIndexOf("P"));

        //Removing elements
        list.remove("B");
        list.remove(2);  // Remove at index
        System.out.println("After removals: " + list);

        //Iteration methods

        System.out.println("Iteration using for loop:");
        for (int i = 0; i < list.size(); i++) 
        {
            System.out.println(list.get(i));
        }

        System.out.println("Iteration using enhanced for:");
        for (String s : list) 
        {
            System.out.println(s);
        }

        System.out.println("Iteration using Iterator:");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Iteration using ListIterator (forward):");
        ListIterator<String> litr = list.listIterator();
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

        System.out.println("Iteration using ListIterator (backward):");
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }


	}

}
