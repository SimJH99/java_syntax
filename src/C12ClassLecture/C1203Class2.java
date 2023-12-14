package C12ClassLecture;

import java.awt.*;

public class C1203Class2 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("심재혁");;
        person1.setEmail("123@naver.com");
        person1.setPassword("1234");
        person1.setAge(25);

        System.out.println(person1.getName());
        System.out.println(person1.getEmail());
        System.out.println(person1.getPassword());
        System.out.println(person1.getAge());

        Person person2 = new Person();
        person2.setName("조경남");;
        person2.setEmail("345@naver.com");
        person2.setPassword("9876");
        person2.setAge(21);

        person2.whoIs();
    }
}
//person클래스를 만들고,
//객체변수는 name, email, password, age
//객체매서드 whoIs() : name, email, password, age 입니다 -> 출력문
//객체 생성후 whoIs메서드 호출.

class  Person{
    private String name;
    private String email;
    private String password;
    private int age;

//    Setter Getter패턴
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() < 10){
            this.name = name;
        } else {
            System.out.println("이름이 너무 깁니다.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@")){
            this.email = email;
        } else {
            System.out.println("양식이 틀렸습니다.");
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 20){
            this.age = age;
        } else {
            System.out.println("미성년자는 가입할 수 없습니다.");
        }

    }
    void whoIs(){
        System.out.println("[이름 : " + this.name + "] [이메일 : " + this.email + "] [비밀번호 : " + this.email + "] [나이 : " + this.age + "]");
    }
}


