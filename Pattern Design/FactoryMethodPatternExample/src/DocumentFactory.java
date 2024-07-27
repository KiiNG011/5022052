public class DocumentFactory {
    public static Document createDocument(String docType){
        if(docType.trim().equalsIgnoreCase("Word Document")){
            return new WordDocument();
        }else if(docType.trim().equalsIgnoreCase("Pdf Document")){
            return new PdfDocument();
        }else if(docType.trim().equalsIgnoreCase("Excel Document")){
            return new ExcelDocument();
        }else{
            return null;
        }
    }
}
