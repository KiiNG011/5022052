public class WordDocument implements Document{

    @Override
    public void print() {
        System.out.println("Printing Word Document");
    }

    @Override
    public void edit() {
        System.out.println("Edit Word Document");
    }

    @Override
    public void save() {
        System.out.println("Save Word Document");
    }
}
