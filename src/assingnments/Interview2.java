package assingnments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Interview2 {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		Collections.addAll(list, 1,2,3,4,2,4,5);
		Set<Integer>set=new HashSet<Integer>();
		
		List<Integer>duplicateValues=list.stream().filter(a->!set.add(a)).collect(Collectors.toList());
		System.out.println(duplicateValues);

	}

}
