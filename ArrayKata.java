import java.util.Arrays;
public class ArrayKata {
    public int maximumIn(int[] arr) {
        if (arr == null || arr.length == 0) {
            
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int minimumIn(int[] arr) {
        if (arr == null || arr.length == 0) {
            
        }
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public int sumOf(int[] arr) {
        if (arr == null) {
            
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public int sumOfEvenNumbersIn(int[] arr) {
        if (arr == null) {
            
        }
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public int sumOfOddNumbersIn(int[] arr) {
        if (arr == null) {
            
        }
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }

    public int[] maximumAndMinimumOf(int[] arr) {
        if (arr == null || arr.length == 0) {
            
        }
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return new int[]{min, max};
    }

    public int noOfOddNumbersIn(int[] arr) {
        if (arr == null) {
            
        }
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int noOfEvenNumbersIn(int[] arr) {
        if (arr == null) {
            
        }
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int[] evenNumbersIn(int[] arr) {
        if (arr == null) {
            
        }
        int count = noOfEvenNumbersIn(arr);
        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }
        return result;
    }

    public int[] oddNumbersIn(int[] arr) {
        if (arr == null) {
            
        }
        int count = noOfOddNumbersIn(arr);
        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }
        return result;
    }

    public int[] squareNumbersIn(int[] arr) {
        if (arr == null) {
            
        }
        int count = 0;
        for (int num : arr) {
            if (num >= 0) {
          int sqrt = (int) Math.sqrt(num);
           if (sqrt * sqrt == num) {
                    count++;
          }
         }
        }
        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
          if (num >= 0) {
          int sqrt = (int) Math.sqrt(num);
           if (sqrt * sqrt == num) {
               result[index++] = num;
              }
         }
        }
        return result;
    

    
        
    }
} 