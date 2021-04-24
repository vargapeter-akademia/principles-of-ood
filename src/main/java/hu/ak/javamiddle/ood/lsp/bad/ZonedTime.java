package hu.ak.javamiddle.ood.lsp.bad;

public class ZonedTime extends Time {

    private int offset;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public int getHours() {
        return (super.getHours() + offset) % MAX_HOURS;
    }

    @Override
    public int getMinutes() {
        return (super.getMinutes()) % MAX_MINUTES;
    }

}
