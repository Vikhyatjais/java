class Table {
    static int number;

    static void printTable(int n) {  
        number = n;
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
    public static void main(String[] args) {
        Table.printTable(5);  
    }
}

    

