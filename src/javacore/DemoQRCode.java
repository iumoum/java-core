package javacore;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.*;

public class DemoQRCode {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String details = "My name is Jiwan Kim";

        ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();

        File qrCode = new File("C:/Users/John/Desktop/KJW_PROJECT/java-core/qrcodes/intro.jpg");

        FileOutputStream qrCodeStream = new FileOutputStream(qrCode);

        qrCodeStream.write(out.toByteArray());
        qrCodeStream.flush();
    }
}
