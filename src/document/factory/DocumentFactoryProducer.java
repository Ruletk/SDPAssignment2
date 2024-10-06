package document.factory;

public class DocumentFactoryProducer {
    public static IDocumentFactory getFactory(String type) {
        if (type.equalsIgnoreCase("PDF")) {
            return new PDFDocumentFactory();
        } else if (type.equalsIgnoreCase("Word")) {
            return new WordDocumentFactory();
        }
        throw new IllegalArgumentException("Invalid document type");
    }
}
