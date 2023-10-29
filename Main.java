public class Main {
    private double s;

    /**
     *
     * @param s
     */
    public Main(double s) {
        this.s = s;
    }

    /**
     *
     * @return
     */
    public double vk(){
        return s*s*s;
    }
    public void tampil (){
        System.out.println("volume kubusnya adalah : " + vk());
    }
    public static void main(String[] args) {
        Main obj = new Main(3);
        obj.tampil();
    }
}
