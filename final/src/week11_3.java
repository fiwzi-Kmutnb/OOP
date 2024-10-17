import java.util.Scanner;
public class week11_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] parts = new int[n];
        for (int i = 0; i < n; i++) {
            parts[i] = scanner.nextInt();
        }

        int result = smallestOriginalLength(parts);
        System.out.println(result);

        scanner.close();
    }

    public static int smallestOriginalLength(int[] parts) {
        int maxLength = 0;
        for (int part : parts) {
            maxLength = Math.max(maxLength, part);
        }

        for (int length = maxLength; ; length++) {
            if (canFormOriginalSticks(parts, length)) {
                return length;
            }
        }
    }

    private static boolean canFormOriginalSticks(int[] parts, int length) {
        int currentStick = length;
        for (int part : parts) {
            if (part > currentStick) {
                currentStick = length;
            }
            if (part >= currentStick) {
                return false;
            }
            currentStick -= part;
        }
        return true;
    }
    }
