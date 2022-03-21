// Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
// For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
// What is the total of all the name scores in the file?

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

class ProjectEuler {
    public static void main(String[] args) throws IOException {
        ArrayList<String> names = new ArrayList<String>();

        BufferedReader numReader = new BufferedReader(new FileReader("p022_names.txt"));
        String line = "";

        while ((line = numReader.readLine()) != null) {
            String[] dataNames = line.split(",");

            for (String item : dataNames) {
                String newItem = item.substring(1, item.length() - 1);
                names.add(newItem);
            }
        }
        numReader.close();

        Collections.sort(names);
        long total = 0L;
        int listIndex = 1, itemTotal = 0;
        for(String name : names) {
            for (Character letter : name.toCharArray()) {
                itemTotal += (letter - 64);
            }
            total += (itemTotal * listIndex);
            itemTotal = 0;
            listIndex++;
        }

        System.out.println(total); 
    }
}