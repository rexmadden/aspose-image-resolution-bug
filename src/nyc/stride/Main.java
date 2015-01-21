package nyc.stride;

import com.aspose.words.Document;
import com.aspose.words.License;
import com.aspose.words.LoadOptions;
import com.aspose.words.SaveFormat;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;

public class Main {

    public static void main(String[] args) throws Exception {
        Document doc;

        LoadOptions loadOptions = new LoadOptions();
        loadOptions.setEncoding(Charset.forName("UTF-8"));
        doc = new Document(new ByteArrayInputStream(("" +
                "<html>\n" +
                "<head>\n" +
                "</head>\n" +
                "<body>\n" +
                "<p>test</p>" +
                "<img src=\"http://lorempixel.com/600/800/\">" +
                "<p>This image was 600x800. If you do a Save As on the image in the Word doc, it will be smaller because\n" +
                "of the 92dpi conversion. The Word doc will enlarge it to be 600x800, which will create fuzziness. " +
                "You can also go to format picture and see that it is scaled to 75%\n" +
                "</p></body>\n" +
                "</html>" +
                "").getBytes()), loadOptions);
        doc.save("./image_bug.docx", SaveFormat.DOCX);

    }
}
