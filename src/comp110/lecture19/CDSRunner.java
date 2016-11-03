package comp110.lecture19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CDSRunner {

  public static void main(String[] args) throws FileNotFoundException, IOException {

    // Step 0: Read the menu data into a List of MenuItems
    List<MenuItem> menu = CDSRunner.readCSVFile("data/rams-2016-11-02.csv");

    // TODO: Step 1: Sort the menu by calories

    // Step 2: Print out the first five MenuItems in the list
    for (int i = 0; i < 5; i++) {
      MenuItem item = menu.get(i);
      System.out.println(i + ": " + item.getName() + " - " + item.getCalories());
    }

  }

  // Read a CSV File
  public static List<MenuItem> readCSVFile(String path) {
    try {
      List<MenuItem> menu = new ArrayList<MenuItem>();
      Reader in = new FileReader(path);
      CSVParser records = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(in);
      for (CSVRecord record : records) {
        MenuItem item = CDSRunner.readCSVLine(record);
        menu.add(item);
      }
      return menu;
    } catch (Exception e) {
      throw new Error("An error was encountered reading the CSV file.");
    }
  }

  // Read a Line of a CSV File and construct a MenuItem from it
  public static MenuItem readCSVLine(CSVRecord record) {
    MenuItem item = new MenuItem();

    item.setName(record.get("name"));
    item.setSeating(record.get("seating"));

    item.setProtein(Double.parseDouble(record.get("protein")));
    item.setFat(Double.parseDouble(record.get("fat")));
    item.setCalories(Double.parseDouble(record.get("calories")));
    item.setCarbs(Double.parseDouble(record.get("carbs")));

    item.setOrganic(Boolean.parseBoolean(record.get("organic")));
    item.setGlutenFree(Boolean.parseBoolean(record.get("glutenFree")));
    item.setVegan(Boolean.parseBoolean(record.get("vegan")));
    item.setVegetarian(Boolean.parseBoolean(record.get("vegetarian")));

    return item;
  }

}
