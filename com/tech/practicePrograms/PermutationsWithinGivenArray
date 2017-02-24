/**
 * Example
Input: [4, 6, 7, 7]
Output:  [[4, 6], [4, 6, 7], [4, 6, 7, 7], [4, 7], [4, 7, 7], [6, 7], [6, 7, 7], [7, 7]]

Note:

The length of the given array will not exceed 15.
The range of integer in the given array is [-100,100].
The given array may contain duplicates, and two equal integers should also be considered as a special case of increasing sequence.
 */
package com.thread.programs;

import java.util.ArrayList;
import java.util.List;

public class PermutationsGivenArray {

	/*private static List<Integer> list;
	private static List<List<Integer>> finalList;

	@SuppressWarnings("unused")
	public static void main(String args[]) {
		int array[] = new int[] { 4, 6, 7, 7 };
		int length = array.length;
		finalList = new ArrayList<>();
		for (int i = 0; i < length - 1; i++) {

			for (int j = i + 1; j <= length - 1; j++) {
				list = new ArrayList<>();
				if (array[i] <= array[j]) {
					list.add(array[i]);
					list.add(array[j]);
					finalList.add(list);
				}

			}
		}
		// System.out.println(list);
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		set.addAll(finalList);
		System.out.println(set);
	}*/
	
	public List<List<Integer>> findSubsequences(int[] input) {
        List<List<Integer>> result = new ArrayList<>();
        findSequence(result, new ArrayList<Integer>(), input, 0);
        return result;
    }
 
    private void findSequence(List<List<Integer>> result, List<Integer> list, int[] nums, int id) {
        if (list.size() >= 2) {
            // add the created subsequences to the result
            result.add(new ArrayList<Integer>(list));
        }
        List<Integer> unique = new ArrayList<Integer>();
        for (int i = id; i < nums.length; i++) { if (id > 0 && nums[i] < nums[id - 1]) {
                // we need increasing numbers or equal numbers
                continue; 
            }
            if (unique.contains(nums[i])) {
                // skip duplicates for subsequences
                continue; 
            }
            unique.add(nums[i]);
            list.add(nums[i]);
            findSequence(result, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
     
    public static void main(String[] args) {
        int[] input = {4,6,7,7};
        List<List<Integer>> subsequences = new PermutationsGivenArray().findSubsequences(input);
        System.out.println(subsequences);
    }

}
