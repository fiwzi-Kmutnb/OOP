    import java.util.*;
    public class week7_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Runner> runners = new ArrayList<>();
            collectRunners(scanner, runners, 0);
            Collections.sort(runners);
            System.out.println("Top 3 runners:");
            for (int i = 0; i < 3; i++) {
                System.out.println("ID: " + runners.get(i).id + ", Time: " + runners.get(i).time);
            }
        }

        private static void collectRunners(Scanner scanner, List<Runner> runners, int count) {
            if (count == 10) {
                return;
            }
            System.out.print("Enter runner ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter runner time: ");
            double time = scanner.nextDouble();
            if (time > 20.00) {
                System.out.println("Time must not exceed 20.00 seconds.");
                collectRunners(scanner, runners, count);
            } else {
                runners.add(new Runner(id, time));
                collectRunners(scanner, runners, count + 1);
            }
        }
    }

class Runner implements Comparable<Runner> {
    int id;
    double time;

    Runner(int id, double time) {
        this.id = id;
        this.time = time;
    }

    @Override
    public int compareTo(Runner other) {
        return Double.compare(this.time, other.time);
    }
}
