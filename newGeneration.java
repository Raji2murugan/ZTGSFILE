package ztgs;


public class newGeneration {

    public static void main(String[] args) {
        String arr[][]= {{"Paari","KariKalan"},{"Udhiran","Sendhan"},{"Sendhan","Arulmozhi"},{"KariKalan","Sendhan"}};
        String input="Arulmozhi";
        
        int grandChildCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1].equals(input)) {
                String child = arr[i][0];
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j][1].equals(child)) {
                        grandChildCount++;
                    }
                }
            }
        }

        System.out.println("Grandchildren count of " + input + ": " + grandChildCount);
    }
}
