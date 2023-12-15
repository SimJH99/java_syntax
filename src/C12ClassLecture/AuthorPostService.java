package C12ClassLecture;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//인스턴스 변수 생성
//생성자: 모든 인스턴스 변수 초기화
//모든 클래스에 getter생성
public class AuthorPostService {
    public static void main(String[] args) {
//        1) 회원가입
//        2) 게시글 작성
//        3) 회원목록조회 : 회원 email을 출력
//        4) 회원 상세 조회 : 회원명, 회원 email, 회원작성글수
//        5) 게시글 상세조회 : 제목, 작성자 email.
        List<Author> authors = new ArrayList<>();
        List<Post> posts = new ArrayList<>();
        boolean onOff = true;
        while (onOff){
            System.out.println("이용하실 서비스 번호를 눌러주세요");
            System.out.println("1. 회원가입");
            System.out.println("2. 게시글 작성");
            System.out.println("3. 회원목록조회");
            System.out.println("4. 회원 상세 조회");
            System.out.println("5. 게시글 상세 조회");
            System.out.println("0. 서비스 종료");
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
                    Author myAuthor1 = new Author(name, email, password);
                    authors.add(myAuthor1);
                    System.out.println("현재 가입자는 " + authors.size() + "명 입니다.");
                    System.out.println("-----회원 가입 완료-----");
                    break;

                case 2: //게시글 작성
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("이메일을 입력해주세요");
                    String authorEmail = sc2.nextLine();
                    System.out.println("게시글명을 입력해주세요");
                    String title = sc2.nextLine();
                    System.out.println("게시글 내용을 입력해주세요");
                    String contents = sc2.nextLine();

                    Author tempAuthor = null;
                    for(Author a : authors){
                        if(a.getEmail().equals(authorEmail)){
                            tempAuthor = a;
                            break;
                        }
                    }

                    Post post1 = new Post(title, contents, tempAuthor);
                    if(tempAuthor == null){
                        System.out.println("없는 이메일 입니다.");
                        continue;
                    }else {
                        posts.add(post1);
                        tempAuthor.addPost(post1);
                    }
                    System.out.println("-----게시글 입력 완료.-----");
                    break;

                case 3: //회원목록조회
                    System.out.println("-----3. 회원 목록 조회-----");
                    for(Author a : authors){
                        System.out.println("ID: " + a.getId() + " Email : " + a.getEmail());
                    }
                    System.out.println("-----회원 목록 조회 종료-----");
                    break;

                case 4: //회원 상세 조회
                    System.out.println("-----4. 회원 상세 조회-----");
                    System.out.println("author email를 입력해주세요");
                    Scanner sc3 = new Scanner(System.in);
                    String author_email = sc3.nextLine();
                    Author temp_author = null;
                    for(Author a : authors){
                        if(a.getEmail().equals(author_email)){
                            temp_author = a;
                            break;
                        }
                    }
                    System.out.println(temp_author.getName() + " " + temp_author.getEmail() + " " + temp_author.getPosts().size());
                    System.out.println("-----회원 상세 조회 종료-----");
                    break;

                case 5: //게시글 상세조회
                    System.out.println("-----5. 게시글 상세 조회-----");
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("post id를 입력해주세요");
                    Long post_id = Long.parseLong(sc4.nextLine());
                    Post temp_post = null;
                    for(int i=0; i<posts.size(); i++){
                        if(posts.get(i).getId() == post_id){
                            temp_post = posts.get(i);
                            break;
                        }
                    }
                    System.out.println(temp_post.getTitle() + " " + temp_post.getAuthor().getEmail());
                    System.out.println("-----게시글 상세 조회 종료-----");
                    break;
                case 0: //프로그램 종료
                    System.out.println("프로그램을 종료합니다.");
                    onOff = false;
                    break;
            }
        }
    }
}

//엔티티
class Author {
    private Long id;
    private String name;
    private String email;
    private String password;
    List<Post> author_posts;

    static Long static_id = 0L;

    Author(String name, String email, String password){
        static_id += 1;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.author_posts = new ArrayList<>();
    }

    void addPost(Post post){
        this.author_posts.add(post);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Post> getPosts() {
        return author_posts;
    }
}

class Post {
    private Long id;
    private String title;
    private String contents;
    private  Author author;
    static Long static_id = 0L;

    Post(String title, String contents, Author author){
        static_id += 1;
        this.id = static_id;
        this.title = title;
        this.contents = contents;
        this.author = author;
//        this.author.addPost(this);
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public Author getAuthor() {
        return author;
    }
}

