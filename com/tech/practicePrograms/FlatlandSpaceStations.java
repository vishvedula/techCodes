/**
 * Flatland is a country with a number of cities, some of which have space stations. Cities are numbered consecutively and each has a road of

length connecting it to the next city. It is not a circular route, so the first city doesn't connect with the last city. Determine the maximum distance from any city to it's nearest space station.

For example, there are
cities and of them has a space station, city . They occur consecutively along a route. 
City is unit away and city is units away. City is units from its nearest space station as one is located there. 
The maximum distance is

.

Function Description

Complete the flatlandSpaceStations function in the editor below. 
It should return an integer that represents the maximum distance any city is from a space station.

flatlandSpaceStations has the following parameter(s):

    n: the number of cities
    c: an integer array that contains the indices of cities with a space station, 

    -based indexing

Input Format

The first line consists of two space-separated integers,
and .
The second line contains

space-separated integers, the indices of each city having a space-station. These values are unordered and unique.

Constraints

There will be at least

    city with a space station.
    No city has more than one space station.

Output Format

Print an integer denoting the maximum distance that an astronaut in a Flatland city would need to 
travel to reach the nearest space station.

Sample Input 0

5 2
0 4

Sample Output 0

2


 * @author vivedula
 *
 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;
public class FlatlandSpaceStations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of cities");
		int nOfCities = scan.nextInt();
		System.out.println("Enter the number of cities having gas stations");
		int cityWithGasStation = scan.nextInt();
        // Creating an array with those GasStationed cities
		int[] c = new int[cityWithGasStation];
		
		for (int i = 0; i < cityWithGasStation; i++) {
            int cItem = scan.nextInt();
            c[i] = cItem;
        }
		
		findMaxDistanceFromGasStation(nOfCities,c);
	}

	
	private static int findMaxDistanceFromGasStation(int nOfCities, int[] c) {
		// Logic is to find minimum distance for each City with the city array 
		// Add all the values to the temporary list
		// Add the least value from list1 to final List
		// Return the max value from the final List
		List list = new ArrayList<>();

		for (int i = 0; i < nOfCities; i++) {
			List list1 = new ArrayList<>();
			for (int j = 0; j < c.length; j++) {
				list1.add(Math.abs(i - c[j]));
			}
			Collections.sort(list1);
			list.add(list1.get(0));
		}

		Collections.sort(list);
		System.out.println((int) list.get(list.size() - 1));
		return (int) list.get(list.size() - 1);
	}
}
