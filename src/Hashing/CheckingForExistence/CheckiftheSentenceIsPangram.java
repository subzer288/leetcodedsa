package Hashing.CheckingForExistence;

//A pangram is a sentence where every letter of the English alphabet appears at least once.
//
//Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
//
//Example 1:
//Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//Output: true
//Explanation: sentence contains at least one of every letter of the English alphabet.
//
//Example 2:
//Input: sentence = "leetcode"
//Output: false

import java.util.HashSet;
import java.util.Set;

public class CheckiftheSentenceIsPangram {
    public static void main(String[] args){
        Set<Character> set = new HashSet<>();
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        for(int i = 0; i<sentence.length(); i++){
            set.add(sentence.charAt(i));
        }
        System.out.println(set.size()==26?true:false);
    }
}
