package documentexport;

public class LegacyExporterAdapter implements DocumentExporter {

    private final LegacyTextExporter legacyExporter;

    public LegacyExporterAdapter(LegacyTextExporter legacyExporter) {
        this.legacyExporter = legacyExporter;
    }

    @Override
    public void export(String fileName, String content) {
        int result = legacyExporter.saveLegacyDocument(content, fileName, 1);

        if (result == -1) {
            throw new IllegalArgumentException("Document content cannot be empty.");
        }

        if (result == -2) {
            throw new IllegalArgumentException("File name cannot be empty.");
        }

        if (result != 0) {
            throw new IllegalStateException("Legacy export failed.");
        }
    }
}