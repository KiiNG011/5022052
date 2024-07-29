class Computer {
    private final String CPU;
    private final String RAM;
    private final String storage;

    private Computer(computerBuilder builder){
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }

    static class computerBuilder{
        private String CPU;
        private String RAM;
        private String storage;
        public computerBuilder(){

        }
        public static computerBuilder builder(){
            return new computerBuilder();
        }

        public computerBuilder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public computerBuilder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public computerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}
