package documentexport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentTest {

    static class StubExporter implements DocumentExporter {
        String fileName;
        String content;

        @Override
        public void export(String fileName, String content) {
            this.fileName = fileName;
            this.content = content;
        }
    }

    @Test
    void reportDocumentDelegatesToExporter() {
        StubExporter exporter = new StubExporter();

        Document document = new ReportDocument(exporter);
        document.create("report");

        assertEquals("report", exporter.fileName);
        assertEquals("This is a report document.", exporter.content);
    }

    @Test
    void certificateDocumentDelegatesToExporter() {
        StubExporter exporter = new StubExporter();

        Document document = new CertificateDocument(exporter);
        document.create("certificate");

        assertEquals("certificate", exporter.fileName);
        assertEquals(
                "This is a certificate document.",
                exporter.content
        );
    }
}