Java Arrays and Algorithms
Welcome to the Java Arrays and Algorithms repository!
This repository covers various array operations and algorithms, including linear search, binary search, Kadane's algorithm, and subarray-related problems.
Each section includes explanations, examples, and practice questions to help you understand and apply these concepts.

Table of Contents
Introduction
Linear Search
Binary Search
Kadane's Algorithm
Subarray Related Problems
Practice Questions
Introduction
Arrays are a fundamental data structure in Java, used to store elements of the same type. 
They are essential for various algorithms and problem-solving techniques. 
This repository provides implementations and explanations of common array algorithms.

Linear Search
Explanation
Linear search is a simple algorithm to find an element in an array. 
It sequentially checks each element of the array until a match is found or the whole array has been searched.

Implementation
java
Copy code
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int target = 6;
        int result = linearSearch(arr, target);
        System.out.println("Element found at index: " + result);
    }
}
Example
Input: arr = [2, 4, 6, 8, 10], target = 6
Output: Element found at index: 2

Binary Search
Explanation
Binary search is an efficient algorithm to find an element in a sorted array.
It works by repeatedly dividing the search interval in half.

Implementation
java
Copy code
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int target = 6;
        int result = binarySearch(arr, target);
        System.out.println("Element found at index: " + result);
    }
}
Example
Input: arr = [2, 4, 6, 8, 10], target = 6
Output: Element found at index: 2

Kadane's Algorithm
Explanation
Kadane's algorithm is used to find the maximum sum of a contiguous subarray in an array of integers.

Implementation
java
Copy code
public class KadanesAlgorithm {
    public static int maxSubArraySum(int[] arr) {
        int maxSoFar = arr[0], maxEndingHere = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArraySum(arr);
        System.out.println("Maximum subarray sum is: " + result);
    }
}
Example
Input: arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: Maximum subarray sum is: 6

Subarray Related Problems
Explanation
Subarray problems involve finding or manipulating subarrays within an array.
Common problems include finding the maximum sum subarray, checking for subarrays with specific properties, etc.

Example Problem: Finding All Subarrays
java
Copy code
public class SubarrayExamples {
    public static void printAllSubarrays(int[] arr) {
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printAllSubarrays(arr);
    }
}
Example
Input: arr = [1, 2, 3]
Output:

Copy code
1 
1 2 
1 2 3 
2 
2 3 
3 
Practice Questions
Implement a function to find the minimum element in a rotated sorted array.
Write a program to find the longest increasing subarray in a given array.
Implement a function to find the subarray with the given sum in an array of non-negative integers.
Write a program to count the number of subarrays with a sum equal to a given value.
Implement a function to find the product of all elements in a subarray of a given array.
Feel free to explore and modify the code to enhance your understanding of these algorithms and problems!

Contributing
Contributions are welcome! If you have any suggestions or improvements, feel free to create a pull request.

Happy coding! If you have any questions, please feel free to ask.
