public class ToysComparator implements Comparator<ToyShop> {
    @Override
    public int compare(ToyShop t1, ToyShop t2) {
        if (t1.getChance() < t2.getChance())
            return 1;
        if (t1.getChance() > t2.getChance())
            return -1;
        return 0;
    }