import java.util.ArrayList;
import java.util.Scanner;

/**
 * 이름을 설정하는 클래스
 */
public class NameClass
{
    private ArrayList<ItemClass> list = new ArrayList<>();
    private String name;
    private Scanner sc;
    public NameClass()
    {
        sc = new Scanner(System.in);
    }

    // 메소드
    public void setName()
    {
        System.out.println("이름 설정 기능");
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 설정 : ");
        name = sc.next();   // 문자열 입력 받기
    }

    public String getName()
    {
        System.out.println("이름 출력 기능");
        System.out.println(name + "야 안녕!!!");
        return name;
    }

    // 아이템 셋팅
    // 사용자가 원하는 만큼 아이템 셋팅
    public void setItem()
    {
        System.out.println("몇개의 아이템을 사용하시겠습니까?");
        System.out.print("갯수 입력(많이하면 힘들어요) : ");
        int n = sc.nextInt();


        for(int i = 0; i < n; i++)
        {
            ItemClass ic = new ItemClass(); // 아이템을 담을 그릇을 만듬
            System.out.print("아이템 입력 : ");
            String it = sc.next();
            ic.setName(it); // 아이템 담고
            // System.out.println(i + ".아이템 : " + it);
            System.out.print("속성 입력 : ");
            it = sc.next();
            ic.setAtt(it); // 속성 담고
            // ItemClass가 셋팅된 오브젝트 오브젝트를 또 담는다(list)
            list.add(ic);
            // System.out.println(i + ".속성 : " + it);
        }
        // 입력한 아이템을 출력해보자
        //System.out.println("입력한 아이템 출력");
        //for (ItemClass ic : list)
        //{
            //System.out.println("입력한 아이템 출력 : " + ic.getName());
            //System.out.println("입력한 속성 출력 : " + ic.getAtt());
        //}
    }
    // 셋팅된 아이템 리스트를 전달 해주는 역할
    public ArrayList<ItemClass> getItemList()
    {
        return list;
    }

}