public class LeetCode1491 {
    public static void main(String[] args) {
        int salary[] = { 4000, 3000, 1000, 2000 };
        double sum = 0;
        int remove = findMax(salary) + findMin(salary);
        for (int i = 0; i < salary.length; i++) {
            sum = sum + salary[i];
        }
        System.out.println(findMax(salary));
        System.out.println(findMin(salary));
        System.out.println(sum);
        System.out.println(salary.length - 2);
        double averageSalary = (sum - remove) / (salary.length - 2);
        System.out.println("Average Salary: " + averageSalary);

    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
