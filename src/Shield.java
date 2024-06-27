public class Shield {
    enum ShieldType {
        WOODEN(5), METAL(10), MAGIC(15);

        private final int value;

        ShieldType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}