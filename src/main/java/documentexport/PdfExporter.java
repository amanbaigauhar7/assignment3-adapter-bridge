package documentexport;

public class PdfExporter implements DocumentExporter {

    @Override
    public void export(String fileName, String content) {
        System.out.println("Exporting PDF document...");
        System.out.println("File: " + fileName + ".pdf");
        System.out.println("Content: " + content);
    }
}