import java.util.*;

class Reverse {
    public static List<Integer> reverseArray(List<Integer> a) {
        int left = 0;
        int right = a.size() - 1;
        while (left < right) {
            int temp = a.get(left);
            a.set(left, a.get(right));
            a.set(right, temp);
            left++;
            right--;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrCount = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arrCount; i++) {
            arr.add(sc.nextInt());
        }
        List<Integer> res = reverseArray(arr);
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
