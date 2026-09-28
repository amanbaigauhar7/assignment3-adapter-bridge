package documentexport;

public class ExporterSelector {

    public static DocumentExporter select(String format) {

        if (format == null) {
            throw new IllegalArgumentException("Format cannot be null.");
        }

        return switch (format.toLowerCase()) {
            case "pdf" -> new PdfExporter();
            case "html" -> new HtmlExporter();
            case "legacy" ->
                    new LegacyExporterAdapter(new LegacyTextExporter());
            default ->
                    throw new IllegalArgumentException(
                            "Unsupported format: " + format
                    );
        };
    }
}