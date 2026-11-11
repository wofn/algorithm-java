# algorithm-java

코딩테스트 대비 Java 알고리즘 학습 저장소입니다.
자주 쓰는 풀이 패턴은 **템플릿**으로 정리하고, 주차별로 **유형을 정해 백준 문제**를 풉니다.

## 환경

- Language: Java (JDK 26)
- IDE: IntelliJ IDEA
- Judge: 백준 (BOJ)

## 폴더 구조

```
algorithm-java/
└── src/
    ├── templates/             # 자주 쓰는 풀이 패턴
    │   ├── Combination.java
    │   ├── Permutation.java
    │   ├── Recursion.java
    │   ├── StringSplit.java
    │   └── UniqueElements.java
    └── week01_prefix_sum/     # 주차별 문제 풀이
```

## 템플릿

| 템플릿 | 핵심 | 언제 쓰나 |
|---|---|---|
| [Combination](src/templates/Combination.java) | 중첩 for문 / 재귀 (`start` 인덱스) | r ≤ 3이면 for문, r ≥ 4이거나 r이 바뀌면 재귀 |
| [Permutation](src/templates/Permutation.java) | `visited` 백트래킹 | 순서가 중요할 때 (N과 M 유형), 사전순 출력은 정렬 후 탐색 |
| [Recursion](src/templates/Recursion.java) | 종료 조건, 팩토리얼 O(N) · 피보나치 O(2^N) | 큰 문제를 작은 문제로 나눌 때, 반복문으로 되면 반복문 우선 |
| [StringSplit](src/templates/StringSplit.java) | `split()` vs `StringTokenizer` | 공백 기준 대량 입력은 `StringTokenizer`, 특정 기호 분리는 `split()` (`.` `\|` 는 `\\` 필요) |
| [UniqueElements](src/templates/UniqueElements.java) | `TreeSet` / `LinkedHashSet` / `HashSet` | 정렬 + 중복 제거 / 입력 순서 유지 / 순서 무관 |

## 주차별 학습 기록

| 주차 | 유형 | 문제 | 상태 |
|---|---|---|---|
| 1주차 | 누적합 · 브루트포스 | BOJ 2309 일곱 난쟁이 | 진행 중 |

## 커밋 규칙

| 상황 | 형식 | 예시 |
|---|---|---|
| 문제 풀이 | `[BOJ 번호] 문제명 - 풀이 방법` | `[BOJ 2309] 일곱 난쟁이 - 브루트포스` |
| 템플릿 추가 | `[Template] 내용` | `[Template] 이분 탐색 추가` |
| 수정 | `[Fix] 내용` | `[Fix] 순열 주석 정리` |
| 문서 | `[Docs] 내용` | `[Docs] README 정리` |
