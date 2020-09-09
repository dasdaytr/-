public class Dog {
    private String nickname;
    private int age;
    public Dog(String nickname,int age)
    {
        this.nickname = nickname;
        this.age = age;
    }
    public String getNickname()
    {
        return nickname;
    }
    public int getAge()
    {
        return age;
    }
    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }
    public void setAge (int age)
    {
        this.age = age;
    }
    public void setHumanAge()
    {
        age *= 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname= '" + nickname + '\'' +
                ", age= " + age +
                '}';
    }
}
