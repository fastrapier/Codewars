package kyu_5.PaginationHelper;

import java.util.Arrays;
import java.util.List;

public class PaginationHelperUpgraded<I> {
    private final int itemPerPage;
    private final List<I> collection;
    public PaginationHelperUpgraded(List<I> collection, int itemPerPage) {
        this.itemPerPage = itemPerPage;
        this.collection = collection;
    }

    public int itemCount() {
        return collection.size();
    }
    
    public int pageCount() {
        return (int) Math.ceil(itemCount() / (float) itemPerPage);
    }

    public int pageItemCount(int pageIndex) {
        if (pageIndex >= pageCount() || pageIndex < 0)
            return -1;
        else if (pageIndex < pageCount() - 1)
            return itemPerPage;
        else
            return itemCount() % itemPerPage;
    }
    public int pageIndex(int itemIndex) {
        if (itemIndex > itemCount() || itemIndex < 0)
            return -1;
        else
            return itemIndex / itemPerPage;
    }

    public static void main(String[] args) {
        PaginationHelperUpgraded<Character> stringPaginationHelper = new PaginationHelperUpgraded<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'd', 's', 'q', 'a'), 3);
        System.out.println(stringPaginationHelper.pageIndex(3));
        System.out.println(stringPaginationHelper.pageIndex(7));
        System.out.println(stringPaginationHelper.pageIndex(1));
    }
}
