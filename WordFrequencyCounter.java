package test11;
import java.util.HashMap;
import java.util.Map;
public class WordFrequencyCounter {
    public static void main(String[] args) {
        String paragraph = "The quick brown fox jumps over the lazy dog. The quick brown fox.";
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        String[] words = paragraph.split("\\W+");
        for (String word : words) {
            String lowerCaseWord = word.toLowerCase(); // Case-insensitive\r\n           
            wordFrequencyMap.put(lowerCaseWord, wordFrequencyMap.getOrDefault(lowerCaseWord, 0) + 1);
        }
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println("- \"" + entry.getKey() + "\": " + entry.getValue());
        }
    }
}