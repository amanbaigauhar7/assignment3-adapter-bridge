package documentexport;

public class CertificateDocument extends Document {

    public CertificateDocument(DocumentExporter exporter) {
        super(exporter);
    }

    @Override
    public void create(String fileName) {
        String content = "This is a certificate document.";
        exporter.export(fileName, content);
    }
}