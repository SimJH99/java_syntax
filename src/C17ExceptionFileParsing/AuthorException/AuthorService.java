package C17ExceptionFileParsing.AuthorException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

//view
class AuthorService {
    AuthorRepository authorRepository;
    AuthorService(){
        authorRepository = new AuthorRepository();
    }
    void register(Author author) throws IllegalArgumentException{
//        만약에 password가 5자리 이하이면 예외 발생(IllegalArgu)
        if(author.getPassword().length()<=5){
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        }
//        기존에 같은 email이 있는지도 체크
        Optional<Author> author1 =  authorRepository.getAuthorByEmail(author.getEmail());
        if(author1.isPresent()){
            throw new IllegalArgumentException("이미 가입한 email입니다.");
        }
        authorRepository.register(author);
    }
    Author login(String email, String password) throws IllegalArgumentException, NoSuchElementException{
        Optional<Author> author = authorRepository.getAuthorByEmail(email);
        if(author.isPresent()){
            if(author.get().getPassword().equals(password)){
                return author.get();
            }else{
                throw new IllegalArgumentException("존재하지 않는 아이디 입니다.");
            }
        }else{
            throw new NoSuchElementException("비밀번호가 일치하지 않습니다.");
        }
    }
}