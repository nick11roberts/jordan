package io.nick11roberts.github.brain;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * Created by nick on 6/22/15.
 */

@Entity
public class Vertex {

    private Vertex(){}

    public Vertex(String word){
        setWord(word);
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord(){
        return word;
    }

    @Id
    @Index
    private String word; //Must be unique
}
