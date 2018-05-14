public class Game {

    public static void main(String[] args) {
        //for (int y = 0; y < 1000000; y++){
            int [][] fieldI = new int [10][10];
            int bomben = 2;


            //

            for (int i = 0; i < bomben; i++) {
                fieldI = setbomb(fieldI);
            }
            output(fieldI);
            output2(fieldI);
            System.out.println("------------------");
        //}
    }

    //Methodes

    public static int[] RandField(int lenght){
        int [] zw = new int[2];
        zw[0] = (int) (Math.random()*lenght);
        //System.out.println(zw[0]);
        zw[1] = (int) (Math.random()*lenght);
        //System.out.println(zw[1]);
        //zw[0] = 3;
        //zw[1] = 3;
        return zw;
    }


    public static int[][] setbomb (int [][] fieldI2){
        int [][]fieldI = new int[fieldI2.length][fieldI2.length];
        int wid = 0;
        int[] cord = new int[2];
        do {
            wid = 0;
            cord = RandField(fieldI.length);
            if (fieldI[cord[0]][cord[1]] == 1) {
            wid = 1;
            }
        }while (wid == 1);
        fieldI[cord[0]][cord[1]] = 1;
        return fieldI;
    }


    public static void output(int [][] fieldJ){
        for (int i = 0; i < fieldJ.length; i++) {

            for (int j = 0; j < fieldJ.length; j++) {
                System.out.print(fieldJ[i][j] + " ");
            }

            System.out.println("");

        }
    }
    public static void output(String [][] fieldS){
        for (int i = 0; i < fieldS.length; i++) {

            for (int j = 0; j < fieldS.length; j++) {
                System.out.print(fieldS[i][j] + " ");
            }

            System.out.println("");

        }
    }
    public static void output2(int [][] fieldJ) {
        // fieldJ fieldS field2
        String[][] fieldS = new String[fieldJ.length][fieldJ.length];
        for (int i = 0; i < fieldJ.length; i++) {
            for (int j = 0; j < fieldJ.length; j++) {
                fieldS[i][j] = "[ ]";
            }
        }
        int[][] field2 = new int[fieldJ.length][fieldJ.length];
        for (int i = 0; i < fieldJ.length; i++) {
            for (int j = 0; j < fieldJ.length; j++) {

                if (fieldJ[i][j] == 1) {
                    if (i - 1 < 0 || j + 1 > fieldJ.length - 1) {

                    } else {
                        field2[i - 1][j + 1]++;
                    }
                    //
                    if (j + 1 > fieldJ.length - 1) {

                    } else {
                        field2[i][j + 1]++;
                    }
                    //
                    if (i + 1 > fieldJ.length - 1 || j + 1 > fieldJ.length - 1) {

                    } else {
                        field2[i + 1][j + 1]++;
                    }
                    //
                    if (i + 1 > fieldJ.length - 1) {

                    } else {
                        field2[i + 1][j]++;
                    }
                    //
                    if (i + 1 > fieldJ.length - 1 || j - 1 < 0) {

                    } else {
                        field2[i + 1][j - 1]++;
                    }
                    //
                    if (j - 1 < 0) {

                    } else {
                        field2[i][j - 1]++;
                    }
                    //
                    if (i - 1 < 0 || j - 1 < 0) {

                    } else {
                        field2[i - 1][j - 1]++;
                    }
                    //
                    if (i - 1 < 0 || i - 1 > fieldJ.length - 1) {

                    } else {
                        field2[i - 1][j]++;
                    }
                    //

                }
            }
        }
        for (int i = 0; i < fieldJ.length; i++) {
            for (int j = 0; j < fieldJ.length; j++) {
                if (fieldJ[i][j] == 1) {
                    field2[i][j] = 9;
                }
            }
        }
        //////
        for (int i = 0; i < fieldJ.length; i++) {
            for (int j = 0; j < fieldJ.length; j++) {
                if (field2[i][j] != 0 && field2[i][j] != 9) {
                    fieldS[i][j] = "["+ field2[i][j] + "]";
                }
            }
        }

        output(fieldS);
    }



}
