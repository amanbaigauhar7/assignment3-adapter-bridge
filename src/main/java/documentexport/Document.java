package documentexport;

public abstract class Document {

    protected final DocumentExporter exporter;

    public Document(DocumentExporter exporter) {
        this.exporter = exporter;
    }

    public abstract void create(String fileName);
}