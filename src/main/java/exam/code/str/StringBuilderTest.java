package exam.code.str;

public class StringBuilderTest {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("안녕하세요\n"); // 이전 문장 뒤에 붙는다.
        sb.append("만나서 반갑습니다");

        System.out.println(sb);

        // 삭제
        // - delete(int start, int end); start <= x < end
        sb.delete(0, 5);
        System.out.println(sb);

        // 삽입
        sb.insert(10, "안녕하세요");
        System.out.println("=================");
        System.out.println(sb);
        System.out.println("=================");
        System.out.println(sb.reverse());
    }
}