package luckyTicket;

public class Lucky {


    public static void main(String[] args) {
        int[] massive = {1, 2, 3, 3, 2, 1};
        System.out.println(Lucky.ticket(massive));
    }


    public static String ticket(int[] massive) {

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] < 10 && massive[i] >= 0) {
                continue;
            } else return "Try one more time";
        }
        int firstPart = massive[0] + massive[1] + massive[2];
        int secondPart = massive[3] + massive[4] + massive[5];
        if (firstPart == secondPart) {
            return "You are lucky";
        } else {
            return "Try one more time";


        }


    }

}




