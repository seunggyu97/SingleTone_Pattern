public class SystemSpeaker {

    // 싱글톤 규칙
    // 싱글톤은 하나의 인스턴스만 가져야 함
    // 하나의 인스턴스기 때문에 static 이여야 하고
    // 외부에서 접근이 가능하면 안되기 떄문에 private 이여야 함

    static private SystemSpeaker instance;

    private int volume;

    // 외부에서 생성함수를 호출하면 안됨
    private SystemSpeaker(){
        // 기본 값 5로 설정
        volume = 5;
    }

    public static SystemSpeaker getInstance(){
        if (instance == null){
            // null 인경우 생성자 호출
            instance = new SystemSpeaker();
            System.out.println("새로 생성함");
        }else{
            System.out.println("이미 생성됨");
        }

        return instance;
    }

    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
}
