public class DuplicateElement {
    public void process(int[] arr) throws NegativeNumberExceptions {
        System.out.println("The unique elements are: ");
        for (int i = 0; i < arr.length-1; i++) {
            boolean isValid = true;
            for (int j = i + 1; j < arr.length; j++) {
                if ( arr[i] == arr[j]) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                System.out.println(arr[i]);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                throw new NegativeNumberExceptions("Array contains negative numbers");
            }
        }
    }
}
