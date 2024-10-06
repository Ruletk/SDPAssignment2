package document;

public class WordDocument extends BaseDocument {
    @Override
    public void create() {
        System.out.println("Word document created with data: " + this.data);
    }
}
