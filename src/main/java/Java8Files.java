import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Files {
    public static void main(String[] args) {
        try (Stream<String> fileLines = Files.lines(Paths.get("D:\\Ramesh\\Practise\\src\\main\\resources\\files\\StreamFile.txt"))) {
//            fileLines.forEach(System.out::println);

            Map<String, Long> map1 = fileLines.map(s -> s.split(" "))
                                                    .flatMap(Stream::of)
                                                    .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
            map1.forEach((k,v) -> System.out.println(k + " -> " + v));

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------------------");

        try(Stream<Path> filePaths = Files.list(Paths.get("D:\\Ramesh\\Practise\\src\\main\\java"))) {
            filePaths.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------------------");

        try(Stream<Path> fileWalks = Files.walk(Paths.get("D:\\Ramesh\\Practise\\src\\main\\java"), 1)) {
            fileWalks.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------------------");

        try(Stream<Path> fileFind = Files.find(Paths.get("D:\\Ramesh\\Practise\\src\\main\\java"),
                2,
                (path, attr) ->  !attr.isDirectory() && path.toString().contains("streams"))) {
            fileFind.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
