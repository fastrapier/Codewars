package kyu_5.PaginationHelper;

import java.util.Arrays;
import java.util.List;

public class PaginationHelper<I> {
    List<I> array;
    int itemsPerPage;
    int pages;

    /**
     * The constructor takes in an array of items and an integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.array = collection;
        this.itemsPerPage = itemsPerPage;
        this.pages = pageCount();
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return array.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        int pages = array.size() / itemsPerPage;
        if (array.size() % itemsPerPage > 0)
            pages++;
        return pages;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        int itemCounter = 0;
        int page = 0;
        for (int i = 0; i < array.size(); i++) {
            itemCounter++;
            if (pageIndex == page && itemCounter < itemsPerPage && array.size() - i > 1) {
                continue;
            } else if (pageIndex == page && (array.size() - i > 1 || array.size() - i == 1)) {
                return itemCounter;
            } else if (pageIndex == page)
                return itemCounter;

            if (itemCounter == itemsPerPage) {
                page++;
                itemCounter = 0;
            }


        }
        return -1;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (array.isEmpty())
            return -1;
        else if (itemIndex < 0 || itemIndex > array.size()) {
            return -1;
        } else if (itemIndex == 0) {
            return 0;
        } else {
            int counter = 0;
            int page = 0;

            for (I c : array) {
                if (counter == itemIndex) {
                    return page - 1;
                } else if (counter % itemsPerPage == 0) {
                    page++;
                }
                counter++;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        PaginationHelper<Character> stringPaginationHelper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'd', 's', 'q', 'a'), 3);
        System.out.println(stringPaginationHelper.pageItemCount(0));
        System.out.println(stringPaginationHelper.pageItemCount(1));
        System.out.println(stringPaginationHelper.pageItemCount(3));
        System.out.println(stringPaginationHelper.pageItemCount(5));
    }
}
