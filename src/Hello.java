import java.util.Scanner;

public class Hello
{
    public static void main(String[] args) 
    {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("안녕 자바야");
        
        // 위에 자바를 내가 입력한 글자로 바꾸고 싶다.
        // 구글에 자바 입력 검색
        // 스캐너라는게 나오네 이걸 복사 붙혀넣기
        Scanner sc = new Scanner(System.in); // 키보드로 부터 입력 받기 준비
        // System.out.printf("이름을 입력하세요 : ");
        System.out.printf("입력 : ");
        String name = sc.next(); // 키보드로 부터 글자를 입력 받기
        // 위에 name은 사용자가 입력한 글자가 저장이 된다.
        //System.out.println("내 이름은 " + name + "입니다.");
        System.out.println("안녕 " + name + "야");

    }
}
