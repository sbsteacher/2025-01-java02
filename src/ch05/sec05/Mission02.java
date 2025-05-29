package ch05.sec05;

public class Mission02 {
    public static void main(String[] args) {
        String fileName = "23klsdkljsdkl.sadlkj.sdafkljds.haha.jpegaaaa";
        int lastDotIdx = fileName.lastIndexOf(".");
        String ext = fileName.substring(lastDotIdx + 1); //확장자 추출!!!
        System.out.println("ext: " + ext);
    }
}
