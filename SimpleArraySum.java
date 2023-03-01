import java.io.*;
import java.util.List;
import java.util.stream.Stream;



public class SimpleArraySum {

    public static int arraySum(List<Integer> arr) {
        int sum = 0;
        for (Integer num : arr) {
            sum = sum + num;
            // 1st time sum - 1
            // 2nd time sum - 3
            // 3rd time sum - 6
        }
        return sum; // 6

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrayCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> theArray = Stream.of(bufferedReader.readLine()
                .replaceAll("\\s+$", "")
                .split(" "))
                .map(Integer::parseInt)
                .toList();

        int result = arraySum(theArray);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
