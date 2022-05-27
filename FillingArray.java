 {class FillingArray {
    public static void main(String[] args) {
        String[] arr = new String[10];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = Integer.toString(arr.length - 1 - i);
        }
        for (String display : arr) {
            System.out.println(display);
        }
    }
}
}
