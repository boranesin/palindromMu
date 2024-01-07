public class Main {
    static boolean palindromMu(String str) {
        int bas = 0, son = str.length() - 1;
        while (bas < son) {
            if (str.charAt(bas) != str.charAt(son))
                return false;
            bas++;
            son--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(palindromMu("abba"));
    }
}