package templates;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
# 문자열 분리 (Split)
1. String.split(regex)
   - 특정 구분자(쉼표 등) 기준 단순 분리
   - 마침표(.), 파이프(|) 등 정규식 특수문자는 앞에 \\ 필수
2. StringTokenizer
   - 공백(" ") 기준 대량 문자열/숫자 파싱
   - split(" ")보다 메모리와 실행 속도가 압도적으로 빠름 (백준 필수)

공식
백준에서 한 줄에 공백으로 숫자나 단어가 쏟아져 들어올 때: -> StringTokenizer
쉼표, 하이픈 등 특정 기호로 몇 개 안 되는 문자열을 자를 때: -> String.split()

*/
public class StringSplit {

    public static void main(String[] args) {
        // 1. 단순 기호 기준 분리
        String str1 = "apple,banana,orange";
        String[] fruits = str1.split(",");
        System.out.println("쉼표 분리: " + Arrays.toString(fruits));

        // 2. 정규표현식 예약어 분리 (\\ 필수: . | * + ? ^ $ [ ] ( ) { } \ )
        String ip = "192.168.0.1";
        String[] ipParts = ip.split("\\."); // 정규식에서 점(.)은 '모든 문자'를 뜻하므로, 진짜 마침표로 자를 땐 반드시 "\\." 사용
        System.out.println("점(.) 분리: " + Arrays.toString(ipParts));

        // 3. 공백 기준 다량 데이터 파싱 (코딩테스트 표준)
        String line = "10 20 30 40 50";
        StringTokenizer st = new StringTokenizer(line);
        System.out.print("StringTokenizer 파싱: ");
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            System.out.print(num + " ");
        }
        System.out.println();
    }
}