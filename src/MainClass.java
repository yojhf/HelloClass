public class MainClass
{
    public static void main(String[] args)
    {
        System.out.println("헬로 월드");
        // 클래스를 불러서 사용
        NameClass ns = new NameClass();
        ns.setName();  // 이름 설정 기능
        // System.out.println(ns.name + " 꺼져~");
        // ns.name = "점심";
        // System.out.println(ns.name + " 이리와~");
        // 이름을 출력을 해보자
        String name = ns.getName();    // 설정된 이름을 받을 수 있다
        // 플레이 시작
        PlayClass pc = new PlayClass();
        pc.play1(name);
    }
}
