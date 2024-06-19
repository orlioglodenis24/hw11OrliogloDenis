package hw25;
import java.io.*;
import java.nio.channels.FileChannel;
//Создать 2 текстовых файла: test1.txt и test2.txt. Один в корневой папке проекта с помощью относительного пути,
// другой в папке TestFile, которая находится на рабочем столе.
// В первый файл записать информацию с помощью BufferWriter и прочесть с помощью BufferReader.
//*Во втором файле проделать то же с помощью Buffers и Channels. (Использовать методы flip(), read, clear(), write())
//*Создать папку PathExample на рабочем столе и в ней файл testPath.txt с помощью интерфейса Path.
// Использовать методы: getFileName(), getParent(), getRoot(), isAbsolute(), toAbsolute().
//Использовать try with resources

public class BufferedWriteTest {
    public static void main(String[] args) throws IOException {
        BufferedWriter buff=new BufferedWriter(new FileWriter("C:/Users/Denis/IdeaProjects/hw10/src/hw25/test1.txt"));

        int[] mass={3,4,7};
        for(int i:mass){
          buff.write(Integer.toString(i));
        }
        buff.close();

    }
}

