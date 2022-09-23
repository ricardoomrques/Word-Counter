import org.example.Counter;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {
    @Test
    void testFileWithNoWords() throws IOException {
        var counter = new Counter();
        assertEquals(counter.count("C:\\Users\\ricar\\OneDrive\\Documentos\\Word-Counter\\src\\main\\Files\\file1.txt"),"Words in file: 0\n\n");
    }

    @Test
    void testFileHelloWorld() throws IOException {
        var counter = new Counter();
        assertEquals(counter.count("C:\\Users\\ricar\\OneDrive\\Documentos\\Word-Counter\\src\\main\\Files\\file2.txt"),"Words in file: 2\n\n");
    }

    @Test
    void testFile3() throws IOException {
        var counter = new Counter();
        assertEquals(counter.count("C:\\Users\\ricar\\OneDrive\\Documentos\\Word-Counter\\src\\main\\Files\\file3.txt"),"Words in file: 53\n\n");
    }

    @Test
    void testFile4() throws IOException {
        var counter = new Counter();
        assertEquals(counter.count("C:\\Users\\ricar\\OneDrive\\Documentos\\Word-Counter\\src\\main\\Files\\file4.txt"),"Words in file: 104\n\n");
    }

    @Test
    void testFile5() throws IOException {
        var counter = new Counter();
        assertEquals(counter.count("C:\\Users\\ricar\\OneDrive\\Documentos\\Word-Counter\\src\\main\\Files\\file5.txt"),"Words in file: 273\n\n");
    }
}
