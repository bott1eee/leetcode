package pattern.decorate;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException {
        Water water = new Drink();
        water = new Cream(water);
        water = new Chocolate(water);
        System.out.println(water.cost());

        listAllFiles(new File("E:\\television\\日剧"));

        readFile("C:\\Users\\bott1eee\\Desktop\\新建文本文档.txt");
    }

    public static void listAllFiles(File dir) {
        if (dir == null || !dir.exists()) {
            return;
        }
        if (dir.isFile()) {
            System.out.println(dir.getName());
            return;
        }
        for (File file : dir.listFiles()) {
            listAllFiles(file);
        }
    }

    public static void readFile(String filePath) throws IOException {

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
