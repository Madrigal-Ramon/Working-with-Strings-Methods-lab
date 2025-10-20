import java.util.Scanner;

public class StringMethod {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Task 1: Working with String Methods
        String originalString = " Welcome to the Java String Lab! ";
        System.out.println("\n=== Task 1: String Methods ===");
        
        // length()
        System.out.println("Length: " + originalString.length());
        
        // charAt()
        System.out.println("Character at index 7: '" + originalString.charAt(7) + "'");
        
        // substring()
        String javaWord = originalString.substring(originalString.indexOf("Java"), originalString.indexOf("Java") + 4);
        System.out.println("Extracted word: " + javaWord);
        
        // toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + originalString.toUpperCase());
        System.out.println("Lowercase: " + originalString.toLowerCase());
        
        // indexOf()
        System.out.println("Index of 'Java': " + originalString.indexOf("Java"));
        
        // contains()
        System.out.println("Contains 'Lab': " + originalString.contains("Lab"));
        
        // replace()
        System.out.println("Replaced string: " + originalString.replace("Java", "Java Programming"));
        
        // split()
        System.out.println("Split words:");
        String[] words = originalString.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        
        // trim()
        System.out.println("Trimmed string: '" + originalString.trim() + "'");
        
        // equals() and equalsIgnoreCase()
        String compareString = "java string lab!";
        System.out.println("Equals (case sensitive): " + originalString.trim().equals(compareString));
        System.out.println("Equals (ignore case): " + originalString.trim().equalsIgnoreCase(compareString));

        // Task 2: Loop Challenges with Strings
        System.out.println("\n=== Task 2: Loop Challenges ===");
        
        // For Loop: Count Vowels
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < originalString.length(); i++) {
            if (vowels.indexOf(originalString.charAt(i)) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        
        // While Loop: Check for Palindrome
        String palindromeCandidate = "racecar";
        boolean isPalindrome = true;
        int left = 0;
        int right = palindromeCandidate.length() - 1;
        
        while (left < right) {
            if (palindromeCandidate.charAt(left) != palindromeCandidate.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Is '" + palindromeCandidate + "' a palindrome? " + isPalindrome);
        
        // Do...While Loop: Input Validation
        Scanner scanner = new Scanner(System.in);
        String userInput;
        do {
            System.out.print("Enter a sentence containing 'Java': ");
            userInput = scanner.nextLine();
        } while (!userInput.contains("Java"));
        System.out.println("Thank you!");
        
        // Task 3: Working with StringBuilder
        System.out.println("\n=== Task 3: StringBuilder ===");
        StringBuilder stringBuilder = new StringBuilder("StringBuilder Lab");
        
        // append()
        stringBuilder.append(" - Learning Java");
        System.out.println("After append: " + stringBuilder);
        
        // insert()
        stringBuilder.insert(stringBuilder.indexOf("Lab") + 3, " is fun");
        System.out.println("After insert: " + stringBuilder);
        
        // delete()
        int learningIndex = stringBuilder.indexOf("Learning");
        if (learningIndex != -1) {
            stringBuilder.delete(learningIndex, learningIndex + "Learning".length());
        }
        System.out.println("After delete: " + stringBuilder);
        
        // reverse()
        stringBuilder.reverse();
        System.out.println("Reversed: " + stringBuilder);
        
        // Task 4: Working with StringBuffer
        System.out.println("\n=== Task 4: StringBuffer ===");
        StringBuffer stringBuffer = new StringBuffer("Multithreading Lab");
        
        // append()
        stringBuffer.append(" - Learning Java");
        System.out.println("After append: " + stringBuffer);
        
        // insert()
        stringBuffer.insert(stringBuffer.indexOf("Lab") + 3, " is fun");
        System.out.println("After insert: " + stringBuffer);
        
        // delete()
        int learningIndexBuffer = stringBuffer.indexOf("Learning");
        if (learningIndexBuffer != -1) {
            stringBuffer.delete(learningIndexBuffer, learningIndexBuffer + "Learning".length());
        }
        System.out.println("After delete: " + stringBuffer);
        
        // reverse()
        stringBuffer.reverse();
        System.out.println("Reversed: " + stringBuffer);
        
        scanner.close();
    }
}