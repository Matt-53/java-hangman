package pl.edu.agh.hangman.data;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Stream;

public class GetFileData {
    List<String> words;

    public GetFileData(String filename) {
        this.words = readFile(filename);
    }

    private List<String> readFile(String filename){
        List<String> text = new ArrayList<>();
        try (Stream<String> lines = Files.lines(Paths.get(getClass().getResource(filename).toURI()))){
            text = lines
                    .filter(x -> x.matches("[a-zA-Z]+"))
                    .map(String::toLowerCase)
                    .toList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return text;
    }

    public String fetchRandomWord(){
        return words.get(new Random().nextInt(words.size()));
    }

    @Override
    public String toString() {
        return words.toString();
    }
}
