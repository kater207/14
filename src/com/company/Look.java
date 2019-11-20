package com.company;

public class Look {
    public static void main(String[] args) {
        int index = search(new int[]{1,2,3,4,5,6,7,8}, 2);
        System.out.println(index);

    }
        public static int search(int[] array, int elementToSearch) {

            int index = 0;
            int lastIndex = (array.length - 1);

            while ((index <= lastIndex) && (elementToSearch >= array[index]) && (elementToSearch <= array[lastIndex])) {
                int pos = index + (((lastIndex - index) / (array[lastIndex] - array[index])) * (elementToSearch - array[index]));
                if (array[pos] == elementToSearch)
                    return pos;
                if (array[pos] < elementToSearch)
                    index = pos + 1;
                else
                    lastIndex = pos - 1;
            }
            return -1;
        }

}
