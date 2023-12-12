package lab0;

public class LabProject {

    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    // Constants
    private static final int BYTES_IN_KILOBYTE = 1024;

    public int calculateKilobytes(int fileSizeInBytes) {
        return fileSizeInBytes / BYTES_IN_KILOBYTE;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int processNumber(int number) {
        if (number > 0) {
            return number + 1;
        } else if (number < 0) {
            return number - 2;
        } else {
            return 10;
        }
    }

    public Season determineSeason(int month) {
        switch (month) {
            case 1:
            case 2:
            case 12:
                return Season.WINTER;
            case 3:
            case 4:
            case 5:
                return Season.SPRING;
            case 6:
            case 7:
            case 8:
                return Season.SUMMER;
            case 9:
            case 10:
            case 11:
                return Season.AUTUMN;
            default:
                throw new IllegalArgumentException("Invalid month number");
        }
    }

    public void printDescendingNumbers(int start, int end) {
        for (int i = end - 1; i > start; i--) {
            System.out.println(i);
        }
    }

    public int calculateQuotient(int N, int K) {
        assert K != 0 : "Divider (K) should not be zero";
        int quotient = 0;
        while (N >= K) {
            N -= K;
            quotient++;
        }
        return quotient;
    }

    public int findMaxPerimeter(int N, int[][] rectangles) {
        int maxPerimeter = 0;
        for (int i = 0; i < N; i++) {
            int length = rectangles[i][0];
            int width = rectangles[i][1];
            int perimeter = 2 * (length + width);
            if (perimeter > maxPerimeter) {
                maxPerimeter = perimeter;
            }
        }
        return maxPerimeter;
    }

    public int[] generateArithmeticProgression(int N, int firstTerm, int commonDifference) {
        int[] progression = new int[N];
        for (int i = 0; i < N; i++) {
            progression[i] = firstTerm + i * commonDifference;
        }
        return progression;
    }

    public int[][] createMatrix(int M, int N, int[] numbers) {
        int[][] matrix = new int[M][N];
        int index = 0;
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {
                matrix[i][j] = numbers[index++];
            }
        }
        return matrix;
    }

    public static void main(String... args) {
        System.out.println("Start of lab project");

        LabProject lab = new LabProject();

        // Example usage of implemented methods
        System.out.println("Calculate Kilobytes: " + lab.calculateKilobytes(2048));
        System.out.println("Is Even: " + lab.isEven(7));
        System.out.println("Process Number: " + lab.processNumber(-5));
        System.out.println("Determine Season: " + lab.determineSeason(8));

        System.out.println("Print Descending Numbers:");
        lab.printDescendingNumbers(2, 8);

        System.out.println("Calculate Quotient: " + lab.calculateQuotient(20, 4));

        int[][] rectangles = {{3, 4}, {5, 8}, {2, 6}};
        System.out.println("Find Max Perimeter: " + lab.findMaxPerimeter(3, rectangles));

        int[] progression = lab.generateArithmeticProgression(5, 2, 3);
        System.out.print("Generate Arithmetic Progression: ");
        for (int num : progression) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[][] matrix = lab.createMatrix(3, 4, numbers);
        System.out.println("Create Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("Done!!!");
    }
}
