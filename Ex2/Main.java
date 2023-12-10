import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6, 64, 25, 12, 22, 11};

        SortPick sortPick = new SortPick();


        System.out.println("Bubble Sort:");
        sortPick.setSortingStrategy(new BubbleSort());
        int[] arrBubbleSorted = arr.clone();
        sortPick.performSort(arrBubbleSorted);
        System.out.println(Arrays.toString(arrBubbleSorted));


        System.out.println("Selection Sort:");
        sortPick.setSortingStrategy(new SelectionSort());
        int[] arrSelectionSorted = arr.clone();
        sortPick.performSort(arrSelectionSorted);
        System.out.println(Arrays.toString(arrSelectionSorted));
    }
}