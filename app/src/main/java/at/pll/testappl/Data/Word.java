package at.pll.testappl.Data;

import android.support.annotation.NonNull;
import android.util.Log;

import java.util.ArrayList;

import at.pll.testappl.Msc.PartsOfSpeech;

/**
 * Created by Pascal on 16.03.2017.
 */

public class Word implements Comparable<Word>{
    private String transE = null;
    private ArrayList<String> listTransG = null;
    private ArrayList<String> listSynonyms = null;
    private ArrayList<String> listExampleSentences = null;
    private PartsOfSpeech partOfSpeech = null;

    private  Word(){
        listTransG = new ArrayList<String>();
        listSynonyms = new ArrayList<String>();
        listExampleSentences = new ArrayList<String>();
    }

    public Word(String transE, String transG){
        this();
        this.transE = transE;
        this.listTransG.add(transG);
    }

    public void addTranslationGerman(String transG){
        this.listTransG.add(transG);
    }

    public void addSynonym(String synonym){
        this.listSynonyms.add(synonym);
    }

    public void addExampleSentence(String exampleSentence){
        this.listExampleSentences.add(exampleSentence);
    }

    public String getTransE(){
        return this.transE;
    }

    public void setTransE(String transE){
        this.transE = transE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word = (Word) o;
        return transE.equals(word.transE);
    }

    @Override
    public int hashCode() {
        return transE.hashCode();
    }

    @Override
    public int compareTo(@NonNull Word w) {
        return (this.transE).compareToIgnoreCase(w.getTransE());
    }
}
