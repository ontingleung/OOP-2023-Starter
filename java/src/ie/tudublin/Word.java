//Make a class called Word that has fields for the word (a String) and an ArrayList of type Follow as fields. 
//Make accessor methods, a constructor and a toString Method that will iterate through the follows ArrayList. (See the printout of the model above).

package ie.tudublin;

import java.util.ArrayList;

public class Word {
    private String word;
    private ArrayList<Follow> follows;

    public String getWord() {
        return word;
    }
}
