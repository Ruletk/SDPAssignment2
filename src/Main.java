import document.IDocument;
import document.factory.DocumentFactoryProducer;
import document.factory.IDocumentFactory;

public class Main {
    public static void main(String[] args) {
        IDocumentFactory pdfFactory = DocumentFactoryProducer.getFactory("PDF");
        IDocumentFactory wordFactory = DocumentFactoryProducer.getFactory("Word");

        IDocument pdfDocument = pdfFactory.createDocument();
        IDocument wordDocument = wordFactory.createDocument();

        System.out.println(pdfDocument.fill("Hello, PDF document!"));
        System.out.println(wordDocument.fill("Hello, Word document!"));

        pdfDocument.create();
        wordDocument.create();

    }
}