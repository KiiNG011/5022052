public class Test {
    public static void main(String[] args) {
        Computer config1 = Computer.computerBuilder.builder()
                .setCPU("i7 13700k")
                .setRAM("16 GB")
                .setStorage("1 TB")
                .build();
        Computer config2 = Computer.computerBuilder.builder()
                .setCPU("Ryzen 7 7700x")
                .setRAM("32 GB")
                .setStorage("2 TB")
                .build();
        System.out.println(config1);
        System.out.println(config2);
    }
}
