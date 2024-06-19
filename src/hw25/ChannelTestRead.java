package hw25;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelTestRead {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream("C:/Users/Denis/Desktop/TestFile/test2.txt");
             FileChannel fileChannel = fis.getChannel()) {

            ByteBuffer buff = ByteBuffer.allocate(2000);

            int bytesRead = fileChannel.read(buff);

            while (bytesRead != -1) {
                buff.flip();
                while (buff.hasRemaining()) {
                    System.out.print((char) buff.get());
                }
                buff.clear();
                bytesRead = fileChannel.read(buff);
            }
        }
    }
}
