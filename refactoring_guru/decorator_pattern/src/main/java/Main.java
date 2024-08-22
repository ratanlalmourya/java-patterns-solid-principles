import decorators.CompressionDecorator;
import decorators.DataSource;
import decorators.DataSourceDecorator;
import decorators.EncryptionDecorator;
import decorators.FileDataSource;

public class Main {
    public static void main(String[] args) {
        
        String salaryRecord = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
            new EncryptionDecorator(
                new FileDataSource("out/OutputDemo.txt")
            )
        );
        encoded.writeData(salaryRecord);

        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecord);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}