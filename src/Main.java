import document.IDocument;
import document.factory.DocumentFactoryProducer;
import document.factory.IDocumentFactory;
import gui.elements.interfaces.IButton;
import gui.elements.interfaces.ICheckbox;
import gui.factory.DarkUIElementFactory;
import gui.factory.IUIElementFactory;
import gui.factory.LightUIElementFactory;

public class Main {
    public static void main(String[] args) {
        testGui();
    }

    public static void testDocuments() {
        IDocumentFactory pdfFactory = DocumentFactoryProducer.getFactory("PDF");
        IDocumentFactory wordFactory = DocumentFactoryProducer.getFactory("Word");

        IDocument pdfDocument = pdfFactory.createDocument();
        IDocument wordDocument = wordFactory.createDocument();

        System.out.println(pdfDocument.fill("Hello, PDF document!"));
        System.out.println(wordDocument.fill("Hello, Word document!"));

        pdfDocument.create();
        wordDocument.create();
    }

    public static void testGui() {
        String screen1 = "Main screen";
        String screen2 = "Settings screen";

        IUIElementFactory lightFactory = new LightUIElementFactory();
        IUIElementFactory darkFactory = new DarkUIElementFactory();

        IButton lightButton = lightFactory.createButton(screen1, 100, 50);
        IButton darkButton = darkFactory.createButton(screen1, 200, 100);

        ICheckbox lightCheckbox = lightFactory.createCheckbox(screen2, 150, 75);
        ICheckbox darkCheckbox = darkFactory.createCheckbox(screen2, 300, 150);

        lightButton.render(10, 20);
        darkButton.render(30, 40);

        lightCheckbox.render(50, 60);
        darkCheckbox.render(70, 80);
    }
}