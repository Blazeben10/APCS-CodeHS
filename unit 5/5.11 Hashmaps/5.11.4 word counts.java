import java.util.*;

public class WordCounts extends ConsoleProgram
{
    public void run()
    {
        // Start here!
        HashMap<String, Integer> wordC = new HashMap<String, Integer>();
        String[] input = readLine("Enter a string: ").toLowerCase().split(" ");
        for(String s : input) {
            int oldC = wordC.containsKey(s) ? wordC.get(s) : 0;
            wordC.put(s, oldC + 1);
        }
        printSortedHashMap(wordC);
    }
    
    /*
     * This method takes a HashMap of word counts and prints out
     * each word and it's associated count in alphabetical order.
     *
     * @param wordCount The HashMap mapping words to each word's frequency count
     */
    private void printSortedHashMap(HashMap<String, Integer> wordCount){
        // Sort all the keys (words) in the HashMap
        Object[] keys = wordCount.keySet().toArray();
        Arrays.sort(keys);
        
        // Print out each word and it's associated count
        for (Object word : keys) {
            int val = wordCount.get(word);
            System.out.println(word + ": " + val);
        }
    }
}