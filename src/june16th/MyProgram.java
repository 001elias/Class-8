package june16th;

import java.util.Arrays;

public class MyProgram {
	 public static void main(String[] args) {
	        // 1
	        int[] numbers = {5, 10, 15, 20, 25};
	        double average = 0;
	        for (int num : numbers) {
	            average += num;
	        }
	        average /= numbers.length;
	        System.out.println("Average: " + average);

	        System.out.println();

	        // 2
	        int[] array = {1, 2, 3, 4, 5};
	        int target = 3;
	        boolean containsValue = false;
	        for (int num : array) {
	            if (num == target) {
	                containsValue = true;
	                break;
	            }
	        }
	        System.out.println("Contains value " + target + ": " + containsValue);

	        System.out.println();

	        // 3
	        int[] array2 = {10, 20, 30, 40, 50};
	        int element = 30;
	        int index = -1;
	        for (int i = 0; i < array2.length; i++) {
	            if (array2[i] == element) {
	                index = i;
	                break;
	            }
	        }
	        System.out.println("Index of " + element + ": " + index);

	        System.out.println();

	        // 4
	        int[] array3 = {1, 2, 3, 4, 5};
	        int elementToRemove = 3;
	        int[] newArray = new int[array3.length - 1];
	        int newIndex = 0;
	        for (int i = 0; i < array3.length; i++) {
	            if (array3[i] != elementToRemove) {
	                newArray[newIndex] = array3[i];
	                newIndex++;
	            }
	        }
	        System.out.print("Array after removing " + elementToRemove + ": ");
	        for (int num : newArray) {
	            System.out.print(num + " ");
	        }
	        
	        System.out.println();

	        // 5
	        int[] sourceArray = {1, 2, 3, 4, 5};
	        int[] destinationArray = new int[sourceArray.length];
	        for (int i = 0; i < sourceArray.length; i++) {
	            destinationArray[i] = sourceArray[i];
	        }
	        System.out.print("Copied array: ");
	        for (int num : destinationArray) {
	            System.out.print(num + " ");
	        }
	        
	        System.out.println();

	        // 6
	        int[] array4 = {1, 2, 3, 4, 5};
	        int elementToInsert = 10;
	        int position = 2;
	        int[] newArray2 = new int[array4.length + 1];
	        int insertIndex = 0;
	        for (int i = 0; i < array4.length; i++) {
	            if (i == position) {
	                newArray2[insertIndex] = elementToInsert;
	                insertIndex++;
	            }
	            newArray2[insertIndex] = array4[i];
	            insertIndex++;
	        }
	        System.out.print("Array after inserting " + elementToInsert + " at position " + position + ": ");
	        for (int num : newArray2) {
	            System.out.print(num + " ");
	        }
	        
	        System.out.println();

	        // 7
	        int[] numbers2 = {15, 7, 25, 10, 2};
	        int max = numbers2[0];
	        int min = numbers2[0];
	        for (int i = 1; i < numbers2.length; i++) {
	            if (numbers2[i] > max) {
	                max = numbers2[i];
	            }
	            if (numbers2[i] < min) {
	                min = numbers2[i];
	            }
	        }
	        System.out.println("Maximum value: " + max);
	        System.out.println("Minimum value: " + min);

	        System.out.println();

	        // 8
	        int[] array5 = {1, 2, 3, 4, 5};
	        int startIndex = 0;
	        int endIndex = array5.length - 1;
	        while (startIndex < endIndex) {
	            int temp = array5[startIndex];
	            array5[startIndex] = array5[endIndex];
	            array5[endIndex] = temp;
	            startIndex++;
	            endIndex--;
	        }
	        System.out.print("Reversed array: ");
	        for (int num : array5) {
	            System.out.print(num + " ");
	        }
	        
	        System.out.println();

	        // 9
	        int[] array6 = {1, 2, 3, 4, 1, 5, 2};
	        System.out.print("Duplicate values: ");
	        for (int i = 0; i < array6.length - 1; i++) {
	            for (int j = i + 1; j < array6.length; j++) {
	                if (array6[i] == array6[j]) {
	                    System.out.print(array6[i] + " ");
	                    break;
	                }
	            }
	        }
	        
	        System.out.println();

	        // 10
	        String[] array7 = {"apple", "banana", "orange", "apple", "mango"};
	        System.out.print("Duplicate values: ");
	        for (int i = 0; i < array7.length - 1; i++) {
	            for (int j = i + 1; j < array7.length; j++) {
	                if (array7[i].equals(array7[j])) {
	                    System.out.print(array7[i] + " ");
	                    break;
	                }
	            }
	        }
	        System.out.println();

	        // 11
	        String[] array8 = {"apple", "banana", "orange", "kiwi"};
	        String[] array9 = {"orange", "kiwi", "grapefruit", "pear"};
	        System.out.print("Common elements: ");
	        for (String str1 : array8) {
	            for (String str2 : array9) {
	                if (str1.equals(str2)) {
	                    System.out.print(str1 + " ");
	                    break;
	                }
	            }
	        }

	        System.out.println();

	        // 12
	        int[] array10 = {1, 2, 3, 4, 5};
	        int[] array11 = {4, 5, 6, 7, 8};
	        System.out.print("Common elements: ");
	        for (int num1 : array10) {
	            for (int num2 : array11) {
	                if (num1 == num2) {
	                    System.out.print(num1 + " ");
	                    break;
	                }
	            }
	        }

	        System.out.println();

	        // 13
	        int[] array12 = {1, 2, 3, 4, 1, 5, 2};
	        int[] newArray3 = new int[array12.length];
	        int uniqueIndex = 0;
	        for (int i = 0; i < array12.length; i++) {
	            boolean isDuplicate = false;
	            for (int j = 0; j < uniqueIndex; j++) {
	                if (array12[i] == newArray3[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            if (!isDuplicate) {
	                newArray3[uniqueIndex] = array12[i];
	                uniqueIndex++;
	            }
	        }
	        System.out.print("Array after removing duplicates: ");
	        for (int i = 0; i < uniqueIndex; i++) {
	            System.out.print(newArray3[i] + " ");
	        }
	        
	        System.out.println();

	        // 14
	        int[] array13 = {5, 2, 10, 8, 3};
	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;
	        for (int num : array13) {
	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num < largest) {
	                secondLargest = num;
	            }
	        }
	        System.out.println("Second largest element: " + secondLargest);

	        System.out.println();

	        // 15.
	        int[] array14 = {5, 2, 10, 8, 3};
	        int smallest = Integer.MAX_VALUE;
	        int secondSmallest = Integer.MAX_VALUE;
	        for (int num : array14) {
	            if (num < smallest) {
	                secondSmallest = smallest;
	                smallest = num;
	            } else if (num < secondSmallest && num > smallest) {
	                secondSmallest = num;
	            }
	        }
	        System.out.println("Second smallest element: " + secondSmallest);

	        System.out.println();

	        // 16. 
	        int[][] matrix1 = {{1, 2}, {3, 4}};
	        int[][] matrix2 = {{5, 6}, {7, 8}};
	        int rows = matrix1.length;
	        int columns = matrix1[0].length;
	        int[][] sumMatrix = new int[rows][columns];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }
	        System.out.println("Sum matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(sumMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }

	        System.out.println();

	        // 17. 
	        int[] array15 = {1, 2, 3};
	        int[] array16 = {1, 2, 3};
	        boolean equalArrays = true;
	        if (array15.length != array16.length) {
	            equalArrays = false;
	        } else {
	            for (int i = 0; i < array15.length; i++) {
	                if (array15[i] != array16[i]) {
	                    equalArrays = false;
	                    break;
	                }
	            }
	        }
	        System.out.println("Arrays are equal: " + equalArrays);

	        System.out.println();

	        // 18. 
	        int[] array17 = {1, 2, 4, 5, 6};
	        int n = array17.length + 1;
	        int totalSum = (n * (n + 1)) / 2;
	        int arraySum = 0;
	        for (int num : array17) {
	            arraySum += num;
	        }
	        int missingNumber = totalSum - arraySum;
	        System.out.println("Missing number: " + missingNumber);

	        System.out.println();

	        // 19. 
	        int[] array18 = {0, 5, 0, 3, 0, 8};
	        int nonZeroIndex = 0;
	        for (int i = 0; i < array18.length; i++) {
	            if (array18[i] != 0) {
	                int temp = array18[i];
	                array18[i] = array18[nonZeroIndex];
	                array18[nonZeroIndex] = temp;
	                nonZeroIndex++;
	            }
	        }
	        System.out.print("Array after moving zeros to the end: ");
	        for (int num : array18) {
	            System.out.print(num + " ");
	        }

	        System.out.println();

	        // 20.
	        int[] array19 = {1, 2, 3, 4, 5, 6};
	        int evenCount = 0;
	        int oddCount = 0;
	        for (int num : array19) {
	            if (num % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }
	        System.out.println("Number of even integers: " + evenCount);
	        System.out.println("Number of odd integers: " + oddCount);
	        System.out.println();

	        // 21. 
	        int[] array20 = {10, 5, 3, 8, 12};
	        int maxVal = array20[0];
	        int minVal = array20[0];
	        for (int i = 1; i < array20.length; i++) {
	            if (array20[i] > maxVal) {
	                maxVal = array20[i];
	            }
	            if (array20[i] < minVal) {
	                minVal = array20[i];
	            }
	        }
	        int difference = maxVal - minVal;
	        System.out.println("Difference between largest and smallest values: " + difference);

	        System.out.println();

	        // 22.
	        int[] array21 = {10, 5, 3, 8, 12};
	        int sum = 0;
	        maxVal = array21[0];
	        minVal = array21[0];
	        for (int i = 0; i < array21.length; i++) {
	            if (array21[i] > maxVal) {
	                maxVal = array21[i];
	            }
	            if (array21[i] < minVal) {
	                minVal = array21[i];
	            }
	            sum += array21[i];
	        }
	        int average1 = (sum - maxVal - minVal) / (array21.length - 2);
	        System.out.println("Average value (excluding largest and smallest): " + average1);

	        System.out.println();

	        // 23. 
	        int[] array22 = {1, 2, 3, 4, 5};
	        boolean hasZeroOrNegativeOne = false;
	        for (int num : array22) {
	            if (num == 0 || num == -1) {
	                hasZeroOrNegativeOne = true;
	                break;
	            }
	        }
	        System.out.println("Array contains 0 or -1: " + hasZeroOrNegativeOne);

	        System.out.println();

	        // 24. 
	        int[] array23 = {10, 20, 10, 30, 40, 10};
	        int sumOfTens = 0;
	        for (int num : array23) {
	            if (num == 10) {
	                sumOfTens += num;
	            }
	        }
	        boolean sumIsThirty = sumOfTens == 30;
	        System.out.println("Sum of all 10's is exactly 30: " + sumIsThirty);

	        System.out.println();

	        // 25.
	        int[] array24 = {10, 20, 65, 30, 40, 77};
	        boolean contains65And77 = false;
	        for (int num : array24) {
	            if (num == 65 || num == 77) {
	                contains65And77 = true;
	                break;
	            }
	        }
	        System.out.println("Array contains 65 and 77: " + contains65And77);

	        System.out.println();

	        // 26.
	        int[] array25 = {20, 20, 30, 40, 50, 50, 50};
	        int updatedLength = array25.length;
	        for (int i = 0; i < updatedLength - 1; i++) {
	            for (int j = i + 1; j < updatedLength; j++) {
	                if (array25[i] == array25[j]) {
	                    for (int k = j; k < updatedLength - 1; k++) {
	                        array25[k] = array25[k + 1];
	                    }
	                    updatedLength--;
	                    j--;
	                }
	            }
	        }
	        System.out.println("New length of the array after removing duplicates: " + updatedLength);

	        System.out.println();

	        // 27. 
	        int[] array26 = {49, 1, 3, 200, 2, 4, 70, 5};
	        Arrays.sort(array26);
	        int longestSequenceLength = 1;
	        int currentSequenceLength = 1;
	        for (int i = 1; i < array26.length; i++) {
	            if (array26[i] == array26[i - 1] + 1) {
	                currentSequenceLength++;
	            } else if (array26[i] != array26[i - 1]) {
	                currentSequenceLength = 1;
	            }
	            if (currentSequenceLength > longestSequenceLength) {
	                longestSequenceLength = currentSequenceLength;
	            }
	        }
	        System.out.println("Length of the longest consecutive elements sequence: " + longestSequenceLength);

	        System.out.println();

	        // 28.
	        int[] array27 = {1, 2, 4, 5, 6};
	        int targetValue = 6;
	        boolean foundSum = false;
	        for (int i = 0; i < array27.length - 1; i++) {
	            for (int j = i + 1; j < array27.length; j++) {
	                if (array27[i] + array27[j] == targetValue) {
	                    foundSum = true;
	                    break;
	                }
	            }
	            if (foundSum) {
	                break;
	            }
	        }
	        System.out.println("Array contains two elements that sum to the target value: " + foundSum);

	        System.out.println();

	        // 29. 
	        int[] array28 = {1, 2, 3, 4, 5, 6, 7};
	        int targetSum = 10;
	        System.out.println("Combinations of four elements with a sum of " + targetSum + ":");
	        for (int i = 0; i < array28.length - 3; i++) {
	            for (int j = i + 1; j < array28.length - 2; j++) {
	                for (int k = j + 1; k < array28.length - 1; k++) {
	                    for (int l = k + 1; l < array28.length; l++) {
	                        if (array28[i] + array28[j] + array28[k] + array28[l] == targetSum) {
	                            System.out.println(array28[i] + " " + array28[j] + " " + array28[k] + " " + array28[l]);
	                        }
	                    }
	                }
	            }
	        }

	        System.out.println();

	        // 30.
	        int[] array29 = {4, 6, 3, 7, 2, 5};
	        int triangleCount = 0;
	        Arrays.sort(array29);
	        for (int i = 0; i < array29.length - 2; i++) {
	            int k = i + 2;
	            for (int j = i + 1; j < array29.length - 1; j++) {
	                while (k < array29.length && array29[i] + array29[j] > array29[k]) {
	                    k++;
	                }
	                triangleCount += k - j - 1;
	            }
	        }
	        System.out.println("Number of possible triangles: " + triangleCount);
	        System.out.println();

	        // 31. 
	        int[] array30 = {1, 2, 3, 4, 5};
	        int temp = array30[array30.length - 1];
	        for (int i = array30.length - 1; i > 0; i--) {
	            array30[i] = array30[i - 1];
	        }
	        array30[0] = temp;
	        System.out.println("Cyclically rotated array: " + Arrays.toString(array30));

	        System.out.println();

	        // 32.
	        int[] array31 = {5, 6, 7, 8, 9, 10, 1, 2, 3};
	        int rotationCount = 0;
	        for (int i = 0; i < array31.length - 1; i++) {
	            if (array31[i] > array31[i + 1]) {
	                rotationCount = i + 1;
	                break;
	            }
	        }
	        System.out.println("Rotation count in the rotated sorted array: " + rotationCount);

	        System.out.println();

	        // 33. 
	        int[] array32 = {-1, 2, -3, 4, -5, 6};
	        int[] arrangedArray1 = new int[array32.length];
	        int negativeIndex = 0;
	        int positiveIndex = array32.length - 1;
	        for (int num : array32) {
	            if (num < 0) {
	                arrangedArray1[negativeIndex] = num;
	                negativeIndex++;
	            } else {
	                arrangedArray1[positiveIndex] = num;
	                positiveIndex--;
	            }
	        }
	        System.out.println("Array with negative integers before positive integers: " + Arrays.toString(arrangedArray1));

	        System.out.println();

	        // 34.
	        int[] array33 = {-1, 2, -3, 4, -5, 6};
	        int[] arrangedArray2 = new int[array33.length];
	        negativeIndex = 0;
	        positiveIndex = array33.length - 1;
	        for (int num : array33) {
	            if (num >= 0) {
	                arrangedArray2[negativeIndex] = num;
	                negativeIndex++;
	            } else {
	                arrangedArray2[positiveIndex] = num;
	                positiveIndex--;
	            }
	        }
	        System.out.println("Array with positive integers before negative integers: " + Arrays.toString(arrangedArray2));

	        System.out.println();

	        // 35. 
	        int[] array34 = {5, 2, 8, 3, 1, 4};
	        Arrays.sort(array34);
	        int[] sortedArray = new int[array34.length];
	        int start = 0;
	        int end = array34.length - 1;
	        for (int i = 0; i < array34.length; i++) {
	            if (i % 2 == 0) {
	                sortedArray[i] = array34[end];
	                end--;
	            } else {
	                sortedArray[i] = array34[start];
	                start++;
	            }
	        }
	        System.out.println("Sorted array: " + Arrays.toString(sortedArray));

	        System.out.println();

	        // 36. 
	        int[] array35 = {0, 1, 0, 1, 1, 0};
	        int left = 0;
	        int right = array35.length - 1;
	        while (left < right) {
	            while (array35[left] == 0 && left < right) {
	                left++;
	            }
	            while (array35[right] == 1 && left < right) {
	                right--;
	            }
	            if (left < right) {
	                array35[left] = 0;
	                array35[right] = 1;
	                left++;
	                right--;
	            }
	        }
	        System.out.println("Separated array: " + Arrays.toString(array35));

	        System.out.println();

	        // 37. 
	        int[] array36 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	        int evenIndex = 0;
	        int oddIndex = array36.length - 1;
	        int[] separatedArray = new int[array36.length];
	        for (int num : array36) {
	            if (num % 2 == 0) {
	                separatedArray[evenIndex] = num;
	                evenIndex++;
	            } else {
	                separatedArray[oddIndex] = num;
	                oddIndex--;
	            }
	        }
	        System.out.println("Separated array with even numbers first, then odd numbers: " + Arrays.toString(separatedArray));

	        System.out.println();

	        // 38.
	        int[] array37 = {4, 6, 8, 2, 7, 1, 9};
	        int maxFromRight = array37[array37.length - 1];
	        array37[array37.length - 1] = -1;
	        for (int i = array37.length - 2; i >= 0; i--) {
	            int temp2 = array37[i];
	            array37[i] = maxFromRight;
	            if (temp2 > maxFromRight) {
	                maxFromRight = temp2;
	            }
	        }
	        System.out.println("Array with elements replaced by the next greatest element: " + Arrays.toString(array37));
	    }
	}


