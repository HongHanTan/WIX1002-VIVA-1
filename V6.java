import java.util.Scanner;

public class V6 {

    public static boolean isInt(int character) {
        switch (character) {
            case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
                return true;
            default:
                return false;
        }
    }

    public static void main(String[]args) { 

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        String [] parts = line.split(" ");
        int n = Integer.parseInt(parts[0]);

        String [] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = parts[i+1];
        }

        int count ;
        boolean breakFlag;

        for (int i = 0; i < n; i++) {
            count = 0;
            breakFlag = false;

            for (int j = 0; j < arr[i].length(); j++) {

                if (
                    (
                        isInt(arr[i].charAt(0))
                    )
                ||
                    (
                        arr[i].charAt(j) == '0' || arr[i].charAt(j) == '1'
                    )
                || 
                    (
                        (j < arr[i].length()-1) 
                        
                        &&

                        (isInt(arr[i].charAt(j)) && isInt(arr[i].charAt(j+1)))
                            
                        
                    )
                ) {
                    System.out.print("Invalid Log ");
                    breakFlag = true;
                    break;
                } 

                if (isInt(arr[i].charAt(j))) {
                        count += Integer.parseInt(Character.toString(arr[i].charAt(j)))-1;
                } else {
                    count ++;
                } 
                
            }
            if (breakFlag) {
                continue;
            }

            System.out.print(count + " ");
        }
        sc.close();
    }
}
