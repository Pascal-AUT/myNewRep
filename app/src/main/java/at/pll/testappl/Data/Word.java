package at.pll.testappl.Data;

import java.util.ArrayList;

import at.pll.testappl.Msc.PartsOfSpeech;

/**
 * Created by Pascal on 16.03.2017.
 */

public class Word {
    private String transE = null;
    private ArrayList<String> transG = null;
    private ArrayList<String> synonyms = null;
    private ArrayList<String> exampleSentences = null;
    private PartsOfSpeech partOfSpeech = null;

    public Word(String transE, String transG){
        this();
        this.transE = transE;
        this.transG.add(transG);
    }

    public Word(){
        transG = new ArrayList<String>();
        synonyms = new ArrayList<String>();
        exampleSentences = new ArrayList<String>();
    }

}
