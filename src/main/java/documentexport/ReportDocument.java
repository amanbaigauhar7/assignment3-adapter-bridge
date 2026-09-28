package documentexport;

public class ReportDocument extends Document {

    public ReportDocument(DocumentExporter exporter) {
        super(exporter);
    }

    @Override
    public void create(String fileName) {
        String content = "This is a report document.";
        exporter.export(fileName, content);
    }
}