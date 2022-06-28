import java.util.Scanner;

/**
 * 이름을 설정하는 클래스
 */
public class NameClass
{
    private String name;

    // 메소드
    public void setName()
    {
        System.out.println("이름 설정 기능");
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 설정: ");
        name = sc.next();   // 문자열 입력 받기
    }

    public String getName()
    {
        System.out.println("이름 출력 기능능");
        System.out.println(name + "아 안녕!!!");
        return name;
    }
}