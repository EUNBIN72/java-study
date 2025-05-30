package homework.homework2;

public class Practice {

    public String takeState(String sentence) {
        String[] lines = sentence.split("\r\n|\n");
        String result = "";

        for (String line : lines) {
            String[] words = line.split(" ");
            boolean found = false;

            for (String word : words) {
                if (word.endsWith("구")) {
                    result += word + "\n";
                    found = true;
                    break;
                }
            }

            if (!found) {
                result += "null\n";
            }
        }

        return result;
    }
}
