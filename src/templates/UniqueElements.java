package templates;

import java.util.*;

/*
# 중복 제거 (C++ sort + unique + erase 대체)
1. TreeSet: 오름차순(사전순) 정렬 + 중복 제거 (가장 빈출)
2. LinkedHashSet: 데이터가 들어온 원래 순서 유지 + 중복 제거
3. HashSet: 순서 상관없이 중복만 가장 빠르게 제거 (O(1))
*/
public class UniqueElements {

    public static void main(String[] args) {
        // 중복이 포함된 원본 데이터
        List<Integer> list = Arrays.asList(3, 1, 2, 3, 2, 5, 4, 1);
        System.out.println("원본: " + list);

        // 1. 오름차순 정렬 + 중복 제거 (TreeSet)
        Set<Integer> sortedUnique = new TreeSet<>(list);
        System.out.println("정렬 + 중복 제거 (TreeSet): " + sortedUnique);

        // 2. 입력 순서 유지 + 중복 제거 (LinkedHashSet)
        Set<Integer> orderedUnique = new LinkedHashSet<>(list);
        System.out.println("순서 유지 + 중복 제거 (LinkedHashSet): " + orderedUnique);

        // 3. Set을 다시 인덱스 접근이 가능한 List나 배열로 변환
        List<Integer> resultList = new ArrayList<>(sortedUnique);
        System.out.println("첫 번째 원소 조회: " + resultList.get(0));
    }
}