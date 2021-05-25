package pdfexample.pdf;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class iText5PdfCreator {
	public Document createDocument(File file) throws IOException, URISyntaxException, DocumentException {
		Document document = new Document();
		try (FileOutputStream fileStream = new FileOutputStream(file)) {
			PdfWriter pdfWriter = PdfWriter.getInstance(document, fileStream);

			pdfWriter.setEncryption("user".getBytes(), "1234".getBytes(), PdfWriter.ALLOW_PRINTING,
					PdfWriter.ENCRYPTION_AES_256);
			document.open();
			Font font = FontFactory.getFont(FontFactory.COURIER, 46, BaseColor.RED);
			Chunk chunk = new Chunk("Hola\n", font);
			document.add(chunk);
			
			Path path = Paths.get(getClass().getResource("/img/lee.jpg").toURI());
			Image img = Image.getInstance(path.toAbsolutePath().toString());
			img.scalePercent(60);
			document.add(img);
			
			document.close();
		}

		return document;
	}

	public static void main(String[] args)
			throws MalformedURLException, IOException, URISyntaxException, DocumentException {
		new iText5PdfCreator().createDocument(new File("C:\\Users\\jairo.buendia.lopez\\OneDrive - Accenture\\Desktop\\temp.pdf"));
	}

}
