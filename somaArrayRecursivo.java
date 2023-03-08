public static int somaArrayRecursivo(int[] arr, int index) {
    if (index >= arr.length) {
        return 0;
    } else {
        return arr[index] + somaArrayRecursivo(arr, index + 1);
    }
}

int[] arr = {1, 2, 3, 4, 5};
int index = 2;
int resultado = somaArrayRecursivo(arr, index);
System.out.println(resultado); // 12 (soma dos elementos 3, 4 e 5)

