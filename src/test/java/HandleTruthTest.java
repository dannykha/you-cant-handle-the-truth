import org.junit.Test;

import java.util.*;
import static org.junit.Assert.assertEquals;


public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        HandleTruth.wordCount("hello hello is it me your looking for");
    }

    @Test
    public void realTest() {
        String[] input = {"hello hello your mom", "you are the coolest coolest"};
        List<TreeMap<Integer, Set<String>>> testCases = getExpectedCases();

        for (int i = 0; i < testCases.size(); i++) {
            TreeMap<Integer, Set<String>> actual;
            actual = HandleTruth.wordCount(input[i]);
            TreeMap<Integer, Set<String>> testCase = testCases.get(i);
            assertEquals(testCase, actual);
        }
    }

    private List<TreeMap<Integer, Set<String>>> getExpectedCases() {
        List<TreeMap<Integer, Set<String>>> testCases = new ArrayList<>();

        TreeMap<Integer, Set<String>> expected1 = new TreeMap<>();
        Set<String> value = new HashSet<>();
        Set<String> value2 = new HashSet<>();
        value.add("your");
        value.add("mom");
        value2.add("hello");
        value2.add("hello");
        expected1.put(1, value);
        expected1.put(2, value2);

        testCases.add(expected1);

        TreeMap<Integer, Set<String>> expected2 = new TreeMap<>();
        Set<String> value3 = new HashSet<>();
        Set<String> value4 = new HashSet<>();
        value3.add("coolest");
        value3.add("coolest");
        value4.add("you");
        value4.add("are");
        value4.add("the");
        expected2.put(1, value4);
        expected2.put(2, value3);
        testCases.add(expected2);

        return testCases;
    }
}