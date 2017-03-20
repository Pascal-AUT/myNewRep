package at.pll.testappl.Data;

import java.util.TreeSet;

/**
 * Created by Pascal on 16.03.2017.
 */

public class Unit {
    private String name = null;
    private TreeSet<Word> tsWords = null;

    public Unit(String name){
        this.name = name;
        tsWords = new TreeSet<Word>();
    }

    public Unit(String name, TreeSet<Word> tsWords){
        this(name);
        this.tsWords.addAll(tsWords);
    }

    public boolean addWord(Word word){
        return tsWords.add(word);
    }

    public int getNumberOfWords(){
        return tsWords.size();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
