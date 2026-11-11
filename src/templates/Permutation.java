package templates;
import java.util.Arrays;

/*
# 순열 (Permutation)
- 서로 다른 n개 중 r개를 택해 '순서를 고려하여' 나열하는 것
    - nPr = n! / (n-r)!
- 순서 O -> 순열 / 순서 X -> 조합
- C++의 next_permutation과 달리 자바는 "직접 구현"해야 함 (DFS, 백트래킹 방식)
- 자바 코딩테스트 실전 표준 (사전순 출력 보장, 백준 N과 M 필수)

# 이럴 때 순열로 풀기
- 순서를 재배치하여
- ~한 순서의 경우 max값을 구하는 문제

# 핵심 공식 (Visited 백트래킹)
1. visited[i] = true;         -> 선택 (카드 집기)
2. perm(depth + 1);           -> 다음 자리 탐색
3. visited[i] = false;        -> 원복 (카드 내려놓기)
*/
public class Permutation {

    /**
     * @param arr     원본 배열
     * @param output  순열 결과를 담을 배열
     * @param visited 방문(사용) 여부 체크 배열
     * @param depth   현재까지 채운 자리 수
     * @param r       총 채워야 하는 목표 개수
     */
    public static void perm(int[] arr, int[] output, boolean[] visited, int depth, int r) {
        if (depth == r) {
            print(output, r);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;                         // 1. 선택 (카드 집기)
                output[depth] = arr[i];                    // 2. 값 적재
                perm(arr, output, visited, depth + 1, r);   // 3. 다음 자리 탐색
                visited[i] = false;                        // 4. 원복 (카드 제자리)
            }
        }
    }

    private static void print(int[] arr, int r) {
        for (int i = 0; i < r; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int r = 3;

        // 사전순 출력을 위한 정렬 (필수)
        Arrays.sort(arr);

        int[] output = new int[r];
        boolean[] visited = new boolean[arr.length];

        perm(arr, output, visited, 0, r);
    }
}