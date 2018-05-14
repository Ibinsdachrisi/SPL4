public class Game {

    public static void main(String[] args) {
        int [][] fieldI = new int [3][3];
        int bomben = 2;
        char [][] fieldC = new char [3][3];

        for (int i = 0; i < bomben; i++) {
            fieldI = setbomb(fieldI, RandField(fieldI.length));
        }

    }

    //Methode

    public static int[] RandField(int lenght){
        int [] zw = new int[2];
        zw[0] = (int) (Math.random()*lenght);
        System.out.println(zw[0]);
        zw[1] = (int) (Math.random()*lenght);
        System.out.println(zw[1]);
        return zw;
    }
    public static int[][] setbomb (int [][] fieldI , int [] cord){
        fieldI[cord[0]][cord[1]] = 1;
        return fieldI;
    }
    //public static void output()
}
