package com.tech.practicePrograms;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class SeriDeserialization implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int number;
	private String text;
	
	// Getters and Setters
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SeriDeserialization serDes = new SeriDeserialization();
		serDes.setNumber(1);
		serDes.setText("Testing Serialization and Deserialization");
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/vishal/Downloads/Serialization.txt"));
			oos.writeObject(serDes);
			//oos.close();
			System.out.println("File written");
		} catch (FileNotFoundException fileNFE) {
			fileNFE.printStackTrace();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/vishal/Downloads/Serialization.txt"));
			SeriDeserialization sers = (SeriDeserialization)ois.readObject();
			System.out.println("" + sers.getNumber());
			System.out.println("" + sers.getText());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

