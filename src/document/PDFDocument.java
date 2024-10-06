package document;

public class PDFDocument extends BaseDocument {
    @Override
    public void create() {
        System.out.println("PDF document created with data: " + this.data);
    }
}
