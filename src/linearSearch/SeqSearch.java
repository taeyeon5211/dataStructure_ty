package linearSearch;

import java.util.Scanner;

public class SeqSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇개의 데이터를 입력하시겠습니까 ? ex) 7 ");
        int num = sc.nextInt();
        int[] arr = new int[num + 1];

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print("array[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("검색할 값은 ? ");
        int key = sc.nextInt();
        int idx = seqSearch(arr, num, key);
        if (idx == -1) System.out.println("데이터가 존재하지 않습니다.");
        else System.out.println("해당데이터의 위치는 " + (idx - 1));
    }

    private static int seqSearch(int[] arr, int num, int key) {
        int i = 0;
        arr[num] = key;

        while (true) {
            if (i == num) return -1;
            if (arr[i++] == key) {
                return i;
            }
        }
    }
}
