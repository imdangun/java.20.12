package ch07.ex02.case17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ScoreMap {
	public static void main(String[] args) {
		Map<String, List<Integer>> map = new HashMap<>();
		
		String[] userNames = {"최한석", "한아름", "양승일"};
		List<Integer> score = null;
		int idx = 0;
		
		for(int i = 9; i >= 7; i--) {
			score = new ArrayList<Integer>();
			for(int j = 0; j < 3; j++) score.add(i * 10 + j);
			map.put(userNames[idx++], score);
		}
		System.out.println(map); // {최한석=[90, 91, 92], 한아름=[80, 81, 82], 양승일=[70, 71, 72]}
		
		Set<String> keys = map.keySet();
		System.out.println(keys); // [최한석, 한아름, 양승일]
		
		
		for(String key: keys)
			System.out.println(key + ": " + map.get(key));
		/*
		 	최한석: [90, 91, 92]
			한아름: [80, 81, 82]
			양승일: [70, 71, 72]
		 */
	}
}
