package C17ExceptionFileParsing.AuthorException;


import java.util.*;

//controller(입력받고, 객체 생성)
//-> Service(비지니스 로직 - resister, login, throw new)
//-> Repository(list에 add)
public class AuthorController {
    public static void main(String[] args) {
//        메모리 DB에 데이터 추가/삭제 부분은 repository로 분리
        List<Author> authors = new ArrayList<>();
        AuthorService authorService = new AuthorService();
        boolean onOff = true;
        while(onOff){
            System.out.println("이용하실 서비스 번호를 눌러주세요");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            switch (num){
                case 1: //회원가입
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("-----1. 회원가입-----");
                    System.out.println("회원가입 하실 이름을 입력해주세요.");
                    String name = sc1.nextLine();
                    System.out.println("이메일을 입력해주세요");
                    String email = sc1.nextLine();
                    System.out.println("비밀번호를 입력해주세요");
                    String password = sc1.nextLine();
                    Author myAuthor = new Author(name, email, password);
                    try {
                        authorService.register(myAuthor);
                        System.out.println("-----회원 가입 완료.-----");
                    } catch (InputMismatchException | IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2: //로그인
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("login하실 이메일을 입력해주세요");
                    String authorEmail = sc2.nextLine();
                    System.out.println("login하실 비밀번호를 입력해주세요");
                    String authorPassword = sc2.nextLine();
                    try {
                        Optional<Author> loginedAuthor = Optional.empty();
                        loginedAuthor = authorService.login(authorEmail, authorPassword);
                        System.out.println(loginedAuthor.get().getName() + "님 환영합니다.");
                        System.out.println("-----로그인 완료.-----");
                    } catch (NoSuchElementException | IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 0: //프로그램 종료
                    System.out.println("프로그램을 종료합니다.");
                    onOff = false;
                    break;
            }
        }
    }
}


