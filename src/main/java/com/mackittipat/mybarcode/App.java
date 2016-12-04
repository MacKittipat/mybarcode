package com.mackittipat.mybarcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code128Writer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main( String[] args ) throws WriterException, IOException {

        BitMatrix bitMatrix = new Code128Writer().encode("123456789ABC", BarcodeFormat.CODE_128, 150, 80);
        MatrixToImageWriter.writeToStream(bitMatrix, "png", new FileOutputStream(new File("out.png")));
    }
}
