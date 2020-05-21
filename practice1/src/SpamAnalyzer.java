/**
 * Created by Alina.Zaytseva
 * Date: 19-May-20
 */
public class SpamAnalyzer extends KeywordAnalyzer {

    private String[] keywords;

    SpamAnalyzer(String[] keywords) {
        super();
        this.keywords = new String[keywords.length];
        for (int i = 0, keywordsLength = keywords.length; i < keywordsLength; i++) {
            this.keywords[i] = keywords[i];
        }
    }

    @Override
    protected String[] getKeywords() {
        return this.keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
