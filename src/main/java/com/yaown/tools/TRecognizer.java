package com.yaown.tools;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class TRecognizer implements Recognizer {


    public String convert(File file) throws TesseractException {

        Tesseract tesseract = new Tesseract();
        return tesseract.doOCR(file);

    }

}
