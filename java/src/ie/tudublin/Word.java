package ie.tudublin;

import java.util.ArrayList;

public class Word {
    private String word;
    private ArrayList<Follow> follows;

    public Word(String word) {
        this.word = word;
        this.follows = new ArrayList<>();
    }

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

    public Follow findFollow(String str) {
        for (Follow follow : follows) {
            if (follow.getWord().equals(str)) {
                return follow;
            }
        }
        return null;
    }
}
