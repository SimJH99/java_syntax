package C12ClassLecture;

//내부클래스 생성 : Calender
//인스턴스 변수 : year, month, day -> String
//1) 생성자1: year, month, day를 초기화 하는
//2) 생성자2: year, month를 초기화
//3) 생성자3: 초기화 없음
public class C1205Constructor {
    public static void main(String[] args) {
        Calender cal1 = new Calender("2023","01","10");
        Calender cal2 = new Calender("2023","12");
        Calender cal3 = new Calender("2023");

        cal1.Print();
        cal2.Print();
        cal3.Print();


    }
}

class Calender{
    private String year;
    private String month;
    private String day;

    Calender(String year, String month, String day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    Calender(String year, String month){
        this(year, month, null);
    }

    Calender(String year){
        this(year, null, null);
    }

    public void Print(){
        System.out.println(year + "년 " + month + "월 " + day + "일");
    }
}


