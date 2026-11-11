package templates;

/*
# 재귀 함수
- 재귀 함수는 정의 단계에서 "자신을 재참조하는 함수"
- 전달 되는 상태인 매개변수가 달라질 뿐 똑같은 일을 하는 함수
- 큰 문제를 작은 부분 문제로 나누어서 풀 때 사용


# 주의사항
- 반드시 "종료 조건" 사용
- "사이클"이 있다면 안됨 ex) f(a)-> f(b),  f(b)-> f(a)
- "반복문"으로 될 거 같으면 반복문 사용, 재귀 반복문 둘다 될것같으면 반복문으로 풀기

# 예시
- 팩토리얼 n! :  그 이전의 항을 모두 곱하는 것.
    - f(n) : n * f(n-1)
- 피보나치 : 0 1 1 2 3 5 8 13 21 34 55 89

 */

public class Recursion{

    //팩토리얼 (시간 복잡도 O(N))
    public static int fact(int n){
        if (n == 0 || n == 1) return 1;
        return n * fact(n-1);
    }

    // 피보나치 수열(재귀 O(2^N))
    public static int fibo(int n){
        if (n == 0 || n == 1) return n;
        return fibo(n-1) + fibo(n-2);
    }


   public static void main(String[] args) {
        int n = 5;
        System.out.println("fact = "+ fact(n) + " fibo = " + fibo(n));
    }
}


