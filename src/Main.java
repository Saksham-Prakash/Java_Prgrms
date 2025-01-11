import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String str="aaabjdajdadjdajdand";


        for(int i=0;i<str.length();i++) {
            int count=0;
            for(int j=i;j<str.length();j++) {
                if(str.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }
            System.out.println("count "+str.charAt(i)+"="+count);
        }




    }

}
