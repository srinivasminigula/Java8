package com.j8.lambda;

import java.io.File;
import java.io.IOException;

public class LamdaFileFilter {
	public static void main(String[] args) throws IOException {
		File dir = new File("src");
		File[] files = dir.listFiles(e->e.getName().endsWith(".java"));
		for(File file: files){
			System.out.println(file);
		}
	}
}
