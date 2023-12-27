package C17ExceptionFileParsing;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class C1704JsonWithJackSonClass {
    public static void main(String[] args) {

//        임시성데이터
//        객체까지 만드는 건 오바
//        map에 담아서 사용가능
//
        try {
            ObjectMapper mapper = new ObjectMapper();
            File myPath = Paths.get("src/C17ExceptionFileParsing/test-data2.json").toFile();
            JsonNode data =  mapper.readTree(myPath);
            List<Student> studentList = new ArrayList<>();

//            파일에서 키가
            for(JsonNode j : data.get("students")){
                Student myStudent = mapper.readValue(j.toString(), Student.class);
                studentList.add(myStudent);
            }

            System.out.println(studentList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class Student{
    int id;
    String name;
    int classNumber;
    String city;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    public String toString() {
        return "id: " + this.id + " name: "+ this.name + " classNumber: " + classNumber + " city: " + city + "\n";
    }
}

