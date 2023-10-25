package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String words = new String(chars);
        int count = 0;
        while (count < words.length()){
            System.out.println(words);
            count++;
        }
    }
}
