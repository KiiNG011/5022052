public class PdfDocument implements Document{
    @Override
    public void print() {
        System.out.println("Printing PDF document");
    }

    @Override
    public void edit() {
        System.out.println("Edit PDF Document");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF document");
    }
}
