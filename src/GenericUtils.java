public class GenericUtils<T> {
    public T[] reverse(T[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            T temp = array[i];
            int swapIndex = array.length - 1 - i;
            array[i] = array[swapIndex];
            array[swapIndex] = temp;
        }
        return array;
    }

    public static <T extends Number> double sum(T[] array) {
        if (array == null || array.length == 0) {
            return 0.0;
        }

        double result = 0.0;
        for (T element : array) {
            if (element != null) {
                result += element.doubleValue();
            }
        }
        return result;
    }
}