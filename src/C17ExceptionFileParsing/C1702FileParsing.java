package C17ExceptionFileParsing;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;


//text파일 parsing
public class C1702FileParsing {
    public static void main(String[] args) {
//        파일경로: src\C17ExceptionFileParsing
        Path filePath = Paths.get("src/C17ExceptionFileParsing/text_file.txt");

//        파일 쓰기
//        버퍼기능이 구현되어이쏙, nio패키지에서는 non-blocking방식 사용
//        기본이 StandardCharsets.UTF_8이라서 .getBytes때 형식 안정해줘도 자동으로 UTF_8로 설정
        try {
            if(Files.exists(filePath)){
//                append : 추가, write : 덮어쓰기
                Files.write(filePath, "손흥민\n".getBytes(), StandardOpenOption.APPEND);
            } else {
                Files.write(filePath, "손흥민\n".getBytes(), StandardOpenOption.CREATE_NEW);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


//        파일 읽기 : readString, readAllLines(List형태)
//        try {
//            String myStr = Files.readString(filePath);
//            System.out.println(myStr);
////            readAllLines을 가지고 for문을 돌려 출력
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            List<String> myList = Files.readAllLines(filePath);
            for (String a : myList){
                System.out.println(a + "선수");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
