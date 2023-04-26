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

    public void setWord(String word) {
        this.word = word;
    }

    public ArrayList<Follow> getFollows() {
        return follows;
    }

    public void setFollows(ArrayList<Follow> follows) {
        this.follows = follows;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(word).append(": ");
        for (Follow follow : follows) {
            sb.append(follow.toString()).append(" ");
        }
        return sb.toString();
    }
}
