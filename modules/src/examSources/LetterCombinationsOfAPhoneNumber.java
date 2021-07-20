package src.examSources;

/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]

Constraints:
0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
 */

import java.util.*;

public class LetterCombinationsOfAPhoneNumber
{
    public static List<String> letterCombinations(String digits)
    {
        Map<Character, List<String>> keyMap = new HashMap<>();
        List<String> result = new ArrayList<>(), temp = new ArrayList<>();

        keyMap.put('2', Arrays.asList("a", "b", "c"));
        keyMap.put('3', Arrays.asList("d", "e", "f"));
        keyMap.put('4', Arrays.asList("g", "h", "i"));
        keyMap.put('5', Arrays.asList("j", "k", "l"));
        keyMap.put('6', Arrays.asList("m", "n", "o"));
        keyMap.put('7', Arrays.asList("p", "q", "r", "s"));
        keyMap.put('8', Arrays.asList("t", "u", "v"));
        keyMap.put('9', Arrays.asList("w", "x", "y", "z"));

        if(digits.length() == 0) {
            return new ArrayList<>();
        }

        for(int x = 0; x < digits.length(); x++){
            char key = digits.charAt(x);
            if (x==0) {
                result.addAll(keyMap.get(key));
            }
            else {
                for (String original : result) {
                    for (String nxt : keyMap.get(key)) {
                        temp.add(original.concat(nxt));
                    }
                }
                result = temp;
                temp = new ArrayList<>();
            }
        }
        return result;
    }
}