public class Main {
    public static void main(String[] args){

        // getInstance를 통해 객체 생성
        SystemSpeaker systemSpeaker1 = SystemSpeaker.getInstance();

        // systemSpeaker1을 통해 이미 인스턴스 생성됨
        SystemSpeaker systemSpeaker2 = SystemSpeaker.getInstance();

        // 5, 5
        System.out.println(systemSpeaker1.getVolume());
        System.out.println(systemSpeaker2.getVolume());

        systemSpeaker1.setVolume(11);

        // 11, 11
        System.out.println(systemSpeaker1.getVolume());
        System.out.println(systemSpeaker2.getVolume());

        systemSpeaker2.setVolume(15);

        // 15, 15
        System.out.println(systemSpeaker1.getVolume());
        System.out.println(systemSpeaker2.getVolume());

//        SystemSpeaker 객체가 하나의 인스턴스만(동일한 인스턴스)을 공유하기 때문에 speaker 1과 2의 값은 같다.
    }
}
