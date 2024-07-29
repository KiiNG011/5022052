public class ExcelDocument implements Document{
    @Override
    public void print() {
        System.out.println("Printing Excel document");
    }

    @Override
    public void edit() {
        System.out.println("Editing Excel document");
    }

    @Override
    public void save() {
        System.out.println("Saving Excel document");
    }
}
