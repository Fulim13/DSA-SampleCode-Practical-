package entity;

public class Product implements Comparable<Product> {

    private int number;
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public Product(int number, String name) {
        this.number = number;
        this.name = name;
    }

    //Number (number)
//    @Override
//    public int compareTo(Product o) {
//        if (this.number > o.number) {
//            return 1;
//        } else if (this.number == this.number) {
//            return 0;
//        } else {
//            return -1;
//        }
//    }
    // String (name)
    @Override
    public int compareTo(Product o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.number;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        return this.number == other.number;
    }

    @Override
    public String toString() {
        return number + "\t" + name;
    }

}
