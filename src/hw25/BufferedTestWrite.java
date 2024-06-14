package hw25;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferedTestWrite {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("C:/Users/Denis/Desktop/TestFile/test2.txt");
             FileChannel fileChannel = fos.getChannel()) {
            int[] abc = {10, 43, 11};
            ByteBuffer buff = ByteBuffer.allocate(2000);
            for (int i : abc) {
                buff.put(Integer.toString(i).getBytes());
            }
            buff.flip();
            fileChannel.write(buff);
        }
    }
}
