package document;

public abstract class BaseDocument implements IDocument {
    protected String data;

    @Override
    public String fill(String data) {
        this.data = data;
        return "Document filled with data: " + this.data;
    }
}
