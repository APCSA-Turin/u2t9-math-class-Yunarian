package CoinFlip;
public class CoinFlip {
    
    public CoinFlip() {}

    public String flip() {
        if ((int) (Math.random() * 2) == 0) {
            return "Tails";
        }
            return "Heads";
    }

    public double simulate(int flips) {
        int heads = 0;
        for (int i = 0; i < flips; i++) {
            String coinSide = flip();

            if (coinSide.equals("Heads")) {
                heads++;
            }
        }
        return (heads / (double) flips);
    }

}
