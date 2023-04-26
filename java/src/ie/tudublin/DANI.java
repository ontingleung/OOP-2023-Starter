package ie.tudublin;


import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {
	private ArrayList<Word> model;
	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}

	public void loadFile(String filename) {
        model = new ArrayList<>();
        String[] lines = loadStrings(filename);
        for (String line : lines) {
            String[] words = split(line.toLowerCase(), ' ');
            for (int i = 0; i < words.length - 1; i++) {
                String w1 = words[i].replaceAll("[^\\w\\s]", "");
                String w2 = words[i + 1].replaceAll("[^\\w\\s]", "");

                Word word = findWord(w1);
                if (word == null) {
                    word = new Word(w1);
                    model.add(word);
                }

                Follow follow = word.findFollow(w2);
                if (follow == null) {
                    follow = new Follow(w2, 1);
                    word.getFollows().add(follow);
                } else {
                    follow.setCount(follow.getCount() + 1);
                }
            }
        }
    }

    public Word findWord(String str) {
        for (Word word : model) {
            if (word.getWord().equals(str)) {
                return word;
            }
        }
        return null;
    }
	
}
