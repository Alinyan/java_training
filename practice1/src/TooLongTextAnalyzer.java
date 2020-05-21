/**
 * Created by Alina.Zaytseva
 * Date: 19-May-20
 */
public class TooLongTextAnalyzer implements TextAnalyzer{

    private int maxLength;

    TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > this.maxLength)
            return Label.TOO_LONG;
        return Label.OK;
    }
}