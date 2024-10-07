package app_java_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementInTwoArrays {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
//        List<Integer>list1=new ArrayList<>();
//        List<Integer>list2=new ArrayList<>();
//        for(int a:array1) {
//        	list1.add(a);
//        }
//        
//        for(int b:array2) {
//        	list2.add(b);
//        }
        
        List<Integer> list1 = Arrays.stream(array1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(array2).boxed().collect(Collectors.toList());
        List<Integer> commonList = commonList(list1,list2);
        System.out.println(commonList);

	}
	
	public static List<Integer> commonList(List<Integer>list1,List<Integer>list2){
		return list1.stream().filter(element->list2.contains(element)).toList();
	}

}
