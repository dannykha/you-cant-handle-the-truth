import org.junit.Test;

import java.util.*;
import static org.junit.Assert.assertEquals;


public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        HandleTruth.wordCount("hello hello my name is who");
    }

    @Test
    public void realTest() {
        String[] input = {"test big TESTER", "hello hello your mom", "you are the coolest cool cool coolest", "hello hello hello is is is is it it me your looking for", "oh a womanizer you-are womanizer you-are womanizer you-are womanizer womanizer you-are womanizer you-are womanizer womanizer baby"};
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

        // Test 1
        TreeMap<Integer, Set<String>> expected = new TreeMap<>();
        Set<String> testVal = new HashSet<>();
        testVal.add("test");
        testVal.add("big");
        testVal.add("TESTER");
        expected.put(1, testVal);
        testCases.add(expected);

        // Test 2
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

        // Test 3
        TreeMap<Integer, Set<String>> expected2 = new TreeMap<>();
        Set<String> value3 = new HashSet<>();
        Set<String> value4 = new HashSet<>();
        value3.add("coolest");
        value3.add("coolest");
        value3.add("cool");
        value3.add("cool");
        String array0[] = {"you", "are", "the"};
        for (String str : array0) {
            value4.add(str);
        }
        expected2.put(1, value4);
        expected2.put(2, value3);
        testCases.add(expected2);

        // Test 4
        TreeMap<Integer, Set<String>> expected3 = new TreeMap<>();
        Set<String> value5 = new HashSet<>();
        Set<String> value6 = new HashSet<>();
        Set<String> value7 = new HashSet<>();
        value2.add("hello");
        String array[] = {"is", "is", "is", "is"};
        for (String str: array) {
            value5.add(str);
        }
        String array1[] = {"it", "it"};
        for (String str: array1) {
            value6.add(str);
        }
        String array2[] = {"me", "your", "looking", "for"};
        for (String str : array2) {
            value7.add(str);
        }
        expected3.put(4, value5);
        expected3.put(3, value2);
        expected3.put(2, value6);
        expected3.put(1, value7);
        testCases.add(expected3);

        // Test 5
        TreeMap<Integer, Set<String>> expected4 = new TreeMap<>();
        Set<String> value8 = new HashSet<>();
        Set<String> value9 = new HashSet<>();
        Set<String> value10 = new HashSet<>();
        String array3[] = {"womanizer","womanizer", "womanizer", "womanizer", "womanizer", "womanizer", "womanizer", "womanizer", };
        for (String str : array3) {
            value8.add(str);
        }
        String array4[] = {"you-are", "you-are", "you-are", "you-are", "you-are"};
        for (String str : array4) {
            value9.add(str);
        }
        String array5[] = {"oh", "a", "baby"};
        for (String str : array5) {
            value10.add(str);
        }
        expected4.put(8, value8);
        expected4.put(5, value9);
        expected4.put(1, value10);
        testCases.add(expected4);



        return testCases;
    }
}