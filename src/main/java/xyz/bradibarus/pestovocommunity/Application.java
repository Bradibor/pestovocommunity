package xyz.bradibarus.pestovocommunity;

import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import xyz.bradibarus.pestovocommunity.repository.MemberRepository;

import java.io.FileOutputStream;
import java.io.OutputStream;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    MemberRepository memberRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        OutputStream outputStream = new FileOutputStream("C:\\Users\\bradi\\IdeaProjects\\pestovocommunity\\src\\main\\resources\\kek.pdf");
        PdfDocument pdfDocument = new PdfDocument();
        PdfWriter pdfWriter = PdfWriter.getInstance(pdfDocument, outputStream);
        PdfPTable pdfPTable = new PdfPTable(7);
    }
}
