import java.util.ArrayList;

public class MainClass
{
    public static void main(String[] args)
    {
        System.out.println("헬로 월드");
        // 클래스를 불러서 사용
        NameClass nc = new NameClass();
        nc.setName();  // 이름 설정 기능
        nc.setItem(); // 아이템 설정 기능

        // System.out.println(ns.name + " 꺼져~");
        // ns.name = "점심";
        // System.out.println(ns.name + " 이리와~");
        // 이름을 출력을 해보자
        String name = nc.getName();    // 설정된 이름을 받을 수 있다
        // 플레이 시작
        PlayClass pc = new PlayClass();
        int num = pc.play1(name);
        num = pc.play2(num);
        
        
        // 아이템 리스트를 받아서 전달
        ArrayList<ItemClass> list = nc.getItemList();
        pc.play3(num, list);
    }

}
