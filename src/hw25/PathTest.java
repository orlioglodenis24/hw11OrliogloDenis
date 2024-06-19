package hw25;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {
//        Path testPach= Paths.get("C:/Users/Denis/Desktop/PathExample/testPath.txt");
//        Path fileName=testPach.getFileName();
//        System.out.println(fileName);
//
//        Path parent=testPach.getParent();
//        System.out.println(parent);
//
//        Path root=testPach.getRoot();
//        System.out.println(root);
//
//        Path isAbsolute=testPach.toAbsolutePath();
//        System.out.println(isAbsolute);
//
//        Path toAbsolute=testPach.toAbsolutePath();
//        System.out.println(toAbsolute);

        Path pathExampleDir = Paths.get("PathTest", "DesktopTest");
        Path testPathFile = pathExampleDir.resolve("testPath02.txt");

        try {
            if (!Files.exists(pathExampleDir)) {
                Files.createDirectories(pathExampleDir);
            }

            Files.createFile(testPathFile);

            // Использование методов Path
            System.out.println("Имя файла: " + testPathFile.getFileName());
            System.out.println("Родительская папка: " + testPathFile.getParent());
            System.out.println("Корневая папка: " + testPathFile.getRoot());
            System.out.println("Абсолютный путь: " + testPathFile.isAbsolute());
            System.out.println("Абсолютный путь: " + testPathFile.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

