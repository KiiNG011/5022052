public class Test {
    public static void main(String[] args) {
        Document wordDoc = DocumentFactory.createDocument("Word Document");
        Document pdfDoc = DocumentFactory.createDocument("PDF Document");
        Document excelDoc = DocumentFactory.createDocument("Excel Document");

        wordDoc.print();
        wordDoc.edit();
        wordDoc.save();
        System.out.println();

        pdfDoc.print();
        pdfDoc.edit();
        pdfDoc.save();
        System.out.println();

        excelDoc.print();
        excelDoc.edit();
        excelDoc.save();
    }
}
