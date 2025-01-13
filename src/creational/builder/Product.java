package creational.builder;

public class Product {
    private String requiredField1;
    private String requiredField2;
    private String optionalField1;
    private String optionalField2;
    private String optionalField3;

    public Product(String requiredField1, String requiredField2) {
        this.requiredField1 = requiredField1;
        this.requiredField2 = requiredField2;
    }

    private Product(ProductBuilder builder) {
        this.requiredField1 = builder.requiredField1;
        this.requiredField2 = builder.requiredField2;
        this.optionalField1 = builder.optionalField1;
        this.optionalField2 = builder.optionalField2;
        this.optionalField3 = builder.optionalField3;
    }

    public String getRequiredField1() {
        return requiredField1;
    }

    public String getRequiredField2() {
        return requiredField2;
    }

    public String getOptionalField1() {
        return optionalField1;
    }

    public String getOptionalField2() {
        return optionalField2;
    }

    public String getOptionalField3() {
        return optionalField3;
    }

    @Override
    public String toString() {
        return "Product{" +
                "requiredField1='" + requiredField1 + '\'' +
                ", requiredField2='" + requiredField2 + '\'' +
                ", optionalField1='" + optionalField1 + '\'' +
                ", optionalField2='" + optionalField2 + '\'' +
                ", optionalField3='" + optionalField3 + '\'' +
                '}';
    }

    public static class ProductBuilder {
        private String requiredField1;
        private String requiredField2;
        private String optionalField1;
        private String optionalField2;
        private String optionalField3;

        public ProductBuilder(String requiredField1, String requiredField2) {
            this.requiredField1 = requiredField1;
            this.requiredField2 = requiredField2;
        }

        public ProductBuilder optionalField1(String optionalField1) {
            this.optionalField1 = optionalField1;
            return this;
        }

        public ProductBuilder optionalField2(String optionalField2) {
            this.optionalField2 = optionalField2;
            return this;
        }

        public ProductBuilder optionalField3(String optionalField3) {
            this.optionalField3 = optionalField3;
            return this;
        }

        public Product build() {
            validate();
            return new Product(this);
        }

        private void validate() {
            if (requiredField1 == null || requiredField2 == null)
                throw new RuntimeException("Invalid product construction");
        }
    }
}
