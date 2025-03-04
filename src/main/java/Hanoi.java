public class Hanoi {
    static void towerOfHanoi(int n, char from_rod, char to_rod, char helper_rod) {
        if (n == 1) {
            System.out.println("Take 1 disk from rod " +  from_rod + " to rod " + to_rod);
            return;
        }

        towerOfHanoi(n-1, from_rod, helper_rod, to_rod);
        System.out.println("Take " + n + " disks from rod " + from_rod + " to rod " + to_rod);
        towerOfHanoi(n-1, helper_rod, to_rod, from_rod);
    }

    public static void main(String args[]) {
        int n = 3;
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}
