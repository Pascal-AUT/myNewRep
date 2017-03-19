package at.pll.testappl.Data;

import java.util.ArrayList;

import at.pll.testappl.Msc.PartsOfSpeech;

/**
 * Created by Pascal on 16.03.2017.
 */

public class Word {
    private String transE = null;
    private ArrayList<String> listTransG = null;
    private ArrayList<String> listSynonyms = null;
    private ArrayList<String> listExampleSentences = null;
    private PartsOfSpeech partOfSpeech = null;

    public Word(){
        listTransG = new ArrayList<String>();
        listSynonyms = new ArrayList<String>();
        listExampleSentences = new ArrayList<String>();
    }

    public Word(String transE, String transG){
        this();
        this.transE = transE;
        this.listTransG.add(transG);
    }
}
