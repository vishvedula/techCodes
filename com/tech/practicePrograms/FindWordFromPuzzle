/**
 * Finding the word within a given Puzzle.
 */
package com.thread.programs;

import java.util.ArrayList;
import java.util.List;

public class FindWordFromMatrix {
	public static void main(String args[]){
		char[][] board = 
			 {  { 'a', 'a', 'a', 'n' },
				{ 'p', 'b', 'a', 'e' }, 
				{ 'p', 'h', 'c', 'r' }, 
				{ 'y', 'f', 'l', 'd' } };
		String[] words = {"appy"};
		System.out.println(findWords(board, words));
	}


	public static List<String> findWords(char[][] board, String[] words) {
		ArrayList<String> result = new ArrayList<String>();

		int m = board.length;
		int n = board[0].length;

		for (String word : words) {
			boolean flag = false;
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					char[][] newBoard = new char[m][n];
					for (int x = 0; x < m; x++)
						for (int y = 0; y < n; y++)
							newBoard[x][y] = board[x][y];

					if (dfs(newBoard, word, i, j, 0)) {
						flag = true;
					}
				}
			}
			if (flag) {
				result.add(word);
			}
		}

		return result;
	}

	public static boolean dfs(char[][] board, String word, int i, int j, int k) {
		int m = board.length;
		int n = board[0].length;

		if (i < 0 || j < 0 || i >= m || j >= n || k > word.length() - 1) {
			return false;
		}

		if (board[i][j] == word.charAt(k)) {
			char temp = board[i][j];
			board[i][j] = '#';

			if (k == word.length() - 1) {
				return true;
			} else if (dfs(board, word, i - 1, j, k + 1) || dfs(board, word, i + 1, j, k + 1)
					|| dfs(board, word, i, j - 1, k + 1) || dfs(board, word, i, j + 1, k + 1)) {
				board[i][j] = temp;
				return true;
			}

		} else {
			return false;
		}

		return false;
	}
	
}
