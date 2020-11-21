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
        String[] input = {"hello hello your mom", "you are the coolest coolest", "hello hello hello is is is is it it me your looking for"};
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

        TreeMap<Integer, Set<String>> expected3 = new TreeMap<>();
        Set<String> value5 = new HashSet<>();
        Set<String> value6 = new HashSet<>();
        Set<String> value7 = new HashSet<>();
        value2.add("hello");
        value5.add("is");
        value5.add("is");
        value5.add("is");
        value5.add("is");
        value6.add("it");
        value6.add("it");
        value6.add("it");
        value7.add("me");
        value7.add("your");
        value7.add("looking");
        value7.add("for");
        expected3.put(4, value5);
        expected3.put(3, value2);
        expected3.put(2, value6);
        expected3.put(1, value7);
        testCases.add(expected3);

        return testCases;
    }
}