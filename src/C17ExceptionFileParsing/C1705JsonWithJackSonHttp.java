package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C1705JsonWithJackSonHttp {
    public static void main(String[] args) {
//        http클라이언트 생성
//        HttpClient client = HttpClient.newHttpClient();
//        ObjectMapper mapper = new ObjectMapper();
////        http 요청객체 생성
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
//                .GET()
//                .build();
////        http응답객체 생성
//        try {
//            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//            String post = response.body();
//            JsonNode jsonNode = mapper.readTree(post);
//            Post myPost = new Post(jsonNode.get("userId").asInt(), jsonNode.get("id").asInt(), jsonNode.get("title").asText(), jsonNode.get("body").asText());
////            readValue를 사용해서 객체로 곧바로 매핑
//            Post myPost2 = mapper.readValue(post, Post.class);
////            System.out.println(myPost2);
////            JsonNode는 트리구조 이므로,
////            for(JsonNode j : jsonNode) 이런 형식이 가능.
//
//            for(JsonNode j : jsonNode){
//                System.out.println(j);
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        HttpClient client2 = HttpClient.newHttpClient();
        ObjectMapper mapper2 = new ObjectMapper();
//        http 요청객체 생성
        HttpRequest request2 = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();
        try {
            HttpResponse<String> response2 = client2.send(request2, HttpResponse.BodyHandlers.ofString());
            String post2 = response2.body();
            JsonNode jsonNode2 = mapper2.readTree(post2);
            List<Post> postList = new ArrayList<>();
            for(JsonNode j : jsonNode2){
               Post myPost2 = mapper2.readValue(j.toString(), Post.class);
               postList.add(myPost2);
            }

//           java 객체를 json데이터로 직렬화
            String serialized_data = mapper2.writeValueAsString(postList);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Post{
    int id;
    String title;
    String body;
    int userId;
    Post(int userId, int id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
        this.userId = userId;
    }
    Post(){
    }
    @Override
    public String toString() {
        return "id: " + this.id + " title: "+this.title;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getBody() {
        return body;
    }
    public int getUserId() {
        return userId;
    }
}