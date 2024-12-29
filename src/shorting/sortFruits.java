package shorting;

public class sortFruits {
    static void sort(String [] fruits){
        int n = fruits.length;
        for (int i =0; i<n-1; i++){
            int minIdx = i;
            for (int j = i+1; j<n; j++){
                if (fruits[j].compareTo(fruits[minIdx]) < 0){
                    minIdx = j;
                }
            }
            // swap
            String temp = fruits[i];
            fruits[i] = fruits[minIdx];
            fruits[minIdx] = temp;//
        }
    }

    public static void main(String[] args) {
        String [] fruits = {"kiwi", "apple", "papaya","mango" };
        sort(fruits);
        for (String i : fruits){
            System.out.println(i + " ");
        }

    }
}
