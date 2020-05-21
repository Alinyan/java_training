/**
 * Created by Alina.Zaytseva
 * Date: 19-May-20
 */
public class NegativeTextAnalyzer extends KeywordAnalyzer {

    @Override
    protected String[] getKeywords() {
        return new String[]{":(", "=(", ":|"};
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
