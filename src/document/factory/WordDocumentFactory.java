package document.factory;

import document.IDocument;
import document.WordDocument;

public class WordDocumentFactory implements IDocumentFactory {
    @Override
    public IDocument createDocument() {
        return new WordDocument();
    }
}
