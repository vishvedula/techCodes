package com.mkyong.core;

import java.net.UnknownHostException;
import java.util.Date;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

/**
 * Java + MongoDB Hello world Example
 * 
 */
public class App {
	public static void main(String[] args) {

		try {

			/**** Connect to MongoDB ****/
			// Since 2.10.0, uses MongoClient
			MongoClient mongo = new MongoClient("localhost", 27017);

			/**** Get database ****/
			// if database doesn't exists, MongoDB will create it for you
			//DB db = mongo.getDB("testdb");

			// This DB would be created by MongoDB
			DB db = mongo.getDB("mongoJavaCreatedDB");
			
			/**** Get collection / table from 'testdb' ****/
			// if collection doesn't exists, MongoDB will create it for you
			DBCollection table = db.getCollection("user");

			/**** Insert ****/
			// create a document to store key and value
			// BasicDBObject is kind of Map<key, Value> 
			BasicDBObject document = new BasicDBObject();
			document.put("name", "mkyong");
			document.put("age", 31);
			document.put("createdDate", new Date());
			table.insert(document);
			

			/**** Find and display ****/
			BasicDBObject searchQuery = new BasicDBObject();
			searchQuery.put("name", "mkyong");

			DBCursor cursor = table.find(searchQuery);

			while (cursor.hasNext()) {
				System.out.println(cursor.next());
			}

			/**** Insert Closed****/
			
			/**** Update ****/
			// search document where name="mkyong" and update it with new values
			BasicDBObject oldDocument = new BasicDBObject();
			oldDocument.put("name", "mkyong-updated");

			// Create new Document
			BasicDBObject newDocument = new BasicDBObject();
			newDocument.put("name", "mkyong-updated");
			newDocument.put("age", 30);
			newDocument.put("createdDate", new Date());
			
			BasicDBObject updateObj = new BasicDBObject();
			updateObj.put("$set", newDocument);

			// update old document with new One.
			table.update(oldDocument, newDocument);

			/**** Find and display ****/
			BasicDBObject searchQuery2 
				= new BasicDBObject().append("name", "mkyong-updated");

			DBCursor cursor2 = table.find(searchQuery2);

			while (cursor2.hasNext()) {
				System.out.println(cursor2.next());
			}

			/**** Done ****/
			System.out.println("Done");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MongoException e) {
			e.printStackTrace();
		}

	}
}
