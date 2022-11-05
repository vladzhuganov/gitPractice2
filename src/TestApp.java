public class TestApp {
// comment from remote
    Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a string");
        String str = scanner.nextLine();
        int vCount = 0, cCount = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i)<='z') {
                cCount++;
            }
        }
        System.out.println("Total Vowels - " + vCount + "," + "Total Consonants -  " + cCount);
    }


}
