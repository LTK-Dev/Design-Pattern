public class SortPick {
    private SortingStrategy sortingStrategy;

    /**
     * Set sort.
     *
     * @param sortingStrategy s
     */
    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    /**
     * using sort.
     *
     * @param arr a
     */
    public void performSort(int[] arr) {
        sortingStrategy.sort(arr);
    }
}