package assignmentsFromTheLesson;

public class task002 {
    public static void main(String[] args) {
        getNumber(getArray());
    }

    public static int[] getArray() {
        int[] ar = new int [10];
        for(int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 2);
            System.out.print(ar[i] + " ");
        }
        return ar;
    }

    public static void getNumber(int[]array) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
                if (count > result) {
                    result = count;
                }
            }  else {
                count = 0;
            }
        }
        System.out.println();
        System.out.println(result);
    }
}
