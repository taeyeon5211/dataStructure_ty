package linearSearch;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇개의 데이터를 입력하시겠습니까 ? ex) 7 ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("array[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("검색할 값은 ? ");
        int target = sc.nextInt();
        int idx = binarySearch(arr, target);
        System.out.println(idx);

    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int answer = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target <= arr[mid]) {
                end = mid - 1;
                answer = mid;
            } else {
                start = mid + 1;
            }
        }
        return answer;
    }
}
