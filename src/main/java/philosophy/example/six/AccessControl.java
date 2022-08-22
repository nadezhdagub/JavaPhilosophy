package philosophy.example.six;

public class AccessControl {
    // Генерирование серии [0..n)
    public static int[] range(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++)
            result[i] = i;
        return result;
    }

    // Генерирование серии [start..end)
    public static int[] range(int start, int end) {
        int sz = end - start;
        int[] result = new int[sz];
        for (int i = 0; i < sz; i++)
            result[i] = start + i;
        return result;
    }

    // Генерирование серии [start..end) с приращением step
    public static int[] range(int start, int end, int step) {
        int sz = (end - start) / step;
        int[] result = new int[sz];
        for (int i = 0; i < sz; i++)
            result[i] = start + (i * step);
        return result;
    }

    public AccessControl() {
        System.out.println("Конструктор Cookie");
    }

    void bite() {
        System.out.println("bite");
    }

    AccessControl x = new AccessControl();
    /// x.bite()j // Обращение невозможно

    private AccessControl(String ss) {}
    static AccessControl makeASundae() {
        return new AccessControl("sss");
    }

}
