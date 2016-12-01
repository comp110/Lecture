package comp110.lecture26;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TextFile {

	public static String[] readLinesAndSort(String path) {

		List<String> lines = new ArrayList<String>();

		try {
			Scanner sc = new Scanner(new File(path));
			while (sc.hasNextLine()) {
				lines.add(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Could not find the file " + path + ". Exiting the program.");
			System.exit(1);
		}

		String[] linesArray = new String[lines.size()];
		lines.toArray(linesArray);
		Arrays.sort(linesArray); // Here we're letting Java sort for us.
		return linesArray;
	}

}
