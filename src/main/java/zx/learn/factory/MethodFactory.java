package zx.learn.factory;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/3
 * Time: 8:25
 * Description:
 */
public class MethodFactory {

    public static void main(String[] args) {
        ReaderFactory factory = new GifReaderFactory();
        Reader reader = factory.getReader();
        reader.read();
    }

}


interface Reader {
    void read();
}

class JpgReader implements Reader {
    public void read() {
        System.out.print("read jpg");
    }
}

class PngReader implements Reader {
    public void read() {
        System.out.print("read png");
    }
}

class GifReader implements Reader {
    public void read() {
        System.out.print("read gif");
    }
}

interface ReaderFactory {
    Reader getReader();
}

class JpgReaderFactory implements ReaderFactory {
    public Reader getReader() {
        return new JpgReader();
    }
}

class PngReaderFactory implements ReaderFactory {
    public Reader getReader() {
        return new PngReader();
    }
}

class GifReaderFactory implements ReaderFactory {
    public Reader getReader() {
        return new GifReader();
    }
}