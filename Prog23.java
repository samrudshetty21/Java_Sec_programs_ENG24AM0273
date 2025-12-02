class TestGC {
    public void finalize() {
        System.out.println("Object destroyed by GC");
    }

    public static void main(String[] args) {
        TestGC obj = new TestGC();
        obj = null;
        System.gc();
        System.out.println("End of main method");
    }
}
