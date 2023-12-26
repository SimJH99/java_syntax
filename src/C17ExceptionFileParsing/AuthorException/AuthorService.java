package C17ExceptionFileParsing.AuthorException;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

class AuthorService {
    AuthorRepository authorRepository;
    AuthorService(){
        authorRepository = new AuthorRepository();
    }
    void register(Author author){
//        기존의 같은 email있는지도 체크하면 좋다.
//        만약에 password가 5자리 이하이면 예외 발생(IllegalArgumentException)
        if(author.getPassword().length() <= 5){
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        }

        //        기존에 같은 email있는지도 체크
        Optional<Author> author1 = authorRepository.getAuthorsByEmail(author.getEmail());


        authorRepository.register(author);
    }

    Optional<Author> login(String email, String password) throws IllegalArgumentException, NoSuchElementException{
        Optional<Author> author1 = authorRepository.getAuthorsByEmail(email);
        if(author1.isPresent()){
            if (author1.get().getPassword().equals(password)) {
                return author1;
            } else {
                throw new IllegalArgumentException("입력한 이메일에 맞지않는 비밀번호입니다.");
            }
        } else {
            throw new NoSuchElementException("email이 존재하지 않습니다.");
        }
    }
}
