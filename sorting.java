import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>
{
     public int compare(String s1, String s2)
     {
    	 int len1 = s1.length();
    	 int len2 = s2.length();
    	 
    	 if(len1 > len2)
    	 {
    		 return 1;
    	 }
    	 else if(len1 < len2)
    	 {
    		 return -1;
    	 }
    	 return 0;
     }
}
class AlphabeticalComparator implements Comparator<String>
{
     public int compare(String s1, String s2)
     {
    	 return s1.compareTo(s2);
     }
}
class ReverseAlphabeticalComparator implements Comparator<String>
{
     public int compare(String s1, String s2)
     {
    	 return -s1.compareTo(s2);
     }
}
public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> animals = new ArrayList<String>();
        
        animals.add("tiger");
        animals.add("lion");
        animals.add("cat");
        animals.add("snake");
        animals.add("mongoose");
        animals.add("elephant");
        
        // Collections.sort(animals, new StringLengthComparator());
        // Collections.sort(animals, new AlphabeticalComparator());
        Collections.sort(animals, new ReverseAlphabeticalComparator());
        
        for(String animal: animals) 
        {
        	System.out.println(animal);
        }
        
        List<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(5);
        numbers.add(2);
        numbers.add(10);
        numbers.add(1);
        numbers.add(25);
        numbers.add(13);
        
        Collections.sort(numbers);
        
        for(Integer number : numbers)
        {
        	System.out.println(number);
        }
	}

}
