public class TextProcessor {

    public static int countWords(String sentence) {
        if (sentence == null){
            return 0;}
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
    public static String replaceWord(String text, String oldWord, String newWord){
        if (text == null || oldWord == null || newWord == null){
            return text;
        }
        return text.replaceAll("\\b" + oldWord,  "\\b" + newWord);
    }
    public static void main (String[] args){
        String sentence = " Java is a powerful language but hard to master";
        int startwordCount = countWords(sentence);
        System.out.println("Total word count: " + startwordCount);

        String textReplace = replaceWord(sentence, "hard", "challenging");
    }
}
