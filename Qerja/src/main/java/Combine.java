public class Combine {

    public static void main(String[] args){
        int[] array1 = new int[4];
        int[] array2 = new int[4];
        int[] array3 = new int[4];

        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;

        array2[0] = 3;
        array2[2] = 6;
        array2[3] = 3;

        for (int i = 0; i < array1.length; i++){
            array3[i] = array1[i] + array2[i];
        }

        for (int i = 0; i < array3.length; i++){
            System.out.println(array3[i]);
        }




    }
}
