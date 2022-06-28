import java.util.Scanner;

public class PlayClass
{
    // 메소드 만들기
    public void play1(String name)
    {
//      String name = "도라";
        System.out.println(name + "이 설정 되었습니다.");
        System.out.println(name + "이 여행을 떠난다");
        // 가다가 퉁퉁이를 만났다
        System.out.println(name + "이 길을 가다가 퉁퉁이를 만났다");
        // 1. 싸운다 2. 도망간다
        System.out.println("1. 싸운다 2. 도망간다");
        System.out.println("입력");
        Scanner sc = new Scanner(System.in);

    }
}