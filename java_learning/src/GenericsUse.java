public class GenericsUse<K,V> {
    GenericsUse(K key, V value) {
        System.out.println(key);
        System.out.println(value);

    }

    public static void main(String[] args) {
      GenericsUse<String, Integer> gen = new GenericsUse<>("Pradeep", 24);
      GenericsUse<Integer, Integer> gen1 = new GenericsUse<>(76, 43);
    }

}
