import com.yaown.tools.TRecognizer;
import net.sourceforge.tess4j.TesseractException;
import org.testng.annotations.Test;

import java.io.File;

public class TRecognizerTest {

    @Test
    public void test() throws TesseractException {
        TRecognizer tRecognizer = new TRecognizer();
        File file = new File("invoice.jpg");
        System.out.println(file.getAbsolutePath());
        System.out.println(tRecognizer.convert(new File("invoice.jpg")));
    }

}
