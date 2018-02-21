package io.zipcoder;

public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        Integer count = 0;

        String[] inputToArray = input.split(" ");
        for (Integer i = 0; i < inputToArray.length; i++) {
            String currentWord = inputToArray[i];
            char lastIndexOfCurrentWord = currentWord.charAt(currentWord.length() -1);
            if (lastIndexOfCurrentWord == 'y' || lastIndexOfCurrentWord == 'z'){
                count++;
            }
        }
        return count;
    }
    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : withoutString("Hello there", "llo") // Should return "He there"
     *           withoutString("Hello there", "e") //  Should return "Hllo thr"
     *           withoutString("Hello there", "x") // Should return "Hello there"
     *
     */
    public String withoutString(String base, String strToRemove){

        StringBuilder stringToRemoveValuesFrom = new StringBuilder(base);

        for (int i = 0; i <= stringToRemoveValuesFrom.length()-strToRemove.length(); i++){
            if (stringToRemoveValuesFrom.substring(i, strToRemove.length()+i).equals(strToRemove)) {
                stringToRemoveValuesFrom.delete(i,strToRemove.length()+i);
                i--;
            }
        }

        return stringToRemoveValuesFrom.toString();


/*owen told me this and he got it from peers, from java API:
       return base.replace(strToRemove,"");

        */


//
//        if (remove.length() > 1){
//            char[] removeToCharArray = remove.toCharArray();
//            for (Integer i = 0; i < base.length(); i++){
//                if (!removeToCharArray.contains(char)){
//
//                }
//            }
//        }
//
//        for {
//            char charToCheck = base.charAt(i);
//            if (removeToCharArray)
//        }

    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : equalIsNot("This is not")  // Should return false
     *           equalIsNot("This is notnot") // Should return true
     *           equalIsNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean equalIsNot(String input){

        StringBuilder stringToCheckValuesFrom = new StringBuilder(input);

        String is = "is";
        String not = "not";

        Integer countIs = 0;

        for (int i = 0; i <= stringToCheckValuesFrom.length()-is.length(); i++){
            if (stringToCheckValuesFrom.substring(i, is.length()+i).equals(is)) {
                countIs++;

            }
        }

        Integer countNot = 0;

        for (int i = 0; i <= stringToCheckValuesFrom.length()-not.length(); i++){
            if (stringToCheckValuesFrom.substring(i, not.length()+i).equals(not)) {
                countNot++;

            }
        }

        Boolean answer = false;
        if (countIs == countNot){
            answer = true;
        }

        return answer;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        Boolean answer = false;

        return answer;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        return null;
    }
}
