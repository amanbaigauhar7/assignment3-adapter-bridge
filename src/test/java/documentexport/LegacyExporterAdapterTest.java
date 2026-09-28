package documentexport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class LegacyExporterAdapterTest {

    @Test
    void shouldTranslateEmptyContentError() {
        LegacyTextExporter legacyExporter = new LegacyTextExporter();
        DocumentExporter adapter =
                new LegacyExporterAdapter(legacyExporter);

        assertThrows(
                IllegalArgumentException.class,
                () -> adapter.export("test", "")
        );
    }

    @Test
    void shouldTranslateEmptyFileNameError() {
        LegacyTextExporter legacyExporter = new LegacyTextExporter();
        DocumentExporter adapter =
                new LegacyExporterAdapter(legacyExporter);

        assertThrows(
                IllegalArgumentException.class,
                () -> adapter.export("", "Some content")
        );
    }
}