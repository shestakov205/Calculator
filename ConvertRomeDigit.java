public class ConvertRomeDigit {

    public int ten(String s) {
        int x = 0;
        if (s.equals("I") || s.equals("i")) {
            x = 1;
        }
        if (s.equals("II") || s.equals("ii")) {
            x = 2;
        }
        if (s.equals("III") || s.equals("iii")) {
            x = 3;
        }
        if (s.equals("IV") || s.equals("iv")) {
            x = 4;
        }
        if (s.equals("V") || s.equals("v")){
            x = 5;
        }
        if (s.equals("VI") || s.equals("vi")){
            x = 6;
        }
        if (s.equals("VII") || s.equals("vii")){
            x = 7;
        }
        if (s.equals("IIX") || s.equals("iix")){
            x = 8;
        }
        if (s.equals("IX") || s.equals("ix")){
            x = 9;
        }
        if (s.equals("X") || s.equals("x")) {
            x = 10;
        }
        else System.out.println("not valid");

        return x;
    }
}
