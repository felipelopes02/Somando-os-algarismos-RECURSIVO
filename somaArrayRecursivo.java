public static int somaArrayRecursivo(int[] arr, int index) {
    if (index >= arr.length) {
        return 0;
    } else {
        return arr[index] + somaArrayRecursivo(arr, index + 1);
    }
}
