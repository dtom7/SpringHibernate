package com.example.SpringHibernate.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() throws FileNotFoundException, IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\thomad2\\Downloads\\removal.csv"));
				Writer fileWriter = new FileWriter("C:\\Users\\thomad2\\Downloads\\removal.sql")) {
			String line, name, vunetid, emplid, privileDisplayName, resource;
			Scanner sc;
			while ((line = br.readLine()) != null) {
				sc = new Scanner(line).useDelimiter(",");
				name = sc.next();
				vunetid = sc.next();
				emplid = sc.next();
				privileDisplayName = sc.next();
				resource = sc.next();
				fileWriter.write(name + " -- " + vunetid + " -- " + emplid + " -- " + privileDisplayName + " -- " + resource);

			}
		}

	}

}