public class Utilities {

    public char[] everyNthChar(char[] sourceArray, int n) {

        if (sourceArray == null || sourceArray.length < n) {
            return sourceArray;
        }

        int returnedLength = sourceArray.length / n;
        char[] result = new char[returnedLength];
        int index = 0;

        for (int i = n - 1; i < sourceArray.length; i += n) {
            result[index++] = sourceArray[i];
        }
        // String finalResult=new String(result);
        // System.out.println(finalResult);
        return result;
    }


    // "ABBCDEEF" -> "ABCDEF"
    public String removePairs(String source) {

        if (source.length() < 2) {
            return source;
        }

        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();

        for (int i = 0; i < string.length; i++) {
            try {
                if (string[i] != string[i + 1]) {
                    sb.append(string[i]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                sb.append(string[i]);
               // System.out.println("Input -> " + source + "\nOutput->" + sb.toString());

            }
        }

        return sb.toString();
    }

    public int converter(int a, int b) {
        return (a / b) + (a * 30) - 2;
    }

    public String nullIfOddLength(String source) {
        if (source.length() % 2 == 0) {
            return source;
        }
        return null;
    }

}
