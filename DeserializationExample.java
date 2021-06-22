import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.spec.ECField;

public class DeserializationExample implements Serializable
{

        private String name;
        DeserializationExample(String name)
        {
            this.name = name;
        }

        public static void main(String[] args)
        {
            try
            {
                DeserializationExample d = new DeserializationExample("GeeksForGeek");
                FileOutputStream f = new FileOutputStream("file.txt");
                ObjectOutputStream oos = new ObjectOutputStream(f);
                oos.close();
                f.close();
        }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
