package impl.util;

import impl.AnalyzeText;

public class WordCounter implements AnalyzeText {
    private String text;

    public WordCounter(String text) {
        this.text = text;
    }

    private Integer getWordCount() {
        return 0;
    }

    @Override
    public void analyze() {
        System.out.println(getWordCount());
    }
}
