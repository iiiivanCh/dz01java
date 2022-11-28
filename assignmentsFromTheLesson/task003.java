package assignmentsFromTheLesson;

public class task003 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int j = 0; j < nums.length; j++) {
        nums[j] = (int) (Math.random() * 5);
        }

        // int[] nums = { 0, 0, 4, 4, 0, 4, 2, 0, 0, 1, 1, 0, 2, 0, 0, 1, 2, 3, 1, 2, 4, 0, 3, 4, 1 };

        for (int e = 0; e < nums.length; e++)
            System.out.print(nums[e] + " ");
        System.out.println();

        int val = 2;
        int interim = 0;
        int end = nums.length - 1;
        int count = 0;
        int flag = 0;

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == val)
                count += 1;
        }

        if (count == 0) {
            System.out.print("В массиве нет чисел равных заданному: " + val);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (flag == count) {
                break;
            } else {
                if (nums[i] == val) {
                    while (nums[end] == val)
                        end -= 1;
                    interim = nums[end];
                    nums[end] = nums[i];
                    nums[i] = interim;
                    end -= 1;
                }
                flag = 0;
                for (int y = nums.length - 1; y > 0; y--) {
                    if (nums[y] == val) {
                        flag += 1;
                    } else {
                        break;
                    }
                }
            }
        }

        for (int e = 0; e < nums.length; e++)
            System.out.print(nums[e] + " ");
    }
}
