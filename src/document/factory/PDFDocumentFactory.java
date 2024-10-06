package document.factory;

import document.IDocument;
import document.PDFDocument;

public class PDFDocumentFactory implements IDocumentFactory {
    @Override
    public IDocument createDocument() {
        return new PDFDocument();
    }
}
