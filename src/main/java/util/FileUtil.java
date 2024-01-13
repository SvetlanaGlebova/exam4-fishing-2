package util;

import com.sun.tools.javac.Main;
import jakarta.persistence.EntityManager;

import java.io.*;

import static util.JPAUtil.executeQuery;

public class FileUtil {
    public static void ReadFromFile (EntityManager manager, String filePath) {

        // Получаем ClassLoader
        ClassLoader classLoader = Main.class.getClassLoader();

        // Получаем InputStream для файла из папки resources
        try (InputStream inputStream = classLoader.getResourceAsStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
             BufferedReader reader = new BufferedReader(inputStreamReader)) {

            String line;
StringBuilder builder = new StringBuilder();


           while ((line = reader.readLine()) != null) {
               if (!line.trim().isEmpty()) {
                   builder.append(line).append(" ");
                   if (line.trim().endsWith(";")) {
                       executeQuery(manager, builder.toString());
                       builder.setLength(0);  //сбрасываем buffer лдя следующего запроса
                   }


               }
           }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
