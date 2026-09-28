package documentexport;

public class HtmlExporter implements DocumentExporter {

    @Override
    public void export(String fileName, String content) {
        System.out.println("Exporting HTML document...");
        System.out.println("File: " + fileName + ".html");
        System.out.println("Content: " + content);
    }
}
