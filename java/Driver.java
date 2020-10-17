import tool.HistogramConsole;

public class Driver {
    public static void main(String[] args){
        try {
            Integer[] integers = new Integer[]{1, 2, -5, 15, 1, 6, 7, 8, 7, 10,15};
            Double[] dou = new Double[]{1.7, 2.9, 5.0, 6.6, 1.0, 6.9, 17.9, 8.2, 7.9, 10.0};
            Long[] lon = new Long[]{new Long("一月"), new Long("二月"), new Long("三月")};
//            HistogramConsole.echo(integers);
//            HistogramConsole.echo(dou);
            HistogramConsole.echo(lon);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
