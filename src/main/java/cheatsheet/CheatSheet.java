package cheatsheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CheatSheet {

    public static void main(String[] args) {
        int[] intArray = {1, 4, 6, 2, 8, 2, 8, 2, 8};
        int integer = 12345;
        String string = "My String";
        List<Integer> list = new ArrayList<>();
        /**
         * ARRAY
         * 
         */
        // print an array
        System.out.println("print an array " + Arrays.toString(intArray));
        // [1, 4, 6, 2, 8, 2, 8, 2, 8]

        // print two dimensional (2D) arry
        {
            int[][] twoDimensionalArray = {{1, 3}, {2, 3}, {3, 3}};
            System.out.println(Arrays.deepToString(twoDimensionalArray));
        }

        // List to array
        int[] listToArray = list.stream().mapToInt(element -> element).toArray();

        /**
         * STREAM
         */
        // Create Stream from array. Array to stream
        IntStream stream2 = Arrays.stream(intArray);
        Stream<int[]> stream = Stream.of(intArray);
        IntStream stream3 = IntStream.of(intArray);

        // Get unique (distinct) element from Array using stream
        int[] uniqueNumbers = Arrays.stream(intArray).distinct().toArray();
        System.out.println("uniqueNumbers: " + Arrays.toString(uniqueNumbers));
        // [1, 4, 6, 2, 8]

        // Array filter using streams
        int[] arrayWithEachElementLessThanFive = Arrays.stream(intArray).filter(arrivalTime -> arrivalTime < 5).toArray();
        System.out.println("Array filter" + Arrays.toString(arrayWithEachElementLessThanFive));
        // [1, 4, 2, 2, 2]

        // Maximum number for integer ins array
        int maxOfAnArray = IntStream.of(intArray).summaryStatistics().getMax();
        Arrays.stream(intArray).summaryStatistics().getMax();
        System.out.println("Maximum number for integer array" + maxOfAnArray);// 8

        // Sort array using stream - this returns array
        Arrays.stream(intArray).sorted().toArray();

        // sort method - this returns void
        Arrays.sort(intArray);

        // repeat, times, limit print * 5 times
        Stream.generate(() -> "*").limit(5).forEach(System.out::print);

        /**
         * STRING
         * 
         */
        // How to count a particular character in a string
        {
            Long count = string.chars().filter(ch -> ch == 't').count();
            System.out.println("count chara:" + count); // 1
        }

        // Count unique (distinct) characters in string
        {
            Long count = ("my string").chars().distinct().count();
        }

        // Integer to String
        StringBuilder stringBuilder = new StringBuilder(Integer.toString(integer));
        System.out.println("Integer to String: " + stringBuilder);
        // OR
        String intToString = String.valueOf(integer);
        System.out.println("intToString: " + intToString);
        // 12345 - string

        // reversing string
        String reverseString = stringBuilder.reverse().toString();
        System.out.println("reversing string: " + reverseString);
        // 54321 - string

        // string to integer
        int stringToInteger = Integer.parseInt(reverseString);
        System.out.println("string to integer: " + stringToInteger);
        // 54321- number

        // create alphabet
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i);
        }
        System.out.println();

        {
            // Overloading indexOf() to get second occurrence of character
            String s = "hello";
            char c = 'l';
            s = s.substring(s.indexOf(c, s.indexOf(c) + 1));
        }

        // Sort String in characters; in ascending order
        {
            String sortedString = Stream.of("My string".split("")).sorted().collect(Collectors.joining());
        }

        /**
         * CHARACTERS
         * 
         */
        // Character at a particular index from string
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            // Do something
        }

        /**
         * NUMBER
         */
        // use long for bigger integer without when not using decimal.
        // it also keep format as 100000.. and not exponential (eg. not in
        // 1.0E8 _

        // Max integer
        int maxInteger = Integer.MAX_VALUE;
        System.out.println("maxInteger: " + maxInteger);
        // 2147483647

        // ArrayList vs LinkedList - from
        // https://stackoverflow.com/questions/322715/when-to-use-linkedlist-over-arraylist-in-java
        {
            List<String> searchList = new ArrayList<>();
            List<String> addDeleteList = new LinkedList<>();
        }
        // ArrayList over LinkedList
        /**
         * SEARCH: ArrayList maintains index based system. LinkedList
         * implements a doubly linked list so it goes through each element in
         * doing search.
         */
        // LinkedList over ArrayList
        /**
         * DELETE & INSERT: Each of LinkedList’s elements maintains two
         * pointers (addresses), which point to both neighbor elements in the
         * list. Hence removal only requires a change in the pointer location
         * in the two neighbor nodes (elements) of the node which is going to
         * be removed. While In ArrayList all the elements need to be shifted
         * to fill out the space created by removed element.
         * 
         */

        // StringBuilder and StringBuffer
        /**
         * StringBuffer is synchronized where StringBuilder is not.From
         * StringBuilder API: A mutable sequence of characters. This class
         * provides an API compatible with StringBuffer, but with no guarantee
         * of synchronization. This class is designed for use as a drop-in
         * replacement for StringBuffer in places where the string buffer was
         * being used by a single thread (as is generally the case). Where
         * possible, it is recommended that this class be used in preference
         * to StringBuffer as it will be faster under most implementations.
         */

    }

}
