public class String_Class {
    public static void main(String[] args) {
        String s1 = "This is a string";
        System.out.println(s1.charAt(14));
        System.out.println(s1.length());
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(5, 10));
        System.out.println(s1.concat(" and this is another string"));
        System.out.println(s1.replace('i', 'o'));
        System.out.println(s1.equals("This is a string"));
        System.out.println(s1.equalsIgnoreCase("this is a string"));
        System.out.println(s1.compareTo("This is a string"));
        System.out.println(s1.compareToIgnoreCase("this is a String"));
        System.out.println(s1.contains("is"));
        System.out.println(s1.startsWith("This"));
        System.out.println(s1.endsWith("string"));
        System.out.println(s1.indexOf('i'));
        System.out.println(s1.indexOf('i', 5));
        // System.out.println(s1.indexOf("is"));
        // System.out.println(s1.indexOf("is", 5));
        System.out.println(s1.lastIndexOf('i'));
        System.out.println("sujal NAYAK".toLowerCase());
        System.out.println("sujal NAYAK".toUpperCase());
        System.out.println("   sujal NAYAK   ".trim());
        
        //VALUEOF METHOD IS USED TO CONVERT ANY DATA TYPE TO STRING
        System.out.println(String.valueOf(123));

        //how to check the datatype of any object/variable in java
        System.out.println(s1.getClass().getName());

        int a = 10;
        String s2 = String.valueOf(a);
        System.out.println(s2.getClass().getName());
    
        //split method returns an array of strings
        String[] arr = s1.split(" ");

        for(String s: arr){
            System.out.println(s);
        }

        //join method is used to join the strings
        String s3 = String.join("_", arr);
        System.out.println(s3);

        //isEmpty method is used to check if the string is empty or not
        System.out.println(s1.isEmpty() + " " + "".isEmpty());

        //intern method is used to return the string from the string pool
        String s4 = new String("Sujal");
        String s5 = s4.intern();
        System.out.println(s4 == s5);   //false
        String s6 = "Sujal";
        System.out.println(s5 == s6);   //true
    }
}

/*
String class in java:

> It is Immutable
> It is final class
> It is present in java.lang package

> String class has lot of methods.

Methods: 

1. charAt(int index)
2. length()
3. substring(int beginIndex)
4. substring(int beginIndex, int endIndex)
5. concat(String str)
6. replace(char oldChar, char newChar)
7. equals(Object obj)
8. equalsIgnoreCase(String anotherString)
9. compareTo(String anotherString)
10. compareToIgnoreCase(String str)
11. contains(CharSequence s)
12. startsWith(String prefix)
13. endsWith(String suffix)
14. indexOf(int ch)
15. indexOf(int ch, int fromIndex)
16. indexOf(String str)
17. indexOf(String str, int fromIndex)
18. lastIndexOf(int ch)
19. lastIndexOf(int ch, int fromIndex)
20. lastIndexOf(String str)
21. lastIndexOf(String str, int fromIndex)
22. toLowerCase()
23. toUpperCase()
24. trim()
25. valueOf(int i)
16. split(String regex)
27. join(CharSequence delimiter, CharSequence... elements)
29. isEmpty()
30. intern()


---

Problem: Text Analyzer

You are tasked with creating a text analyzer program that takes a paragraph as input and performs various operations using the provided methods. The program should be able to process the paragraph and provide insightful information about it. Your task is to implement this text analyzer.

Here are the requirements:

1. Input Paragraph: Accept a multi-sentence paragraph as input from the user.

2. Character Analysis:
   - Implement a function that calculates and displays the number of characters (excluding spaces) in the paragraph using the 'length()' method.

3. Word Extraction:
   - Implement a function that extracts individual words from the paragraph. Split the paragraph into words using the 'split(String regex)' method with space as the delimiter.
   - Calculate and display the total number of words in the paragraph.

4. Search and Replace:
   - Implement a function that prompts the user to input a character to be replaced and a character to replace it with.
   - Use the 'replace(char oldChar, char newChar)' method to replace all occurrences of the specified character in the paragraph.
   - Display the modified paragraph after replacement.

5. Substring Analysis:
   - Implement a function that prompts the user to input a starting index and an ending index for substring extraction.
   - Extract and display the substring using the 'substring(int beginIndex, int endIndex)' method.

6. Case Conversion:
   - Implement a function that converts the entire paragraph to lowercase using the 'toLowerCase()' method and displays the result.

7. Search and Indexing:
   - Implement a function that prompts the user to input a word to search for in the paragraph.
   - Use the 'indexOf(String str)' method to find the first occurrence of the input word and display its index.
   - If the word is not found, display a message indicating that.

8. Trimming:
   - Implement a function that removes any leading and trailing spaces from the paragraph using the 'trim()' method.
   - Display the trimmed paragraph.

9. Text Joining:
   - Implement a function that joins the words extracted earlier into a new paragraph using the 'join(CharSequence delimiter, CharSequence... elements)' method.
   - Prompt the user to input a delimiter to be used for joining.

10. Empty Check:
    - Implement a function that checks whether the paragraph is empty (contains no characters) using the 'isEmpty()' method.
    - Display the result.

11. Case Insensitive Comparison:
    - Implement a function that prompts the user to input another paragraph.
    - Use the 'equalsIgnoreCase(String anotherString)' method to compare the two paragraphs without considering case.
    - Display whether the two paragraphs are equal or not.

12. Interning Strings:
    - Implement a function that interns the current paragraph using the 'intern()' method.
    - Display the interned paragraph.

Your task is to design and implement the text analyzer program that fulfills these requirements. Use the provided methods to perform the necessary operations on the input paragraph.

---

Sample Input Paragraph:
The quick brown fox jumps over the lazy dog. The dog barks and the fox runs away.

1. Character Analysis:
   - Input: (No user input needed)
   - Output: Number of characters (excluding spaces): 64

2. Word Extraction:
   - Input: (No user input needed)
   - Output: Total number of words: 16

3. Search and Replace:
   - Input: Replace 'o' with 'X'
   - Output: Modified paragraph: "The quick brXwn fXx jumps Xver the lazy dXg. The dXg barks and the fXx runs away."

4. Substring Analysis:
   - Input: Starting index: 10, Ending index: 24
   - Output: Substring: "brown fox jumps"

5. Case Conversion:
   - Input: (No user input needed)
   - Output: Lowercase paragraph: "the quick brown fox jumps over the lazy dog. the dog barks and the fox runs away."

6. Search and Indexing:
   - Input: Search for word: "dog"
   - Output: Index of "dog": 40

7. Trimming:
   - Input: (No user input needed)
   - Output: Trimmed paragraph: "The quick brown fox jumps over the lazy dog. The dog barks and the fox runs away."

8. Text Joining:
   - Input: Delimiter: " | "
   - Output: Joined paragraph: "The | quick | brown | fox | jumps | over | the | lazy | dog. | The | dog | barks | and | the | fox | runs | away."

9. Empty Check:
   - Input: (No user input needed)
   - Output: The paragraph is not empty.

10. Case Insensitive Comparison:
    - Input: Enter another paragraph: "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG. THE DOG BARKS AND THE FOX RUNS AWAY."
    - Output: The two paragraphs are equal (case-insensitive).

11. Interning Strings:
    - Input: (No user input needed)
    - Output: Interned paragraph: "The quick brown fox jumps over the lazy dog. The dog barks and the fox runs away."

*/