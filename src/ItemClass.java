public class ItemClass
{
    // 아이템 이름
    private String name;
    // 아이템 속성
    private String att;
    
    // 위에 변수에 값을 다루기 위한 메소드 만들기
    public void setName(String name)
    {
        this.name = name;

    }
    public void setAtt(String att)
    {
        this.att = att;
    }
    public String getName()
    {
        return name;

    }
    public String getAtt()
    {
        return att;

    }
}
