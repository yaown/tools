package com.yaown.tools;

import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public interface Recognizer {

    public String convert(File file) throws TesseractException;

}
