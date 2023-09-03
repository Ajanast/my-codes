public class Vargs {
    int total;

    int sum(int... number) {
        for (int x : number) {
            total += x;
        }
        return total;

    }
}
