/*
Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array.

The Player class is provided for you in your editor. It has  fields: a  String and a  integer.

Given an array of  Player objects, write a comparator that sorts them in order of decreasing score; if  or more players have the same score, sort those players alphabetically by name. To do this, you must create a Checker class that implements the Comparator interface, then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.

Input Format

Input from stdin is handled by the locked stub code in the Solution class.

The first line contains an integer, , denoting the number of players. 
Each of the  subsequent lines contains a player's  and , respectively.

Constraints

 players can have the same name.
Player names consist of lowercase English letters.
Output Format

You are not responsible for printing any output to stdout. The locked stub code in Solution will create a Checker object, use it to sort the Player array, and print each sorted element.

Sample Input

5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150
Sample Output

aleksa 150
amy 100
david 100
aakansha 75
heraldo 50
*/

package com.javacodegeeks.javabasics.hashmaptest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaComparatorUseCase {
	public static void main(String args[]){
		
		List<Player> list = new ArrayList<Player>();
		
		list.add(new Player("abid", 100));
		list.add(new Player("amy", 100));
		list.add(new Player("aced", 100));
		list.add(new Player("and", 100));
		list.add(new Player("aaedn", 100));
		list.add(new Player("heraldo", 50));
		list.add(new Player("aakansha", 100));
		list.add(new Player("aakansha", 75));
		Collections.sort(list, new Checker());
		for(Player p : list){
			System.out.println(p);
		}
	}
}

class Checker implements Comparator<Player> {

	@Override
	public int compare(Player player1, Player player2) {
		if (player1.getScore() < player2.getScore()) {
			return 1;
		} else if(player1.getScore() == player2.getScore()){
			return player1.getName().compareTo(player2.getName());
		}else {
			return -1;
		}

	}
}
class Player{
	private String name;
	private int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	Player(String name, int score){
		this.name=name;
		this.score=score;
	}
	
	public String toString(){
		return "name: "+name+" with  "+"score: "+score;
	}
	
