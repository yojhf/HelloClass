import java.util.Scanner;

public class Game_01
{
    public static void main(String[] args)
    {
        int p_Life = 100;
        int e_Life = 100;

        // 캐릭터 이름 설정
        Scanner sc = new Scanner(System.in);
        System.out.printf("주인공의 이름은 : ");
        String Mname = sc.next();

        // 도라에몽이 캐릭터가 여행을 떠난다.
        System.out.println(Mname + "이 설정 되었습니다.");
        System.out.println("나의 체력 : " + p_Life);
        System.out.println("퉁퉁이의 체력 : " + e_Life);
        System.out.println(Mname + "이 여행을 떠난다~~~~");

        // 가다가 퉁퉁이를 만났다.
        System.out.println(Mname + "이 퉁퉁이를 만났다!!!!!");

        // 1. 싸운다 2. 도망간다.
        System.out.println("1. 싸운다" + "2. 도망간다.");
        int F_sc = sc.nextInt();

        if(F_sc == 1) // 만약에 1번을 입력하면
        {
            // 싸운다 선택
            // 1번이면
            System.out.println("퉁퉁이와 다이다이!!!!");

            // 1. 10번 공격 2. 아이템 사용 3. 방어
            System.out.println("1. 10번 공격! " + "2. 아이템 사용 " + "3. 방어");
            int F_sc_02 = sc.nextInt();

            if(F_sc_02 == 1) // 만약에 1번이면 10번을 공격을 한다.
            {
                System.out.println("10번 공격");
                System.out.println("다다닥다다닥다다닥다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("퉁퉁이에게 10의 데미지 어택!");
                System.out.println("WIN!");
                e_Life -= 10;
                System.out.println("나의 체력 : " + p_Life);
                System.out.println("퉁퉁이의 체력 : " + e_Life);
            }
            else if(F_sc_02 == 2) // 만약에 2번이면 아이템 메뉴가 출력되고 선택한 아이템으로 공격
            {
                System.out.println("연장 준비 중.......");
                System.out.println("연장을 선택하세요 : " + "1. 야구 빠따 " + "2. BB탄총 " + "3. 돌맹이");
                int F_sc_03 = sc.nextInt();

                if(F_sc_03 == 1)
                {
                    System.out.println("야구 빠따로 뚝배기 딱대~!");
                    System.out.println("Game WIN!!!!");
                }
                else if(F_sc_03 == 2)
                {
                    System.out.println("헤드 샷~!");
                    System.out.println("Game WIN!!!!");
                }
                else if(F_sc_03 == 3)
                {
                    System.out.println("돌맹이로 뚝배기 컷~!");
                    System.out.println("Game WIN!!!!");
                }
                else
                {
                    System.out.println("잘못입력하셨습니다. 퉁퉁이에게 사망");
                }
            }
            else if(F_sc_02 == 3) // 3번이면 방어를 하고 퉁퉁이가 나를 공격한다.
            {
                System.out.println("퉁퉁이의 공격을 방어");
            }
            else
            {
                System.out.println("잘못입력하셨습니다. 퉁퉁이에게 사망");
                System.out.println("게임 오버");
            }

        }
        else if(F_sc == 2)// 2번을 입력하면
        {
            // 도망간다
            System.out.println("빤쓰런~~~~");
            System.out.println("게임 오버");
        }
        else
        {
            System.out.println("잘못입력하셨습니다. 퉁퉁이에게 사망");
            System.out.println("게임 오버");
        }

    }
}
