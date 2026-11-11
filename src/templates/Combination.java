package templates;

import java.util.ArrayList;
import java.util.List;

/*
# 조합 (Combination)
- 서로 다른 n개 중 순서에 상관없이 r개를 택하는 것
- 공식: nCr = n! / (r! * (n-r)!)

# 실전 선택 기준
1. r <= 3 (3개 이하): 중첩 for문 (가장 빠르고 실수 없음, 실전 1순위)
2. r >= 4 (4개 이상 또는 r이 문제마다 바뀔 때): 재귀 함수 (start 인덱스 활용)
*/
public class Combination {

    // ========================================================
    // 1. 중첩 for문 방식 (r = 3 고정일 때)
    // ========================================================
    public static void combiLoop(int[] arr) {
        int n = arr.length;

        // i -> j(i+1) -> k(j+1) 로 시작점을 한 칸씩 밀어주는 것이 핵심, 왜냐 순서가 중요x 조합이니깐
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                }
            }
        }
    }

    // ========================================================
    // 2. 재귀 함수 방식 (r >= 4 또는 r이 변수일 때)
    // ========================================================
    /**
     * @param arr   원본 배열
     * @param list  뽑은 원소들을 담을 임시 리스트
     * @param start 탐색 시작점 (내 뒤의 것만 보게 하여 순서 뒤바뀜 방지)
     * @param r     뽑아야 하는 목표 개수
     */
    public static void combiRecur(int[] arr, List<Integer> list, int start, int r) {
        // [기저 조건] r개를 다 뽑았으면 출력
        if (list.size() == r) {
            System.out.println(list);
            return;
        }

        for (int i = start; i < arr.length; i++) {
            list.add(arr[i]);                    // 1. 담기
            combiRecur(arr, list, i + 1, r);     // 2. 내 다음 번호(i + 1)부터 탐색하도록 넘김
            list.remove(list.size() - 1);        // 3. 원복 (마지막에 담았던 원소 빼기)
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("=== 1. 중첩 for문 (5개 중 3개) ===");
        combiLoop(arr);

        System.out.println("\n=== 2. 재귀 함수 (5개 중 3개) ===");
        combiRecur(arr, new ArrayList<>(), 0, 3);
    }
}


