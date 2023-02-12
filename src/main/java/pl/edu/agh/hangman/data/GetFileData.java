package pl.edu.agh.hangman.data;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Stream;

public class GetFileData {
    List<String> words;

    public GetFileData(String filename) {
        try (Stream<String> lines = Files.lines(Paths.get(getClass().getResource(filename).toURI()))){
            this.words = lines
                    .filter(x -> x.matches("[a-zA-Z]+"))
                    .map(String::toLowerCase)
                    .toList();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public String fetchRandomWord(){
        return words.get(new Random().nextInt(words.size()));
    }

    @Override
    public String toString() {
        return words.toString();
    }
}
