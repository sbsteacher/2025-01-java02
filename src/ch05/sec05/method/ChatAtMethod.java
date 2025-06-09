package ch05.sec05.method;

public class ChatAtMethod {
    public static void main(String[] args) {
        String gender = checkGender("900212-1998756"); //"남자" 리턴
        String gender2 = checkGender("900212-2998756"); //"여자" 리턴
        System.out.println("gender1: " + gender);
        System.out.println("gender2: " + gender2);
        System.out.println("gender3: " + checkGender("900212-3998756"));
        System.out.println("gender4: " + checkGender("900212-4998756"));
        System.out.println("gender5: " + checkGender("900212-5998756"));

        //8번째 문자가 '2', '4' > 여자 리턴
        //8번째 문자가 '1', '3' > 남자 리턴
        //8번째 문자가 '1', '2', '3', '4'가 아니면 null 리턴
    }

    public static String checkGender(String ssn) {
        char ch = ssn.charAt(7);
        return switch(ch) {
            case '2', '4' -> "여자";
            case '1', '3' -> "남자";
            default -> null;
        };
    }
}
